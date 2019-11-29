
| Abbr./Words   | Full           | 
| ------------- |:-------------:|
| AQL    | Acceptable Quality Levels |
| CoA    | Certificate of Analysis |
| IQ    | Installation Qualification |
| OQ    | Operation Qualification |
| PQ    | Performance Qualification |
| KPI    |  |
| URS    | User Requirement Specification |
| GMP    | Good Manufacturing Practices |
| GLP    | Good Laboratory Practices |
| GAMP | Good Automated Manufacturing Process |
| EM    | Environmental Manager |
| API | Active Pharmaceutical Ingredient |
| DPI | Dry Powder Inhaler |
| Excipient | An inert substance which is added to a drug to provide bulk, for example in tablets |
| FP | Finished Prod. |
| IPC | In Process Control |
| OOx | Out of xxx |
|     |  |
|     |  |
| FDS    | Functional Design Specification |
| FRS    | Functional Requirements Specification |
| DQ    | Design Qualification |
| MQ    | Maintenance Qualification |
| CQ    | Component Qualification |

# Lot Manager and Reporting

![img](https://github.com/tinonogood/Note/blob/master/img/LW_PS_LM_Structure.PNG)

## 15. Static Data Definition

### 15.5 Sample Plan

Back end Table: T_PH_SAMPLE_PLAN, T_PH_SAMPLE_PLAN_EN (entry), T_PH_SAMPLE_PLAN_AM (amount)

Define the number of samples to be generated for a Lot, depending on Number of Lot Containers and Lot Quantity, including Retained samples

T_PH_SAMPLE_PLAN

| Field   | DESC           | 
| ------------- |:-------------:|
| Version |  |
| Active |  |
| Group Name | Mandatory, security group |
| Plan Note | Optional RTF note, reporting purpose |
| Approval Group | List field used for approvals ?? |
| Ready For Approval | set to true to initiate an approval routing |

T_PH_SAMPLE_PLAN_EN

| Field   | DESC           | 
| ------------- |:-------------:|
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |
| Version |  |

T_PH_SAMPLE_PLAN_AM

| Field   | DESC           | 
| ------------- |:-------------:|
| Version |  |


# More Template

T0039 Standard and Reagent Inventory


# Error Fix

Training Env Error

`1275-3.1.0 Customer Kit_Labware 7: Product Review Report -> Subroutine: VWF_FN_REPORT -> Subroutine: FN_RPT_PRODUCT_REVIEW_BG & Subroutine: QT_PRODUCT_REVIEW_PHK -> ... -> Subroutine: FN_ERROR_TRAP: Error Message: Chart to JPG failed: ... Exception occurred. ( HRESULT DISP_E_EXCEPTION ) File not found: ijl15.dll ' nil nil nil 'F' nil nil 'T' nil nil) `

Possible Cause: WA Quality Analyst Support is not properly installed

Fix: Put ijl15.dll to  working dir.


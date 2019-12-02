
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
| Excipient | An inert substance which added -> drug to provide bulk |
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
| Description |  |
| Spec Type | Mandatory , Cross references w/ Product Spec, Test Location |
| Stage | Mandatory , Cross references w/ PRODUCT_GRADE_STAGE |
| Algorithm | Mandatory  |
| Fixed Samples/Containers |  |
| Log Sample |  |
| Create Inventory | created for Retain sample |
| Retained Sample | Retain sample will be displayed on the lot |
| Stability |  |
| Initial Status |  |
| Num Samples | defining the fixed number of samples for 'Fixed' Algo. |
| Quantity |  |
| Units | Optional text field |
| Recert Quantity |  |
| Reduced Quantity |  |
| Fixed Samples |  |
| Fixed Containers |  |
| Printer  |  |
| Login Label  |  |
| Receipt Label  |  |
| Labels Per Sample |  |

| Field   | TABLE Linked        | 
| ------------- |:-------------:|
| Spec Type | T_PH_SPEC_TYPE |
| Stage | T_PH_STAGE |

| Algorithm   | TABLE Linked        | 
| ------------- |:-------------:|
| SP_FIXED |  |
| SP_ALL |  |
| SP_ROOTN_P1 |  |
| SP_QUAN | From table based on lot quantity |
| SP_QUAN_CONT | From table based on lot containers |
| SP_AQL | Calc. from AQL Sampling |

T_PH_SAMPLE_PLAN_AM

| Field   | Description           | 
| ------------- |:-------------:|
| Version |  |
| Version |  |
| Version |  |
| Version |  |


# More Template

T0039 Standard and Reagent Inventory


# Error Fix

Training Env Error

`1275-3.1.0 Customer Kit_Labware 7: Product Review Report -> Subroutine: VWF_FN_REPORT -> Subroutine: FN_RPT_PRODUCT_REVIEW_BG & Subroutine: QT_PRODUCT_REVIEW_PHK -> ... -> Subroutine: FN_ERROR_TRAP: Error Message: Chart to JPG failed: ... Exception occurred. ( HRESULT DISP_E_EXCEPTION ) File not found: ijl15.dll ' nil nil nil 'F' nil nil 'T' nil nil) `

Possible Cause: WA Quality Analyst Support is not properly installed

Fix: Put ijl15.dll to  working dir.


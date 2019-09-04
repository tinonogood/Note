# 12.Analyses

## Analyses Concept

| Static        | Dynamic           | 
| ------------- |:-------------:|
| Analysis      | Test |
| Components      | Results      | 

Accessing Test/Results Errors when Analysis, Components changed or deleted. Do version change!

Resample if the revised test need to apply

## Analyses Table

### Analysis

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Version      | track version, up to 2000 |
| Reported Name| name used reports, w/ case, unique |
| Common Name  | required, same name w/ diff. methods achieving same result |
| Analysis Type| group similar types of analyses, required |
| Alias Name | name of the same analysis in an external system |
| Lab      | provide additional security for Recv, Prep and Revw Tests, not desired |
| Inst Group      | narrow the list of instruments assigned to a test |
| Instrument       |  |
| Test Location      |  |
| Expected Date      | expected time interval for results from this analysis |
| Group Name      | group the analysis record belongs to |
| Cost Units      | cost as a normalized rate for doing the test |
| Reqd Volume      |  |
| Destructive       | aliquots, True: sample material is destroyed when running the analysis |
| Parameter Name / Tag     | prompt additional information |
| Display Message      |  |
| Key Contact      |  |
| Ext Link      |  |
| Active       | the highest version with the Active flag = True will be used |
| Test Template      |  |
| Batch Link      |  |
| AUTO_AUTHORIZE /AUTO_REJECT      |  |
| Calc on Save|  |
| ...| ... |

### Components

Configure Section

| Fields        | DESCR           | 
| ------------- |:-------------:|
| data type        | |
| Reps        | number of replicates ,0:not used |
| Properties  | open Component Properties Dialog |
| Other Fields | access fields added to the Component table by SA |
| Rename   | |
| Has Attributes | needs to be added to both ANALYSIS & RESULT table, Up to 20 |
| Uses Instr | controls whether the Instrument field is active at result entry |
| Allow Cancel | enable: allowed to cancel a result |
| Optional         | enabled: the component is optional and does not require a value to be entered |
| Reportable  | whether should be included in user written reports |
| Displayed   | whether the component will appear at result entry |

|      Component Codes   |            | 
| ------------- |:-------------:|
| Code   | alpha-numeric character up to 10 chars |
| Value    | numeric value or an open ended number |

|      Component Factors   |    associated with each "replicate" of a component | 
| ------------- |:-------------:|
| Value   | alpha-numeric character up to 10 chars |
| operator     |  blank or *, /, //, +, - |

File Name Component Properties

Date, DB File Name, Interval, RTF Note, HTML Note, and DateTime Component Properties

List, List Allow User Entry Component Properties

#### Numeric Components Properties

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Alias       | name of the same component in an external system |
| CAS #       | chemical abstract number |
| Units        | |
| Round Result Value and Decimal Places |  |
| Min/Max Value       |  |
| Allow out of Limit       | True: Out of limit may be entered, inadvertent error prevention |
| Clamp Low/High      | a=1 Clamp lo=2 -> a=2; a=100 Clamp Hi=50 -> a =50 |
| Format Calculation | LIMS Basic routine |
| Browse Subroutine | subroutine that can be executed |

Exponential Component Properties

Standard Component Properties

Calculated Component Properties

# 13. Product Specifications

## Specifications Concepts

|    LEVEL |      DESCR      | 
| ------------- |:-------------:|
| Product        |            | 
| Grade / Sampling Point | different Quality or customer requirements / ... | 
| Stage / Analysis        | Critical Step in the process/  ...  | 
| Specification         | Result level information | 

## Specifications Table

### Product 

### Grade 

### Stage

### Specifications

### Numeric Specification Limits 

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Rule       | limit equation: Result > MIN, >= MIN, < MAX... |
| Min/Max       |  |
| Description        |  |
| Required        | uesd w/ Lot Manager, True: uesd in the evaluation of the Lot meets testing requirements |
| Spec Class        | Result, Lot Result, or Any Result |
| Result Replicates       |  |
| Units        |  |
| Rounding and Places       | [Numeric Component Properties](./LW7.md#numeric-components-properties) |
| Lo_Control_1       |  |
| Hi_Control_1       |  |
| Lo_Control_2       |  |
| Nominal Value       | not used by the LIMS but used to record the nominal value for reporting purposes |
| Reported Name       | default to the Result Name |
| Num History Pts       | used to record for trend plot |
| Season        |  |
| Factor Values/Operator      | to midify formatted value |

# 2. System Wide Functionality

## Sample List Display

## Business Rules

### Review Rules 

### Analysis Rules

### Instruments Rules

### Auditing Rules

### Logon Rules

### Database Tables Rules

### Specifications Rules

## Status Rules

To ctrl status change for Samples, tests or results.

Supported Functions: Authorize, Cancel, Full activate, Reject, Release, Restore, Unrelease

Rule types: CONTINUE_ / ALLOW_

## System

### Client Configuration

| Fields        | DESCR           | 
| ------------- |:-------------:|
|AlterInterval|How often checks for alert messages to current user, in Sec |
|Background Server| act as a Background Server? |
|CheckActions| determines if LabWare uses this client to check for pending actions |
|Client Name| name of the computer running LabWare, default: current client machine name |
|File Import Directory|the directory where import files will be located |
|Import Files | Yes, import directory will be polled every 15 seconds  |
|Label Print Type||
|Save LabStaion Samples||
|WebLIMSAutoStart||

### Server Configuraation

### Command Line Configuration

| arguments     | DESCR           | 
| ------------- |:-------------:|
| SN |  ODBC Data Source Name, Server Name |
| WS |  Workstation Name, Client Name |
| UN | Login Username |
| PW | Login Password |
| DU | DB Username |
| DP | DB Password |
| WD | working directory |
| BD | bind file |
| BSN | bg server name |
| BSP | bg server path |
| TS | mimicking terminal server path |

TS

0:  runs in non-terminal/non-citrix mode - use the "Start In" folder of the shortcut as the working folder 

1:  runs in terminal/citrix mode.  Creates terminal served subfolders in the client directory and uses GMT Offset and Daylight Savings settings from the LabWare user record

2: like 1?

-------------------------

Plz Review 2.16!!!!

----------------------------

# 3. Security and Auditing

## Data Security

### User Constraints

## LDAP Security Option

Integrates w/ LDAP in 5 functional elements: Authentication,  User Field Mapping, LIMS Roles, Auto Creation of Users &  Credential Caching

## General Auditing Concepts 

### Standard Content of Audit Records 

| Contents     | DESCR           | 
| ------------- |:-------------:|
| Event Type  |  |
| Action  |  |
| User  |  |
| Audit Time Stamp  | GMT,  |
| Reason  | Audit reason was provided at the time. Otherwise,  “No reason specified”  |
| Database Entries  |  |
| Child Records  |  |

## User Management

### Table Fields

| Fields     | DESCR           | 
| ------------- |:-------------:|
| ... | ... |
| Timeout Interval | Remain idle before the system auto. Log Out. Value is in minutes (0~10000) |
| Lock on Timeout | Locked out |
| Lock Timeout | Remain idle before the system auto. Lock Out. Value is in minutes (0~10000) |
| Close Link | link is closed to the database when the user logs out  |
| User Disabled |  |
| Allocate License | Reserve a slot in the LIMS license, the user will always be able to log in |
| LDAP | Lightweight Directory Access Protocol, refer to [LDAP Security Option](./LW7.md#ldap-security-option) |
|  |  |
| GMT Offset | in Minutes, Check DB's GMT time & OS's (on LIMS Instance) time |
| Daylight saving |  |
| Sample Constraint | The defined constraint is appended to the SQL call, refer to [User Constraints](./LW7.md#user-constraints) |
| Test Constraint |  |
| Result Constraint |  |
| Sample Disp Flds | Set of sample information to which the user is restricted, refer to [User Constraints](./LW7.md#display-fields), Use Sample Display Fields |
| Test Disp Flds | Use Test Display Fields |
| Restricted Use | Flag user accounts that may have limited access to the system based on the license agreement |
| Use Customer Template | Use customer templates when viewing Projects, refer to [Project Manager](./LW7.md#project-customer-views) |
| Holiday Schedule  | link to Holiday Schedule table |
| Open Msg Window  |  |
| Token Serial No | Define the serial number for a user’s token(=the key that is inserted in the USB port) |
| Address Book | Refer to [Managing Contacts](./LW7.md#address-book) |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
| Sso Uid | Identity Provider Userid for SSO (Single Sign-On), 單一登入,不用對每個單一系統都逐一登入 |
| ... | ... |

#### User Configuration Dialog

Analyses button: only enabled @ Business Rule: Operator analysis approval required = True

Instrument button: only enabled @ Business Rule: Operator instrument approval required = True

Lab, Sample/Project Filter -> Role

Analysis, Instrument -> User 

Login by Role can let LIMS administrator to configure the menus and toolbars 

# 4. Static Data Management

## Table Master

Table Master is a special table in the database that tells LIMS how to deal with each table in the database.

A layer that exists between the database and the LIMS

### Table Master Fields

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Pretty Name  |  |
| Insert Flag  | "T" + User's  InsertIntoStaticTables privilege ->  may insert records into the table on the fly |
| Uses Editor  |  Be accessed using the Table Manager editor, set to false for all child tables |
| Configure Dialog  |  |
| Key  | defines the keys for the table |
| Description  |  Multiple fields may be defined |
| Group  | security  |
| Browse Entire Table  | Controls the browse action on tables, Browse Pages or One scroll down page |
| Wizard Fields | hierarchical browse |
| Report Name  |  |
| Parent Table  |  |
| User Added  | User Added tables can be Updated/Deleted via LIMS Basic SQL statements. |
| Approval Routing |  |
| Dynamic | flag the tables that are considered Dynamic |
| Table Group  |  |
| Bitmap  | custom bitmap to appear in the tree view of Explorer Table Manager, 24x16 Bitmaps directory |

### Table Field Properties Dialog 

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Field Type  |  |
| Link Table  | conjunction w/ Text data type,  to link a data field to a table |
| List Key  | conjunction w/ List or MultiList data type, to link a data field to a list |
| Where Clause | only for fields of Text data type that are linked to another table  |
| Hidden  | Appears in the table editor |
| Mandatory  |  |
| Reset To Null |  |
| Default Value  |  |

# 5. Managing GUI

## Display Fields

## Menus and Toolbar

### Adding User Defined Menus

Must be an entry in NLS file. [Valid Formats](./LW7.md#valid-formats-for-arguments)

Check \*NLS_Build > Find "...MainMenu..." at which NLS.txt file > Add/modify New NLS key-value pair 

## Visual Workflow Table

Config. > External Link Directories > Visual Workflow Files

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Menu Title | Define the title for the Workflow tab |
| Open On Login |  |
| Group |  |
| Page File | KT01295, use HTML page file as VW |
| Log Out On Close  |  User be logged out once the Workflow window is closed |
| Open New Window  | New Visual Workflow tab or ibsuade current one, not replace it |
| Update Frequency   | 0: not refresh, interval (in seconds) refresh element w/ Refresh = True |
| Background Image  |  |
| Css File  |  |
| Css Dir Path  |  |
| Head Tags | Used to inject JavaScript into the HTML generated by the visual workflow |
| Thumbnail   | Define an image.gif that depicts the workflow? |
| User Constants   | Define LIMS Constants utilized by the workflow |
| Update Entire Wkflw  | Elements with Refresh = True or Entire will refresh  |
| Pre Visualworkflows  | Specifies one or more VWs that can be included on the current VW, inserted into the HTML Prior. |
| Post Visualworkflows | Like Pre Visualworkflows, but inserted into the HTML After |

## Visual Workflow Designer

### Configuring Workflow Elements

#### Visual Workflow Element Properties 

## National Language Support NLS

Allows any object of the presentation layer (UI) to be modified

Integrate and Support multi language systems

### Creating and Implementing NLS Files 

File Name: X_NLS-Y.TXT   eg.: ES_NLS-XTRA.TXT 

X: Language prefix, Y: Specific File Name

File can be either @ sever/working directories.

X_NLS.OBJ file must be REBUILT, when changes NLS file.

#### NLS File Configuration 

Comments are delineated by /* and * /,  Blank lines are acceptable

 “&” is used to define where the underscore is located on the text.  eg. DialogOK "&OK"
 
#### Accelerator Key Configuration 

Ctrl+\<a letter> to quickly access specified menu functions. eg. FolderManagerFileMenuNew     "&New...   ^^Ctrl+N" 

Only one Ctrl+ \<a letter> can be used for each interface

Cannot:  Ctrl+X, Ctrl+C, and Ctrl+V

#### 

# 7. Sample Login

## Sample Login 

### Log Samples 

#### Log From Sample

Provides the user with the ability to CLONE samples

#### Resample

Linked back by Parent Sample and Original Sample fields

## Batch Login

## Standard Template Login 

## Sample Login Template Table

### Table Fields

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Group Name  | security group |
| Title | Title of Interface Window |
| Initial Status |  |
| Id Config |  |
| Edit Tests | Edit Tests Option box at sample login |
| Enter Results |  |
| Label Id  |  |
| Receipt Id  | Receipt report to be printed  |
| Ext Link  | to an external file |
| Add Product Tests | Automatically add Test to the sample based on the Product or Prod Grade (Grade > Prod) |
| Add Spec Tests | Auto. add Test to the sample based on Product Specification.|
| Override Optional | Conj. w/ Add Spec Tests, override components field refer to [Components Dialog](./LW7.md#components-dialog) |
| Background Login | Background Server |
| Override Displayed | override components field refer to [Components Dialog](./LW7.md#components-dialog) |
| Override Reportable  |  |
| Use Anal Limits  | Analysis Limits will only be applied if this field is set to True, refer to [Analysis Table](./LW7.md#analysis-table) |
| Aliquot On | Conj. w/ Auto Aliquoting functionality, refer to [Sample Aliquots](./LW7.md#sample-aliquots) |
| Aliquot Subroutine | Define a subroutine to generate the HTML for display in the Aliquot Dialog pop-up |
| Label Mask | Define a custom sample identifier in the LIMS |
| Sample Event Fields | Integer, to group sample by fields in e.g, PROJECT,SAMPLE_TYPE,SAMPLED_DATE |
| Use Sample Rules | Refer to [Sample Rules Manager](./LW7.md#sample-rules-manager) |
| Max Num Samples |  |
| Batch Receipt | Default hidden @ Admin1, Only functional with Group Login, Print report at Group Login window is closed |

# 8. Sample Administration

## Sample Aliquots

# 11. Reporting

## Access Routine Table

Access Routines define the scpoe for the Query Tag

| type|Arguments| Routine field| 
| ------------- |:-------------:|:-------------:|
| Folder      | Provide a list of fields that can be used in a Query Tag | SAMPLE, TEST or RESULT folder |
| Table      | fields are required by the Built-in routine |  |
| List      | fields are required by the Built-in routine |  |
| Report      | Provide a list of fields that can be used in a Query Tag | Crystal Report Name  |
| Single Value | fields are required by the Built-in routine |  |

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Group Name    | which security group the Access Routine record belongs |
| Num Args    | the number of arguments required |
| Type     | defines the return value type: F, T, L R, S |
| Argument1 ~20    | the arguments passed to the tag routine, [Valid Formats](./LW7.md#valid-formats-for-arguments) |
| Routine  | the LIMS routine or Crystal report which is associated with the Access Routine |

### Valid Formats for Arguments

| Argument Format | Function | 
| ------------- |:-------------:|
| Table.Field    | exactly match, not case sensitive |
| Table.Field </<=/>/>= | compared values passed to the Query Tag |
| @MyFormula | passing a value to a Crystal Report formula field |
| Order By |  |
| SQL |  |
| STORED_QUERY | Stored query must return the appropriate objects |
| SUBROUTINE |  |

## Query Tags Table

get information from the LIMS

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Type    | Folder, Browse, List, Prompt, Report, Table, Single Value, Prompt List, Bar Code, Object Link, NonInteractive |
| Group Name  | which security group the Access Routine record belongs |
| Report Type | used only with Query Tags of type Report,  “Batch Reports”, “Inventory Reports” and “Stability Reports” |

# 12.Analyses

## Analyses Concept

| Static        | Dynamic           | 
| ------------- |:-------------:|
| Analysis      | Test |
| Components      | Results      | 

Accessing Test/Results Errors when Analysis, Components changed or deleted. Do version change!

Resample if the revised test need to apply

### Cross Sample Calculations

## Analysis Table

### Analysis Table Fields

| Fields        | DESCR           | 
| ------------- |:-------------:|
| \* Version      | track version, up to 2000 |
| \* Reported Name| name used reports, w/ case, unique |
| \* Common Name  | required, same name w/ diff. methods achieving same result,  |
| \* Analysis Type | group similar types of analyses, Required |
| Alias Name | name of the same analysis in an external system |
| \* Lab | provide additional security for Recv, Prep and Revw Tests, not desired |
| \* Inst Group      | narrow the list of instruments assigned to a test |
| \* Instrument       | Default instrument |
| Test Location      |  |
| \* Expected Date   | expected time interval for results from this analysis |
| \* Group Name      | group the analysis record belongs to |
| Cost Units      | To Calc. Cost conj. w/ Cost Factor @ Customer table |
| \* Reqd Volume      | Store the sample volume required to run the analysis.  This field is used when creating aliquots of a sample |
| Destructive       | aliquots, True: sample material is destroyed when running the analysis |
| Parameter Name / Tag     | prompt additional information |
| Display Message      |  |
| Key Contact      |  |
| \* Ext Link      |  |
| \* Db File |  |
| \* Active | the highest version with the Active flag = True will be used |
| Test Template      |  |
| \* Batch Link      | To group analyses together for batching |
| AUTO_AUTHORIZE/AUTO_REJECT      |  |
| Calc on Save |  |
| \* Aliquot Group  | Used to group tests when automatically aliquoted, Refer to [Sample Aliquots](./LW7.md#sample-aliquots) |
| \* Split Replicates | True-> aliquots are created to hold each occurrence of the analysis when automatically aliquoted, Refer to [Sample Aliquots](./LW7.md#sample-aliquots) |
| \* Cross Sample  | Refer to [Cross Sample Calculations](./LW7.md#cross-sample-calculations) |
| Store Incmp Opts  |  |
| \* Sample Type/ Container Type/ Storage Condition |  Use with Order Manager,Order Manager will automatically create a distinct sample for each combination of Sample Type, Container Type and Storage Condition, define storage area |
| Approval Role |  |
| Quick Code |  |
| \* Volume Units | Used as a reference to calculate the required sample volume |
| Hide On Order Form |  |
| Test Sequence No |  |

### Components Dialog

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
| Allow Cancel | enable: allowed to cancel a result during result entry |
| Optional | enabled: the component is optional and does not require a value to be entered |
| Reportable  | whether should be included in user written reports |
| Displayed   | whether the component will appear at result entry |

#### Properties

|      Component Codes   |     alpha-numeric value -> numeric value       | 
| ------------- |:-------------:|
| Code   | alpha-numeric character up to 10 chars |
| Value    | numeric value or an open ended number |

|      Component Factors   |    associated with each "replicate" of a component | 
| ------------- |:-------------:|
| Value   | alpha-numeric character up to 10 chars |
| operator     |  blank or *, /, //, +, - |

#### File Name Component Properties

#### Date, DB File Name, Interval, RTF Note, HTML Note, and DateTime Component Properties

#### Text Component Properties

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Alias       | name of the same component in an external system |
| CAS #       | chemical abstract number |
| Format Calculation | Formatting on a result entry to formatted entry, Refer to [Format Calculation Table
](./LW7.md#format-calculation-table) |
| Trigger Browse | subroutine that can be executed |

#### List, List Allow User Entry Component Properties

#### Numeric Components Properties

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Alias       | name of the same component in an external system |
| CAS #       | chemical abstract number |
| Units        | |
| Round Result Value / Decimal Places | Rounding rules to be applied, only rounding to 8 decimal places |
| Min/Max Value       |  |
| Allow out of Limit       | True: Out of limit may be entered, inadvertent error prevention |
| Clamp Low/High      | a=1 Clamp lo=2 -> a=2; a=100 Clamp Hi=50 -> a =50 |
| Format Calculation | Formatting on a result entry to formatted entry, Refer to [Format Calculation Table
](./LW7.md#format-calculation-table) |
| Trigger Browse | subroutine that can be executed |

#### Exponential Component Properties

#### Standard Component Properties

#### Calculated Component Properties

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Alias       | name of the same component in an external system |
| CAS #       | chemical abstract number |
| Units        | |
| Round Result Value / Decimal Places | Rounding rules to be applied, only rounding to 8 decimal places |
| Min/Max Value       | Over the limit -> In red |
| Auto-Calc | Auto exec. when required input enter, false: right click -> refresh or duble click |
| Clamp Low/High      | a=1 Clamp lo=2 -> a=2; a=100 Clamp Hi=50 -> a =50 |
| Format Calculation | Formatting on a result entry to formatted entry, Refer to [Format Calculation Table
](./LW7.md#format-calculation-table) |
| | |
| Factors | Refer to [Properties](./LW7.md#properties) |
| Code |Refer to [Properties](./LW7.md#properties) |
| Calculation | Refer to [Component Calculations ](./LW7.md#component-calculations) |

#### Component Calculations 

2 parts: Input, Equation

##### Input

Add Calcualation Variable, 7 types of input variables

1. Component

Calculation Variable Dialog 

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Analysis | Limited to a specific analysis |
| Trigger | When the calculation triggers for Update |
| Scope | Which test / component reps are used in defining the calculation variable |
| Value | Defines which field from the result record  |
| Output | How the results that have been selected are returned |

2. Factor

Values previously defined in the "Calculation Factors" table

3. Standard/Reagent 

provides access to standard/reagent data

4. Dependent Sample 

Provides access to another sample that is either the parent or the child of the current sample (created in Batch Manager). 

5. Batch Component

Provides access to batch level components

6. Batch Sample

Provides information from samples in the same batch as the sample for which this calculation is being executed

7. Worksheet

Not actively supported in the current version of the LIMS

### Analysis Variations 

Variations of an Analysis w/ Slight change in the component properties

### Component Variations 

To provide variations on component properties

### Analysis Limits

## Analysis Rules Table

## Analysis Types Table

## Calculation Factors Table

## Common Name Table

## Format Calculation Table

## Test Lists Table

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Group Name |  |
| Ext Link  |  |
| Set Rslt Order No | Sets Result Order Numbers to  |
| Approval Role |  |

### Test List Entries  

#### Test List Entry Properties 

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Instrument  |  |
| Test Priority  | 0:lowest~ 1000:highest, Refer to the Sample Aliquots |
| Test Location  |  |
| Std Test | specify standard / optional |
| Replicate Count |  |
| Assign If Present  | Whether the test is added if replicates of the test are already present on the sample |
| Variation  |  |
| Reported Name |  |
| Reported  |  |

## Test Location Table

# 13. Product Specifications

## Specifications Concepts

|    LEVEL |      DESCR      | 
| ------------- |:-------------:|
| Product        |            | 
| Sampling Point / Grade | Corresponds to a critical step in the process / different Quality or customer requirements | 
| Stage / Spec Type / Analysis | particular analysis at different testing conditions/ special circumstances / Analysis | 
| Specification | Result level information | 

The use of NONE for Sampling Point, Stage and Spec Type 

NONE's spec will be included to the other non-NONE's spec at same level

Result Entry Window: Function > View Spec. Limits or Toolbar icon

Fail Indicator column: high:>>>; low:<<<; not equal:<>

5 Cat. of specifications: *Numeric, *Text, *Formula, *SPC and *Reported

Formula Spec not show value @ Result Entry Window, but first line -> 1st line be comment

Reported Spec no Failure indicator

### Control Limits

@ PRODUCT_SPEC table w/  LO_CONTROL_1, HI_CONTROL_1 ... Up to 5 sets.

Can have qualifiers (<,>,<=,>=). If no, just like < or >

### Imposing Limits w/o Using Specifications 

MIN_LIMIT, MAX_LIMIT @  RESULT table, no associated w/ Product or Grade 

Can be set using Analysis Limits, refer to [Analysis Limits](./LW7.md#analysis-limits), Test list or LIMS Basic funnc  (SETMINLIMIT, SETMAXLIMIT)

TEXT_LIMIT @ Result Table

| Format        | Meaning           | 
| ------------- |:-------------:|
| X | Equal to X |
| ~X | Not equal to X |
| X,Y | Either X or Y |
| ~X,Y | Neither X or Y |
| X* | Like X... |
| ~X* | Not like X... |

#### Support for Ad-Hoc Low and High Control Limits 

LO_CONTROL and HI_CONTROL @ RESULT table

### Skip Lot Testing 

Vary by LOT, can vary according to the product, the product grade or the supplier

1. Product and Product Grade dialogs in Product Specifications 

2. Suppliers table

Precedence: Supplier table > Product Grade table > Product

Partial flag @ Product Grade Stage : analysis is subject to Skip Lot Testing or not

Keep track by PRODUCT.LOTS_TO_GO, PRODUCT_GRADE.LOTS_TO_GO and SUPPLIER.LOTS_TO_GO 

Test under product grade w/ Always check=True noo Skip Lot Testing functionality

### Seasonal Product Specifications 

### Child Tables for Products 

### User defined child tables on Product Spec records 

### Locking Records 

## Product Specifications Designer 

@ Configure menu, organizes the information into multiple tabbed views

Levels: Product, Grade/Sampling Pt, Stage/Analysis/Spec type and Product Specificatio

Level view's Availability Depend on Product Template (Show Grades, Show Sampling Pnts and Show Stages)

Fields at below views refer to [Product Specifications Table](./LW7.md#product-specifications-table)

## Product Specification Editor 

@ Configure menu > Modify Product Spev

## Product Specifications Table

| Fields        | DESCR           |
| ------------- |:-------------:|
| Version  |  |
| Code | Associating the product specifications with manufacturing product codes |
| Cost Factor  | For accounting purposes |
| Group Name    | |
| Ext Link   |  |
| Test List   | Tests associated with this product, be Auto @ "Sample Login Template"."Add Product Tests" = True |
| Full Test Frequency | For skip lot testing only for Lot Manager |
| Lots to Go | Lot... |
| Report Format |  |
| Active |  |
| Sample Plan | Lot... |
| Effective Date | Approval Manager... |
| Approval Group   | Approval Manager... |
| Ready for Approval | Approval Manager... |
| ... temp | for view... |
| Signed |  |

### Product Grade Sampling point

#### Product Grade Properties Dialog 

Define the properties of a grade/sampling point

| Fields        | DESCR           |
| ------------- |:-------------:|
| Sampling Point  |  |
| Grade |  |
| Description  |  |
| Continue Checking  | How the Product spec. are checked at result entry. True + w/ Product -> all other grades will check |
| External Link |  |
| Test List | Test List from the Product Grade will be assigned to the sample (Grade > Product), refer to [Sample Login Template Table](./LW7.md#sample-login-template-table) |
| Always Check | Force a particular product grade/sampling point to always be checked for spec. compliance |
| Full Test Frequency  |  |
| Lots to Go  |  |
| Report Format  | When run from lot manager ( Customer > Grade > Product) |

### Product Geade Stage

@  PROD_GRADE_STAGE table

Define the analyses to be tested

| Fields        | DESCR           |
| ------------- |:-------------:|
| Stage |  |
| Analysis |  |
| Description |  |
| Spec Type | Define a sampling plan associated with the stage/analysis, For Additional testing |
| Num Reps  | Required number of test replicates , refer to [Sample Login Template Table](./LW7.md#sample-login-template-table) |
| Partial  | Define whether this stage/analysis is required under partial testing for Lots |
| Ext Link  |  |
| Reported Name  |  |
| Variation | Associate an Analysis variation with the stage/analysis |
| Required  | Not used by the system at this time |

### Specifications

5 types: *Numeric, *Text, *Formula, *SPC and *Reported

#### Numeric Specification Limits 

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Rule       | limit equation: Result > MIN, >= MIN, < MAX... |
| Min/Max       |  |
| Description        |  |
| Required        | uesd w/ Lot Manager, True: uesd in the evaluation of the Lot meets testing requirements |
| Spec Class        | Result, Lot Result, or Any Result |
| Result Replicates       |  |
| Units        |  |
| Rounding and Places | [Numeric Component Properties](./LW7.md#numeric-components-properties) |
| Lo_Control_1       |  |
| Hi_Control_1       |  |
| Lo_Control_2       |  |
| Nominal Value       | Not used by the LIMS but used to record the nominal value for reporting purposes. Nominal Value: 1A; Measured Value: 0.98~1.02A |
| Reported Name       | default to the Result Name |
| Num History Pts       | used to record for trend plot |
| Season        |  |
| Factor Values/Operator      | to midify formatted value |

#### Text Specification Limits 

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Rule       | Equal to, Not Equal to, Result is Like, Result is One of ... |
| Specification  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |
|  |  |


#### Formula Specification Limits 

Limit testing rules which are based on a user defined equation

#### Reported Specification Limits 

Whether or not a value passes the Reported limits does not affect the in spec status of a sample, test, or result. 

#### SPC Specification Limits 

???

## Product filter Table

## Product Template


## Sampling Point Table

## Season Table

# 14. Organizing Data

Folders: View SAMPLE, TEST and RESULT in Folder Manager

Create from Folder Template table, Query based on Query Tag/ Search Template

| Func        | DESCR           | 
| ------------- |:-------------:|
| Rebuild       | reset Query Tag & Search Template |
| Refresh       | the saved Folder Query can be run / filter values prompts based on Auto Rebuild Flag |
| auto-Rebuild       | prompt dialogs when the folder is opened or refreshed |
| auto-Refresh       | stored Query run when the folder is opened and/or refreshed at a pre-defined interval |

# 15. Projects

A Project is a collection of samples that is grouped together for a common reason

## Project Manager

### Project Customer Views

## Project Templates Table 

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Version   |  |
| Ext Link  |  |
| Group  |  |
| Name Prefix / Id Confi |  |
| Item Tables  | Child tables for the Project.  More than one child table can be specified |
| Rslts in Lifecycle | Whether the status of project results will influence the Project Status, False: only the statuses of the project samples are used in calculating the project status |
| Sample Disp Flds  |  |
| Test Disp Flds  |  |
| Close on Samp Log  |  |
| Mod Samp Temp | Specify a Sample Login Template @ Modify Samples dialog |
| Item Templates  | Specify a Template based on which Items in a Project can be generated |
| Show Item Icons | Status bar icons are displayed for Project Item records  |
| ... |  |
| Sample Search Temp | Search Template to filter the samples that are displayed in the Samples tab |
| ... |  |

### Project Template Fields 

Allows the user to add, remove, and change the order of the project fields

# 16. Batch

The batch is a collection of samples or tests and is typically used to simulate a laboratory worksheet or as an autosampler load list

SPIKE: 標準品, ex. column retention time: 1 std's time (SPIKE) vs. sample + std (test) 

## Batch Manager 

...

### Run Menu

Be Functional depending on whether a sample, test, or result is selected 

### Batch Menu

#### Batch Actions 

Record an action on some or all of the samples and tests in a batch

Refer to [Batch Action Calculation Table](./LW7.md#batch-action-calculation-table)

#### Batch Prepare  

## Batch Action Calculation Table

## Batch Standard Protocol Table

## Batch Tests Templates Table

### Table Fields

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Version  |  |
| Ext Link  |  |
| Name Prefix & Id Config  | Defining the naming scheme for batches |
| Global Flag |  |
| Batch Protocol |  |
| Assign to Objects | Batch name record @ Test (object) Table |
| Analysis Link Field / Key | Control which tests can belong to the batch |
| Change Link Key  | Controls whether the user can change the Link Key when creating the batch |
| Folder Tag | Used to automatically populate the batch with tests |
| Required Num  |  |
| Maximum Num  |  |
| Refresh Interval | Sets the automatic refresh period, 0: No automatic refreshing, In Second |
| Add If Batched  | Allowed to be added to the Batch even if they are part of another batch |
| Batch Report | Optional, |
| Object Class | Defines SAMPLE, TEST or RESULT batch |
| Scan Field | Specifies a SAMPLE field |
| Batch Type | Optional, |
| Edit Test Temp | If blank -> No Modify Tests option  |
| Edit Sample Temp |  |

### Batch Tests Template Fields 

#### Effect of Batch Type 

## QC Samples Table

# 17. Lot Management

Can also belong to several folders ( Lot, batch, project ...)

Need refresh to reduce delays by freq. commu. w/ DB

Primary Grade = Prod. Grade, 2nd Grade = checked for spec. limit

Samples associated with a lot should have the same grade and sampling point as the lot

## Lot Manager

Interface for viewing samples/results associated with a lot. File > Lot Manager

3 Tabs: *Summary , *Samples , *Results

#### Sample Tab

pass -> checkmark; fails: X; not entered: ?

Tree View: refer to [Sample List Display](./LW7.md#sample-list-display)

#### Result Tab

Top: specification summary; Lower: Lot results

Show Results for All Grades -> show all/associated w/ selected grade results.

| Top Field        | DESCR           | 
| ------------- |:-------------:|
|  Tests Done  | all required testing perfoemed, refer to [Product Specifications](./LW7.md#product-specifications-table) |
| Primary In Spec (P.I.S.) |  |
| No Rejects  |  |
| No Modifications |  |
| All Reviewed  | include A or R, Samples, tests and results |

| Lower Field        | DESCR           | 
| ------------- |:-------------:|
| Value | LOT_RESULT.AVERAGE_VALUE average among RESULT.ENTRY, rounding @ LOT_RESULT.NUMERIC_VALUE |
| Specification |  |
| Source  | indicates the Lot or Lots that provided source values for the displayed value, Imported result (-C); Original (-O) |

#### Print Report 

Generate CoA, If Product, Grade or Customer have rpt defined.  Precedence: Customer > Grade > Product.  SAMPLE.LOT or LOT.LOT_NUMBER as the first argument.

#### Disposition 

Set the disposition status at the grade level. Must be in Lot Results View.

LOT_DISP list caotains Disposition status.

Dispositioned Lot event trigger

## Lot Template s Table

| Table Field       | DESCR           | 
| ------------- |:-------------:|
| Group Name  |  |
| Id Config  |  |
| Ext Link  |  |
| Lot Rslt All Grds  | LOT_RESULTS table store only primary or not but all still displayed|
| Custom Skip Lot | disable the base Skip Lot functionality |
| Samp Controls Lot  | Whether a sample can update the Lot (product grade) |
| Load Results  | Whether all lot sample test and result records are loaded  |
| Folder Template | Edit > Open In Folder function. If no, only the Data tab is displayed |

# 18. Standard Reagent 

# 19. Instrument Manager 

### Instrument Management Window 

| Visual Indicator | Meaning | 
| ------------- |:-------------:|
| System  |  |
| Balance | Independent Instrument  |
| Multi-Gear  | Parent Instrument |
| Single-Gear | Component  |
| State  |  |
| Plug-in | In Service |
| Un-plug | Out of service  |
| Status  |  |
| Green  | Good at PM & Cal. date |
| Red    |  |

## Instrument Event Template Table 

## Instrument Template Table 

Configure the fields that appear on the Instrument tab in the Manage Instruments dialog

## Instruments Table 

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Group Name  |  |
| Inst Group  |  |
| Location  |  |
| Operator  |  |
| Vendor  |  |
| Serial No |  |
| PM Date  | PM = Preventative Maintenance |
| PM Interval  |  |
| PM Expiration | Date + Interval = Expiration |
| Calib Date |  |
| Calib Intv |  |
| Calib Expiration |  |
| Ext Link  |  |
| Link Location | Directory where the instrument data files |
| Parameter Name/ Value |  |
| LabStation |  |
| ... | See Below |
| Parent Instrument  |  |
| Inst/.../... Template  |  |
| IP Address  |  |
| Port Number  |  |
| ... | ... |

| Fields        | Allowed Values    | Req'd | Descrtption | 
| ------------- |:-------------:|:-------------:|:-------------:|
| Baud   | 1200, 2400, 4800, 9600, etc. |     Y |  |
| Parity  | NONE, ODD, EVEN |    Y |  |
| Stop Bits  | 1,2 | Y |  |
| Data Bits | 7,8 |  Y |  |
| Flow Control | NONE, HARDWARE, XON/XOFF  | Y  |  |
| Instrument Class | GenericSingleValue | Y |  |
| Low Threshold |  | N |  |
| High Threshold |   | N |  |
| Stability Delta |  | N |  |
| Stability Numbe |  | N |  |

# 20. Order Manager

Test driving, approval control workflow.

## Sample Rules Manager

Used to enforce sample requirements to ensure that analyses are added to samples with the correct configuration

# 23. Managing Contacts

## Address Book

# 24. Approval Manager

Product spec driving, Records must go through multiple approvals before the record can be made active.

## Changes Manager

Utilities > Changes Manager

Mechanism for querying the changes in the system configuration for a specified interval.  The ability to export and import the changed objects



# Install Module or Template

Module: KT00932, KT01337

Template:

M0052-V04_Database Migration Utility: Cannot define PRIMARY KEY

Build 036(X) -> Build 021(O), try older(B028) version to fix 

# Configuration Packge

M0504(Info. Resource > Module User Guides)

# ELN

Like MS microsoft, and add on...

"AUDIT TRAIL"

"Master Data Validation" (Workbook formate, caculation...)

LIMS Basic -> excel Macro; Trigger

For QA/QC usually used at recording QC batch, easy to review.

Parsing Script @ LabStation(Modify), Instrument(Specify Script)

# Other topic

## Remote Desktop

Target = service manager executable, plus startup parameters (;TS=0 ;WS=WSNAME ;SN=LIMS_PROD7 - same parameters used by the FireDaemon service)

## DB

ODBC: Open Databse Connectivity

RDO: Remote Data Object

DAO: Data Access Object
 
## Hyper-V

check Hyper-V: Ctrl Plane > Programs > Program & Features, turn on/off Windows features > restart PC

[在 Windows 10 上安裝 Hyper-V](https://docs.microsoft.com/zh-tw/virtualization/hyper-v-on-windows/quick-start/enable-hyper-v)

[HyperV gen1/2](https://docs.microsoft.com/en-us/windows-server/virtualization/hyper-v/plan/should-i-create-a-generation-1-or-2-virtual-machine-in-hyper-v)

ISO source: https://heidoc.net/joomla/

Roll back:

# RS232

9 pin, 

Baud rate/Data Bite/Parity/Stop  bits

Software: Hyper Terminal, Docklight

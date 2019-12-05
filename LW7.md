# 2. System Wide Functionality

## Sample List Display

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

### Adding User Defined Menus

Must be an entry in NLS file. [Valid Formats](./LW7.md#valid-formats-for-arguments)

Check \*NLS_Build > Find "...MainMenu..." at which NLS.txt file > Add/modify New NLS key-value pair 

## National Language Support NLS

Allows any object of the presentation layer (UI) to be modified

Integrate and Support multi language systems

# 7. Sample Login

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

## Analysis Table

### Analysis Table Fields

| Fields        | DESCR           | 
| ------------- |:-------------:|
| Version      | track version, up to 2000 |
| Reported Name| name used reports, w/ case, unique |
| Common Name  | required, same name w/ diff. methods achieving same result |
| Analysis Type | group similar types of analyses, required |
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

### Analysis Limits

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

5 Cat. of specifications: Numeric, Text, Formula, SPC and Reported

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

### Product Grade Sampling point

### Product Geade Stage

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
| Rounding and Places | [Numeric Component Properties](./LW7.md#numeric-components-properties) |
| Lo_Control_1       |  |
| Hi_Control_1       |  |
| Lo_Control_2       |  |
| Nominal Value       | not used by the LIMS but used to record the nominal value for reporting purposes |
| Reported Name       | default to the Result Name |
| Num History Pts       | used to record for trend plot |
| Season        |  |
| Factor Values/Operator      | to midify formatted value |

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

# 16. Batch

The batch is a collection of samples or tests and is typically used to simulate a laboratory worksheet or as an autosampler load list

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

# 20. Order Manager

## Sample Rules Manager

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

# 2. System Wide Functionality

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

# 14. Organizing Data

Folders: View SAMPLE, TEST and RESULT in Folder Manager

Create from Folder Template table, Query based on Query Tag/ Search Template

| Func        | DESCR           | 
| ------------- |:-------------:|
| Rebuild       | reset Query Tag & Search Template |
| Refresh       | the saved Folder Query can be run / filter values prompts based on Auto Rebuild Flag |
| auto-Rebuild       | prompt dialogs when the folder is opened or refreshed |
| auto-Refresh       | stored Query run when the folder is opened and/or refreshed at a pre-defined interval |


# Install Module or Template

Module: KT00932, KT01337

Template:

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

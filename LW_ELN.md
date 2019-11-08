Electronic Lab Notebook

Spreadsheet based Interface, excel compatible format 

| Level        | Description           | 
| ------------- |:-------------:|
| Experiment Window | integrates with the LabWare LIMS architecture, Workbook... |
| Workbook          | enter data, view charts, add comments, embed images, import or attach file data   | 
| Spreadsheet       | sheet, can include buttons for triggering macros    | 

# 2.	LabWare Electronic Lab Notebook

TIP: automatically run macro names: "limitFailed", "onLoad", "onClose", "onStart", "samplesAdded", "saved"

## Experiment Window

Created based on Experiment Template 

Types of tab: Summary, workbook, document workbook, Samples, Objects, Compliance

Life Cycle: I (incomplete), P (In-progress), C (complete), R (reviewed), X (cancelled) 

## Summary Tab

quick overview of Experiment, optional, refer to [Experiment Templates table](./LW_ELN.md#experiment-template)

## Workbook Tab

Experiment includes one or more workbook tabs. Multiple worksheets in each Workbook.  

Capture instrument data, Attach data, Comments, Calculations, Buttons to run Macros.  

Formula bar: cell reference(left, named range), cell conteents(right)

Additional Workbook refer to [File menu](./LW_ELN.md#file-menu)

Pop-up SOP refer to [Experiment Templates table](./LW_ELN.md#experiment-template)

### Workbook Objects

WORKBOOK_OBJECTS table, 

### Workbook Data

Entries made in the worksheet cells, WORKBOOK_DATA table (only most current information for Cell). View Data History@Audit menu view previous entries.

TIP: WORKBOOK_DATA stores result names in the OBJECT_NAME, size of OBJECT_NAME = RESULT.NAME field

Save All Data: False: Named ranges, Mapped to LIMS objects, DATA map is audited  saved. 

NOMAP option suppress auditing, Override the  Save All Data flag, refer to [Show Maps](./LW_ELN.md#show-maps)

### Right Mouse Menu

| Option        | Function           | 
| ------------- |:-------------:|
| Go To  | move cursor to the related cell |
| Copy/Paste         | copy/paste  cell contents | 
| Add Text Box       |  refer to [Add Text Box](./LW_ELN.md#run-menu)   | 
| Modify Text Box Contents |   modify a text box created by another user, refer to [Add Text Box](./LW_ELN.md#run-menu) | 
| Create Chart       |   refer to [Add Text Box](./LW_ELN.md#run-menu)  | 
| Insert Image       |   refer to [Add Text Box](./LW_ELN.md#run-menu)  | 
| Insert Date       |     | 
| Clear Data       |   Clear the cell contents w/o clearing formatting or formulas  | 
| Format Cells       |  refer to [Format Cells](./LW_ELN.md#edit-menu)   | 

## Document Workbook Tabs

.docx document for Experiment journaling, based on an Experiment Document Template. @ WORKBOOK_DOCUMENT table

## Samples Tab

Multiple sub tabs when multi. workbooks

Display Samples field @ Experiment Workbook Template : False -> sub Samples Tab not seen

## Objects Tab

Tree view Panes(left): showing the experiment objects grouped by workbook

Tabs Panes(right): Data and Report

## Compliance Tab

Summary of calibration and specification status and indicates if the result has been modified

Display the date the worksheet was Completed, Reviewed and/or Witnessed.  

For each Worksheet 

## Summary Report Tab

## File Menu

| Option        | Function           | 
| ------------- |:-------------:|
| New  | |
| Open    | Qualifiers to narrow dwon search |
| Search    | used to Open an experiment, Search Template defined for the Experiment table|
| Save     | |
| Save As  | Copy the current workbook to an XLS file |
| Cancel Experiment  |Set Experiment STATUS to X and will set the DISABLE Fields and READ_ONLY flags to T |
| Restore Cancelled Experiment  | |
| Complete Experiment  | Experiment STATUS to C; COMPLETED to T; Populate COMPLETED_BY and COMPLETED_ON fields. If Lock Completed = T ->  DISABLE Fields and READ_ONLY flags to T|
| Review Experiment  | STATUS to R; DISABLE Fields, READ_ONLY and Reviewed flag to T. Populate the REVIEWED_BY and REVIEWED_ON fields   |
| Close Experiment  | CLOSED flag to T;  DISABLE Fields and READ_ONLY flags to T, it DOES NOT disable Menu Routines(R)|
| Restore Experiment  | CLOSED flag to F; DISABLE & READ_ONLY flags to F|
| Append Workbook To Experiment  | |
| Append a Document  | |
| Refresh  | |
| Print Preview    | |
| Print   | |
| Lock Session  |Display only Unlock Session screen. All other LIMS windows hidden |
| Switch User  | Save All before Switch, otherwise changed by -> user2 |
| Create and Attach PDF  | Module M0524-V01 is required|
| Remove Workbook  | |
| Remove Workbook Document  | |
| Exit    | |

Workbook Data Review Dialog: Enter a review comment and Set the Review Type 

Qualifications for Review: Experiment Template has Boolean Fields: Review Your Work, Review Incomplete

## Edit Menu

Ctrl-C, Ctrl-V, Ctrl-X Suppressed!

## Table Menu

## Run Menu

| Option        | Function           | 
| ------------- |:-------------:|
| Check Out  | CHECKED_OUT to T; CHECKED_OUT_BY and CHECKED_OUT_ON; unable to edit till Check In by Same user |
| Check in    | |
| Open SOP   | |
| ...    | |
| Browse   | Show a browse map list |
| Run Macro    | Uppercase begin Macro can exec|
| Exit    | |
| Exit    | |


# 4. Table Configuration

## Experiment Template


| Option        | Function           | 
| ------------- |:-------------:|
| ...    | |
| Auto Save Freq |   automatic saves time interval (Second)|
| Scan Field  | Scanned Barcode based on this field |
| ...    | |
| Auto Review Sheet | worksheets are automatically reviewed when all of the workbook data has been reviewed |
| ...    | |
| Auto Review Data     | |
| Lock Reviewed     | Worksheet Locked after Review , not apply if worksheet REVIEWED field to T by Auto Review function |
| Lock Witnessed     | Worksheet Locked after Witness, not apply if worksheet WITNESSED field to T by Auto Witness function |
| Zip Workbook Files     | experiment are stored in zipped format |
| ...    | |
| Lock Open     | single user read/write security |
| ...    | |

## Experiment Workbook Templates

### Workbook Design Considerations

| Area        | Comments           | 
| ------------- |:-------------:|
| Hardware    | |
| Calculations    | Cross worksheets calc slow <br> Nested Formulas  |
| Number of worksheets    | amount of mapping  <br> cell formulas |
| Number of charts    | |
| Conditional Formatting    | |
| LIMS Objects  | |
| Linking Macros to named ranges    | |
| Adding maps on the fly    | better to have maps already configured then hide |
| Saving workbooks     | Version Control <br>  File > Save as <br> Workbook > Set Worknook Template File|
| Auditing    | |

### Experiment Workbook Template Fields


| Fields        | Function           | 
| ------------- |:-------------:|
| ...    | |
| File Inst Grp 1~5    | determine the instruments from which file data can be imported |
| Direct Inst Grp 1~5    | determine the instruments from which file data can be downloaded directly |
| Analyses     | Only specify analyses can be added to the workbook |
| ...    | |
| Complete Sheets     | require all worksheets to be completed > can complete the workbook |
| Store Result Objs     | determine if RESULT objects are included in WORKBOOK_OBJECTS |
| ...    | |
| Save All     | Require all data in a workbook to be audited |
| ...    | |

# other ELN software

[eLabFTW](https://doc.elabftw.net/index.html) 

eLabFTW on docker: beware windows/docker(MySQL) folder sharing

1. .yml檔(elabftw): 新增 DB_PASSWORD, SECRET_KEY 載自https://demo.elabftw.net/install/generateSecretKey.php

2. .yml檔(mysql): 新增 MYSQL_PASSWORD,MYSQL_ROOT_PASSWORD, 修改Volumes位置 (ex: C:\Users\elab-data\mysql:/var/lib/mysql)

3. 更改本機Volumes位置權限

[sciNote](https://scinote.net/)

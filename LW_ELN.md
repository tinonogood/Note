Electronic Lab Notebook

Spreadsheet based Interface, excel compatible format 

| Level        | Description           | 
| ------------- |:-------------:|
| Experiment Window | integrates with the LabWare LIMS architecture, Workbook... |
| Workbook          | enter data, view charts, add comments, embed images, import or attach file data   | 
| Spreadsheet       | sheet, can include buttons for triggering macros    | 

#

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
| Cancel Experiment  |Set Experiment Status to X and will set the Disable Fields and Read Only flags to T |
| Restore Cancelled Experiment  | |
| Complete Experiment  | Experiment Status to C; Completed to T; populate Completed By and Completed On fields. If Lock Completed = T ->  Disable Fields and Read Only flags to T|
| Review Experiment  | |
| Close Experiment  | |
| Restore Experiment  | |
| Append Workbook To Experiment  | |
| Append a Document  | |
| Refresh  | |
| Print Preview    | |
| Print   | |
| Lock Session  | |
| Switch User  | |
| Create and Attach PDF  | |
| Remove Workbook  | |
| Remove Workbook Document  | |
| Exit    | |

# Table Configuration

## Experiment Template

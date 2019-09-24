## MSSQL setting

Download MSSQL-Developer-Edition & MSSM

[MSSQL-Developer-Edition & MSSM](http://www.sqlservertutorial.net/install-sql-server/)

New DB

Object Explorer(right-click) > New Database

Create/Config User in MSSQL

Object Explorer > Security Folder > Logins(right-click) > New Login

New Users: SYS, APP, RPT

General:

SQL Server authentication: Password; no "Enforce pwd exp"...

Set default DB in prev. step

User Mapping:

Users mapped to this login: check prev. DB

Default Schema: dbo

Role: SYS(db_owner, public); APP(db_reader, db_writer, public); RPT(db_reader, public)

[User Config](https://support.rackspace.com/how-to/creating-and-configuring-a-user-in-mssql/)

## Transfer Access file to MSSQL

2 ODBC: Access & MSSQL(empty)

Open server application > Configure > system > server: choose Access ODBC

Utilities > DBMT: Choose Target DB and type

Advanced...: change SQLSERVER text type > NVARCHAR: for unicode 

Create Table > Start

Create Record > Start

## Rerun SQL Scripts

Follow Installation Instructions DB

改型態: 小數位數

ALTER TABLE (RESULT/LOT_RESULT/UNIT/BATCH_RESULT) ALTER COLUMN (NUMERIC_ENTRY/NUMERIC_VALUE/FACTOR/NUMERIC_ENTRY) REAL;

view *4

## Internal Change

Table explorer: System Setup: PHARMA > Run System Setup

Check LIMS Constants

Update Crystal Reports

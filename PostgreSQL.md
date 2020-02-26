# 前言

[wiki](https://wiki.postgresql.org/wiki/Main_Page)

[中文wiki](https://wiki.postgresql.org/wiki/Taiwan)

[Web Site](https://www.postgresql.org/)

# I. 新手

主從式架構（client/server）

### 交易安全

```sql
BEGIN;
UPDATE accounts SET balance = balance - 100.00
    WHERE name = 'Alice';
SAVEPOINT my_savepoint;
UPDATE accounts SET balance = balance + 100.00
    WHERE name = 'Bob';
-- oops ... forget that and use Wally's account
ROLLBACK TO my_savepoint;
UPDATE accounts SET balance = balance + 100.00
    WHERE name = 'Wally';
COMMIT;
```

### 窗函數

```sql
SELECT depname, empno, salary, avg(salary) OVER (PARTITION BY depname) FROM empsalary;
```

多組函數引用相同分組方式 WINDOW

```sql
SELECT sum(salary) OVER w, avg(salary) OVER w
  FROM empsalary
  WINDOW w AS (PARTITION BY depname ORDER BY salary DESC);
```

# II. SQL 查詢語言

#### 識別項（Identifier）和關鍵字 （Keyword）

識別項小於 NAMEDATALEN , default NAMEDATALEN = 64, 修改 @ src/include/pg_config_manual.h

關鍵字:大寫，而識別項名稱:小寫

```sql
UPDATE my_table SET a = 5;
```

萬國碼(unicode) "U&"

"\\"接 4 位數的 16 進位碼，或"\\"接一個"+"再串一組 6 位數的 16 進位碼

```sql
U&"d\0061t\+000061"
```

以不同的跳脫字元("!")來代替"\\"

```sql
U&"d!0061t!+000061" UESCAPE '!'
```

### 參數表示式

#### 函數參數引用

```sql
CREATE FUNCTION dept(text) RETURNS dept
    AS $$ SELECT * FROM dept WHERE name = $1 $$
    LANGUAGE SQL;
```

#### 型別轉換

CAST: SQL 標準；「::」: PostgreSQL 既有的用法。

```sql
CAST ( expression AS type )
expression::type
```

```sql
select round( cast ( 1 as numeric )/ cast( 4 as numeric),2);
select round(1::numeric/4::numeric,2);
```

#### 

# psql Meta-Commands

unquoted backslash: psql meta-command

| Meta-commands   | Func.           | 
| ------------- |:-------------:|
| \c or \connect | \c "host=localhost port=5432 dbname=mydb" |
| \conninfo |  |
| \h or \help |  |
| \l | List the databases in the server |
| \q or \quit |  |
| \d | List tables |
| \df | Display function |
| \i \[filename\] | execute commands from a file |
| set | list all internal variables |
| \set \[name\] \[value\] | set new internal variable |
| \unset \[name\] |  |
|  |  |

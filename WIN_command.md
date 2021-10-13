### Have Used

dir, mkfir, cd, rmdir, move, copy, del, ping, ipconfig, echo

### Unfamiliar

pause, cls, xcopy, apr, type, 


## Variable

### set variable

`set varname="123"`

`echo %varname%`

### check variable

`set`

`set var`

`set USER`

How to delete/clear?

## String concatenation

```
set strvar=tino 
set strvar=%strvar% wang
echo %strvar%
```

## Script

Save with ".bat" extension 

#### @ 

less verbose (ex. `@ver @vol`)

#### echo off

less verbose

```
@echo off

ver
vol 
echo.
pause
```

## escape

%....%, ^

```
@echo off

set var=PROBLEM

echo var
echo %var%
:: echo <html>, syntax incorrect
echo ^<html^>
```

## Set

### operator

` set /a sum=10 * 5`

```
@echo off

set /a mul = 10 * 2
echo %mul%

:: set /a mod = 10 % 3, missing operator.
set /a mod = 10 %% 3
echo %mod%
```

### user input

```
@echo off

rem set /p name=please input name
echo please input name
set /p name=

echo.
echo your name is %name%
```

### label(:) and goto

```
@echo off

goto :second

:first
echo first

:second
echo second

:third
echo third
```

## Function

### Basic Functions

```
@echo off
echo script start
goto :main

:function
	echo 		sub-func
goto :eof

:main
	echo 	main func start
	call :function
	echo 	main func end
	echo script end
goto :eof
```

### Function argument

```
@echo off
goto :main

:say_sth 
	echo 		say %~1 and %~2!
goto :eof

:main
	echo 	main func start
	call :say_sth hello hola
	echo 	main func end
goto :eof
```

### change variable

```
@echo off
goto :main

:new_func
	echo cahnging a var
	set %~1=Lunch
goto :eof

:main
	echo 	main func start
	set new_var=Dinner
	echo %new_var% 
	call :new_func new_var
	echo %new_var%
goto :eof
```

### Local scope

```
@echo off
set x=
set p=
goto :main

:: use "setlocal" and "endlocal" to make local scope 
:func
setlocal 
	echo P: %p%
	set x=30
	echo X: %x%
endlocal
goto :eof

:main
	echo 	main func start
	set p=4
	echo P: %p%
	
	call :func 
	echo X: %x%	
goto :eof
```

```
@echo off
goto :main

:add_one
setlocal
	echo add one
:: "Return" in Local Functions
endlocal & set /a x=%x%+1
goto :eof

:main
setlocal
	echo 	main func start
	set /a x=1
	echo %x%

	call :add_one 
	echo %x%
endlocal
goto :eof
```

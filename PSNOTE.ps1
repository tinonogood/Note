# PS Alias
gal -> Get-Alias
nal -> New-Alias
cd -> Set-Location
clear -> Clear-Host
cp -> Copy-Item
foreach -> ForEach-Object
gi -> Get-Item
h -> Get-History
icm -> Invoke-Command
ii -> Invoke-Item
kill -> Stop-Process
measure -> Measure-Object
mv -> Move-Item
pwd -> Get-Location
ps -> Get-Process
rm -> Remove-Item
select -> Select-Object
sleep -> Start-Sleep
where -> Where-Object


# while loop
$array = @("item1", "item2", "item3")
$counter = 0;

while($counter -lt $array.length){
    $array[$counter]
    $counter +=1
}


# forEach loop
$array = @("item1", "item2", "item3")
$array | foreach { $_ }


# for loop
$array = @("item1", "item2", "item3") 
for($i = 0; $i -lt $array.length; $i++){ $array[$i] }


# if else
$x = 2
$y = 10

if($x -eq 1){
   write-host("Value of X is 1")
} elseif($x -eq 2){
   write-host("Value of X is 2")
   if ($y -eq 10){
      write-host("Y = 10")
   }
} elseif($x -eq 3){
   write-host("Value of X is 3")
} else {
   write-host("This is else statement")
}


# Switch
switch(4,3,2){ # Could be Array input
   1 {"One"}
   2 {"Two"}
   3 {"Three"; break } # break
   4 {"Four"}
   3 {"Three Again"}
}


# Array
$A = 1, 2, 3, 4 == $A = 1..4 

[int32[]]$intA = 1500,2230,3350,4000
$intA.getType()

intA[1] = 10 #Assign values


# Hashtables
$hash = @{ ID = 1; Shape = "Square"; Color = "Blue"}

write-host("Print all hashtable keys")
$hash.keys

write-host("Print all hashtable values")
$hash.values

write-host("Get ID")
$hash["ID"]

write-host("Add key-value")
$hash["Updated"] = "Now"

write-host("print Size")
$hash.Count

write-host("Remove key-value")
$hash.Remove("Updated")

write-host("sort by key")
$hash.GetEnumerator() | Sort-Object -Property key


# Backtick 
Get-Service * | Sort-Object ServiceType `
| Format-Table Name, ServiceType, Status -AutoSize # word-wrap operator

Write-host "Title `nSubtitle" # new line
Write-host "Title `tSubtitle" # tab


# SQL connection (Table Output)
$dataSource = "LT-T490-TINO\MSSQLSERVER_LW"
$user = "LIMS-TRAIN-SYS"
$pwd = "your DB password here"
$database = "PS_V052"

$connectingString = "Server=$dataSource;uid=$user;pwd=$pwd;Database=$database;Integrated Security=False;"
$cn = New-Object System.Data.SqlClient.SqlConnection
$cn.ConnectionString = $connectingString
$cn.Open()

$query="select * from TABLE_TEMP_FIELDS where TEMPLATE='T_PH_TEST_ARTICLE'"
$cmd = $cn.CreateCommand()
$cmd.CommandText = $query
$result = $cmd.ExecuteReader()
$table = New-Object "System.Data.DataTable"
$table.Load($result)
# $table | ft 
$table
$cn.Close()


# SQL connection

$SQLServer = "LT-T490-TINO\MSSQLSERVER_LW"
$SQLDBName = "PS_V052"
$uid ="LIMS-TRAIN-SYS"
$pwd = ""

$table = "TABLE_TEMP_FIELDS"
$SavePath = "C:\Users\Tino Wang\Desktop\" + $SQLDBName + $table + ".csv"
Invoke-Sqlcmd  -ServerInstance $SQLServer -Username $uid -Password $pwd -Database $SQLDBName -Query "Select * from $table where TEMPLATE='T_PH_TEST_ARTICLE';" | Export-Csv -Path $SavePath
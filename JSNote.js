/*
Output
*/

// innerHTML

...
<p id="demo"></p>

<script>
document.getElementById("demo").innerHTML = 5 + 6;
</script>

...

// document.write()

...
<script>
document.write(5 + 6);  // Using document.write() after an HTML document is loaded, will delete all existing HTML:
</script>
...

// window.alert()

<script>
window.alert(5 + 6);
</script>

// console.log()

<script>
console.log(5 + 6); // Activate debugging with F12
</script>


/*
Variables
*/

// One Statement, Many Variables

var person = "John Doe", carName = "Volvo", price = 200;

var person = "John Doe",
carName = "Volvo",
price = 200; // Can span multiple lines

// Re-Declaring JavaScript Variables

var carName = "Volvo";
var carName;  // It will NOT lose its value

// JavaScript Arithmetic

var x = "5" + 2 + 3; // -> 523
var x = 2 + 3 + "5"; // -> 55


/*
Operators
*/

// JavaScript Operator Precedence Values -> to check Precedence 


/*
Data Types
*/

var cars = ["Saab", "Volvo", "BMW"]; //Array

var person = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"}; // Object

// typeof Operator

typeof "John Doe";     // Returns "string"

typeof (3 + 4);        // Returns "number"
typeof 3.14;           // Returns "number"

var car;
typeof car; // Returns "undefined"

// Difference Between Undefined and Null

typeof undefined           // undefined
typeof null                // object

null === undefined         // false
null == undefined          // true


/*
Function
*/

function name(parameter1, parameter2, parameter3) {
  // code to be executed
}


/*
Object
*/

var person = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue",
              fullName : function() {
                return this.firstName + " " + this.lastName;
              }
             };

person.lastName;

person["lastName"];


/*
Strings & string methods
*/

// Escape Character

var x = "We are the so-called \"Vikings\" from the north.";

var x = 'It\'s alright.';

// indexOf lastIndexOf()

var str = "Please locate where 'locate' occurs!";
// var pos = str.indexOf("Please"); 0, counts positions from zero
var pos = str.indexOf("locate"); // 7 -> returns the index of (the position of) the first occurrence
document.getElementById("demo").innerHTML = pos;

var str = "Please locate where 'locate' occurs!";
var pos = str.lastIndexOf("locate"); // 21 -> returns first char 'l' position from the last occurrence of a specified text
var pos = str.lastIndexOf("John"); // -1 -> means the text is not found
var pos = str.indexOf("locate",5); // Second parameter -> Starting position for the search

// slice, substring, substr

var str = "Apple, Banana, Kiwi";
var res = str.slice(7, 13); //Banana
var res = str.slice(-12, -6); //Banana
var res = str.slice(7); //Banana, Kiwi

var res = str.substring(7, 13); // Banana, Can NOT accept NEGATIVE indexes

var res = str.substr(7, 6); // Banana, Second parameter specifies the Length

// replace(), toUpperCase(), toLowerCase()

str = "Please visit Microsoft and Microsoft!";
var n = str.replace(/Microsoft/g, "W3Schools"); // To replace all matches, use a regular expression with a /g flag (global match)

var text1 = "Hello World!";       // String
var text2 = text1.toUpperCase();  // text2 is text1 converted to upper
var text3 = text1.toLowerCase();  // text3 is text1 converted to lower

// Converting a String to an Array

var txt = "a,b,c,d,e";   // String
txt.split(",");          // Split on commas

var txt = "Hello";       // String
txt.split("");           // Split in characters


/*
Number & Number methods
*/

var x = "100";
var y = "10";
var z = x + y;       // z will not be 110 (It will be 10010)

var x = "100";
var y = "10";
var z = x - y;       // z will be 90


// NaN, Not a Number

typeof NaN;            // returns "number"

var x = NaN;
var y = 5;
var z = x + y;         // z will be NaN

// Infinity

var myNumber = 2;
while (myNumber != Infinity) {   // Execute until Infinity
  myNumber = myNumber * myNumber;
}

var x =  2 / 0;       // x will be Infinity
var y = -2 / 0;       // y will be -Infinity

// Hexadecimal

var myNumber = 32;
myNumber.toString(10);  // returns 32
myNumber.toString(32);  // returns 10
myNumber.toString(16);  // returns 20
myNumber.toString(8);   // returns 40
myNumber.toString(2);   // returns 100000

// Number Properties

var x = Number.MAX_VALUE; // returns the largest possible number in JavaScript
var x = Number.MIN_VALUE;
var x = Number.POSITIVE_INFINITY;
var x = Number.NaN;



/*
Array, Array methods, 
*/

// the Last Array Element

fruits = ["Banana", "Orange", "Apple", "Mango"];
var last = fruits[fruits.length - 1];

// Looping Array Elements

// for loop
var fruits, text, fLen, i;
fruits = ["Banana", "Orange", "Apple", "Mango"];
fLen = fruits.length;

text = "<ul>";
for (i = 0; i < fLen; i++) {
  text += "<li>" + fruits[i] + "</li>";
}
text += "</ul>";

// forEach()
var fruits, text;
fruits = ["Banana", "Orange", "Apple", "Mango"];

text = "<ul>";
fruits.forEach(myFunction);
text += "</ul>";

function myFunction(value) {
  text += "<li>" + value + "</li>";
}

// Adding & Removing element

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.push("Lemon");    // adds a new element (Lemon) to fruits
var x = fruits.pop();              // Removes the last element ("Mango") from fruits & the value of x is "Lemon"
var x = fruits.push("Kiwi");   //  the value of x is 5

fruits[fruits.length] = "Lemon";    // adds a new element (Lemon) to fruits
var x = fruits.shift();            // Removes the first element "Banana" from fruits& the value of x is "Banana"

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.unshift("Lemon");    // Adds a new element "Lemon" to fruits -> Lemon,Banana,Orange,Apple,Mango
delete fruits[0];           // Changes the first element in fruits to undefined

// Splice

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.splice(2, 0, "Lemon", "Kiwi"); // position where to add, how many elements should be removed, rest = new elements to be added -> Banana,Orange,Lemon,Kiwi,Apple,Mango

var fruits = ["Banana", "Orange", "Apple", "Mango"];
var removed = fruits.splice(2, 2, "Lemon", "Kiwi"); // -> fruits = ["Banana", "Orange", "Lemon", "Kiwi"]; removed = ["Apple", "Mango"]

// Slice

var fruits = ["Banana", "Orange", "Lemon", "Apple", "Mango"];
var citrus = fruits.slice(1); // citrus = ["Orange", "Lemon", "Apple", "Mango"]
var citrus = fruits.slice(3); // citrus = ["Apple", "Mango"]
var citrus = fruits.slice(1, 3); // citrus = ["Orange", "Lemon"]

// Concat

var arr1 = ["Cecilie", "Lone"];
var arr2 = ["Emil", "Tobias", "Linus"];
var arr3 = ["Robin", "Morgan"];
var myChildren = arr1.concat(arr2, arr3);   // Concatenates arr1 with arr2 and arr3

var arr1 = ["Cecilie", "Lone"];
var myChildren = arr1.concat(["Emil", "Tobias", "Linus"]); 


/*
Array Sort, Array Iteration
*/

var fruits = ["Banana", "Orange", "Apple", "Mango"];
fruits.sort();        // First sort the elements of fruits
fruits.reverse();     // Then reverse the order of the elements

// Numeric Sort
var points = [40, 100, 1, 5, 25, 10]; 
points.sort(function(a, b){return a - b});
points.sort(function(a, b){return b - a});

// find max

function myArrayMax(arr) {
  return Math.max.apply(null, arr);
}

function myArrayMax(arr) {
  var len = arr.length;
  var max = -Infinity;
  while (len--) {
    if (arr[len] > max) {
      max = arr[len];
    }
  }
  return max;
}

// forEach

var txt = "";
var numbers = [45, 4, 9, 16, 25];
numbers.forEach(myFunction);

function myFunction(value, index, array) {  
// function myFunction(value) { // only the value parameter
  txt = txt + value + "<br>";
}

// map

var numbers1 = [45, 4, 9, 16, 25];
var numbers2 = numbers1.map(myFunction);

function myFunction(value, index, array) {
// function myFunction(value) {
  return value * 2;
}

// filter

var numbers = [45, 4, 9, 16, 25];
var over18 = numbers.filter(myFunction); // -> over18 = [45,25]

function myFunction(value, index, array) {
  return value > 18; 
}

// every, some

var numbers = [45, 4, 9, 16, 25];
var someOver18 = numbers.some(myFunction);
var allOver18 = numbers.every(myFunction); 

document.getElementById("demo").innerHTML = "Some over 18 is " + someOver18 + " ; all over 18 is " + allOver18;

function myFunction(value, index, array) {
  return value > 18;
}


/*
Dates & Date Formats
*/

var d = new Date();
// year, month, day, hour, minute, second, and millisecond
var d = new Date(2018, 11, 24, 10, 33, 30, 0); ; // Dec 24 2018 10:33:30 -> JavaScript counts months from 0 to 11.
var d = new Date("October 13, 2014 11:13:00"); //date string

var d = new Date(0); // since January 01, 1970, 00:00:00 UTC, in milliseconds 
var d = new Date(-100000000000); // approximately October 31 1966

var d = new Date();
d.toUTCString();
d.toDateString();

var d = new Date("2015-03-25T12:00:00Z"); // ISO 8601 Dates, T: Date/Time separator, Z: UTC
var d = new Date("03/25/2015"); // Short Date "MM/DD/YYYY" , Month Day Year in order
var d = new Date("Mar 25 2015"); // Long Date "MMM DD YYYY", can be in any order

// Get <-> Set Date
var d = new Date();
d.getFullYear(); // return yyyy <-> setFullYear()
d.getMonth(); // return number (0-11) <-> setMonth()
d.getDate(); // return number (1-31) <-> setDate()
d.getHours(); // return (0-23) <-> setHours() 
d.getMinutes(); // return (0-59) <-> setMinutes()
d.getSeconds(); // <-> setSeconds()
d.getMilliseconds(); // return (0-999) <-> setMilliseconds()
d.getTime(); // return  (milliseconds since January 1, 1970) <-> setTime()
d.getDay(); // return number (0-6)


/*
Math
*/

Math.random() // 0~1

function getRndInteger(min, max) {
  return Math.floor(Math.random() * (max - min) ) + min; // min (included) and max (excluded)
//   return Math.floor(Math.random() * (max - min + 1) ) + min; // min and max (both included)
}


/*
Comparing 
*/

// && || !, and or not

// Ternary Operator
var voteable = (age < 18) ? "Too young":"Old enough";


/*
Condition 
*/

// if-else
if (time < 10) {
  greeting = "Good morning";
} else if (time < 20) {
  greeting = "Good day";
} else {
  greeting = "Good evening";
}

// Switch
switch (new Date().getDay()) {
  case 4: // Common Code Blocks
  case 5:
    text = "Soon it is Weekend";
    break;
  case 6:
    text = "Today is Saturday";
    break;
  case 0:
    text = "Today is Sunday";
    break;
  default: // If there is no case match
    text = "Looking forward to the Weekend";
}


/*
Loop 
*/

//For Loop
text = "";

for (i = 0, len = cars.length, text = ""; i < len; i++) {
  text += cars[i] + "<br>";
}

var i = 0;
var len = cars.length;
var text = "";
for (; i < len; i++) {
  text += cars[i] + "<br>";
}

var i = 0;
var len = cars.length;
for (; i < len; ) {
  text += cars[i] + "<br>";
  i++;
}

// For In loop
var i;
for (i in cars) { 
  text += cars[i] + "<br>";
}

// For Of loop
var i;
for (i of cars) { 
  text += i + "<br>";
}

// while loop
var text = ""
var i = 0;

while (i < 0) {
  text += "<br>The number is " + i; // No print
  i++;
}

// Do while loop
var text = ""
var i = 0;
do {
  text += "<br>The number is " + i; // Will execute the code block once, before checking -> print "The number is 0"
  i++;
}
while (i < 0);  

// Break/ Continue

for (i = 0; i < 10; i++) {
  if (i === 3) { break; } // 012
  text += "The number is " + i + "<br>";
//   if (i === 3) { continue; } // 012456789
//   text += "The number is " + i + "<br>";
}


/*
Type Conversion 
*/

// typeof, Operator
typeof "John"                 // Returns "string"
typeof 3.14                   // Returns "number"
typeof NaN                    // Returns "number" *
typeof false                  // Returns "boolean"
typeof [1,2,3,4]              // Returns "object" *
typeof {name:'John', age:34}  // Returns "object"
typeof new Date()             // Returns "object"
typeof function () {}         // Returns "function"
typeof myCar                  // Returns "undefined" *
typeof null                   // Returns "object" *

// constructor, returns the "Constructor function"
"John".constructor                // Returns function String()  {[native code]}
(3.14).constructor                // Returns function Number()  {[native code]}
false.constructor                 // Returns function Boolean() {[native code]}
[1,2,3,4].constructor             // Returns function Array()   {[native code]}
{name:'John',age:34}.constructor  // Returns function Object()  {[native code]}
new Date().constructor            // Returns function Date()    {[native code]}
function () {}.constructor        // Returns function Function(){[native code]}

function isArray(myArray) {
  return myArray.constructor === Array; // check myArray, the object is an Array function
}


/*
Bitwise Operations 
*/

/*
&     AND                     5 & 1   0101 & 0001   0001 > 1
|     OR                      5 | 1   0101 | 0001   0101 > 5
^     XOR                     5 ^ 1   0101 ^ 0001   0100 > 4
~     NOT                     ~ 5     ~0101
<<  	Zero fill left shift    5 << 1  0101 << 1     1010 > 10
>>    Signed right shift      5 >> 1  0101 >> 1     0010 > 2   // One fill right shift?
>>>   Zero fill right shift   5 >>> 1 0101 >>> 1    0010 > 2
*/


/*
Error
*/

// Try & Catch
try { // test a block of code for errors.
  adddlert("Welcome guest!");
}
catch(err) { // handle the error.
  document.getElementById("demo").innerHTML = err.message;
}

// throw, 
// Not a good example -> USE built-in HTML validation, using predefined validation rules defined in HTML attributes
function myFunction() {
  var message, x;
  message = document.getElementById("p01");
  message.innerHTML = "";
  x = document.getElementById("demo").value;
  try {
    if(x == "") throw "empty";
    if(isNaN(x)) throw "not a number";
    x = Number(x);
    if(x < 5) throw "too low";
    if(x > 10) throw "too high";
  }
  catch(err) {
    message.innerHTML = "Input is " + err;
  }
}

// finally, execute code, after try and catch, regardless of the result
function myFunction() {
  var message, x;
  message = document.getElementById("p01");
  message.innerHTML = "";
  x = document.getElementById("demo").value;
  try {
    if(x == "") throw "is empty";
    if(isNaN(x)) throw "is not a number";
    x = Number(x);
    if(x > 10) throw "is too high";
    if(x < 5) throw "is too low";
  }
  catch(err) {
    message.innerHTML = "Error: " + err + ".";
  }
  finally {
    document.getElementById("demo").value = ""; // reset demo Element
  }
}


/*
this
*/
// Create an object:
var person = {
  firstName  : "John",
  lastName   : "Doe",
  id     : 5566,
  myFunction : function() {
    return this + " "+ this.firstName + " " + this.lastName; // [object Object] John Doe
  }
};


/*
let
*/
// Loop Scope
var i = 5;
for (var i = 0; i < 10; i++) {
  // some statements
}
// Here i is 10

var i = 5;
for (let i = 0; i < 10; i++) {
  // some statements
}
// Here i is 5

// Global Variables in HTML
var carName = "Volvo";
let carName1 = "Volvo1";
document.getElementById("demo").innerHTML = "carName " + window.carName +  "; carName1 " + window.carName1; // -> carName Volvo; carName1 undefined

// Redeclaring
// var -> let
var x = 2;       // Allowed
let x = 3;       // Not allowed

{
  var x = 4;   // Allowed
  let x = 5   // Not allowed
}

// let -> let
let x = 2;       // Allowed
let x = 3;       // Not allowed

{
  let x = 4;   // Allowed
  let x = 5;   // Not allowed
}

// let -> var
let x = 2;       // Allowed
var x = 3;       // Not allowed

{
  let x = 4;   // Allowed
  var x = 5;   // Not allowed
}


/*
const
*/
// Like "let", but cannot be reassigned
const PI = 3.141592653589793;
PI = 3.14;      // This will give an error
PI = PI + 10;   // This will also give an error
const PI = 3.14 // SyntaxError

// Redeclare
const x = 2;       // Allowed
const x = 3;       // Not allowed
x = 3;             // Not allowed
var x = 3;         // Not allowed
let x = 3;         // Not allowed

{
  const x = 2;   // Allowed
  const x = 3;   // Not allowed
  x = 3;         // Not allowed
  var x = 3;     // Not allowed
  let x = 3;     // Not allowed
}
{
  const x = 3;   // Allowed
}

{
  const x = 4;   // Allowed
}

carName = "Volvo";    // You can NOT use(Hoisting) carName here
const carName = "Volvo";


/*
Arrow Function
*/
// origin
hello = function(val) {
  return "Hello World! " + val;
}
// Arrow 
hello = (val) => { // 1. reduce "fuction"
  return "Hello World!" + val;
}
hello = val => "Hello World!" + val; //2. return value by default; skip the parentheses 

/*
Class
*/
class Car {
  constructor(brand) {
    this.carname = brand;
  }
}
mycar = new Car("Ford");

//Method
class Car {
  constructor(brand) {
    this.carname = brand;
  }
  present(x) {
    return x + ", I have a " + this.carname;
  }
}

mycar = new Car("Ford");
document.getElementById("demo").innerHTML = mycar.present("Hello");

// Static Methods
// Defined on the class itself, and not on the prototype.

class Car {
  constructor(brand) {
    this.carname = brand;
  }
  static hello() {
    return "Hello!!";
  }
}

mycar = new Car("Ford");

//Call 'hello()' on the class Car:
document.getElementById("demo").innerHTML = Car.hello();

//and NOT on the 'mycar' object:
//document.getElementById("demo").innerHTML = mycar.hello(); // "hello" CANNOT be use by "mycar"
//this would raise an error.

// Inheritance
class Car {
  constructor(brand) {
    this.carname = brand;
  }
  present() {
    return 'I have a ' + this.carname;
  }
}

class Model extends Car { // Use the "extends" keyword to inherit all methods from another class.
  constructor(brand, mod) {
    super(brand); // Use the "super" method to call the parent's constructor function.
    this.model = mod;
  }
  show() {
    return this.present() + ', it is a ' + this.model;
  }
}

mycar = new Model("Ford", "Mustang");
document.getElementById("demo").innerHTML = mycar.show();

// Getters and Setters
class Car {
  constructor(brand) {
    this._carname = brand;
  }
  get carname() {
    return this._carname;
  }
  set carname(x) {
    this._carname = x;
  }
}

mycar = new Car("Ford");
mycar.carname = "Volvo"; // do not use parentheses
document.getElementById("demo").innerHTML = mycar.carname;


/*
Debugging 
*/
a = 5;
b = 6;
c = a + b;
console.log(c); // F12 -> log

var x = 15 * 5;
debugger; // Breakpoint -> stops the execution of JavaScript, and calls (if available) the debugging function
document.getElementById("demo").innerHTML = x;


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

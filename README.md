# ☕ Java Studies & Notes

Java Studies & Notes – A collection of notes, exercises, and examples from my university Java course and MOOC.fi practice, aimed at reinforcing core concepts and practical programming skills.

<div>
<img src='https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white'>
</div>

# Navigate:

- [Introduction](#introduction)
- [Comments](#comments)
- [Scanner](#scanner)
- [String](#string)
- [Concatenation](#concatenation)
- [Variables](#variables)
- [Mathematical operators](#mathematical-operators)
- [Conditional Statements](#conditional-statements)
- [Methods](#methods)
  - [substring](#substring)
  - [toUpperCase()](<#toUpperCase()>)
  - [toLowerCase()](<#toLowerCase()>)
  - [contains()](<#contains()>)
  - [startsWith()](<#startsWith()>)
  - [endsWith()](<#endsWith()>)
- [Classes and Objects](#classes-and-objects)

## Introduction

**Programming** is the process of designing, writing, testing, and maintaining a set of instructions, known as a program, that a computer can execute to perform specific tasks. It involves using a programming language, which provides a formal syntax and semantics that the computer can interpret or compile into machine-readable code.

The **"code"** you write is called <code>source code</code>. Source code is the set of human-readable instructions written in a programming language that defines what a program does. It is what programmers create, edit, and maintain before it is compiled or interpreted into machine code that a computer can execute.

## Comments

Source code can include comments to explain the code or add notes.

```java
public class Hello{
public static void main(String[] args){
// This prints Hello
System.out.println("Hello");
}
}
```

Multi-line comment: starts with <code>/_</code> and ends with <code>_/</code>

```java
public class Hello{
public static void main(String[] args){
/* This is a
   multi-line comment */
System.out.println("World");
}
}
```

👉 Comments are ignored by the computer but help humans understand the code.

## Scanner

The **Scanner class** is a built-in class in Java (found in the <code>java.util</code> package) that allows programs to read input. It can read different types of data such as strings, numbers, and booleans from various sources (keyboard, files, etc.).

To use **Scanner**, you need to import it:

```java
import java.util.Scanner;
```

Usually created like this to read from the keyboard:

```java
Scanner sc = new Scanner(System.in);
```

<code>Scanner</code> → the class (blueprint provided by Java).

<code>sc</code> → the object (an instance of the Scanner class).

<code>new Scanner(System.in)</code> → creates a new Scanner object that takes input from the keyboard (<code>System.in</code>).
In Java, almost everything is done through objects.
Creating <code>Scanner sc</code> is an example of instantiating a class (turning the blueprint into a real usable thing).

<ins>Common methods:</ins>

<code>nextLine()</code> → reads a full line of text.

<code>next()</code> → reads a single word (until space).

<code>nextInt()</code> → reads an integer.

<code>nextDouble()</code> → reads a decimal number.

<code>nextBoolean()</code> → reads a true/false value.

Example:

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);
        sc.close();
    }
}
```

## String

In programming, we use the term string (short for string of characters) to describe text, since a computer sees it as a sequence of characters.

We’ve used strings in two ways:

Passing a string in quotation marks to <code>print</code>.

Storing user input in a string variable.

A variable is a named container that holds data of a specific type. A string variable is declared by writing its type (<code>String</code>) and its name (e.g., <code>message</code>), and often assigning it a value:

```java
String message = "Hello world!";
```

Here, <code>message</code> stores the string literal <code>"Hello world!"</code>. When you reference message, the program prints its contents. But if you write **"message"** (with quotes), it prints the word <code>message</code> instead of the variable’s value.

## Concatenation

Concatenation means joining strings together.

In Java, this is usually done with the <code>+</code> operator.

You can also combine strings with other data types (numbers, booleans, etc.).

Example:

```java
// Joining two strings
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
System.out.println(fullName);   // Output: John Doe

// Combining string with number
int age = 25;
System.out.println("Age: " + age);   // Output: Age: 25
```

<ins>Key Points:</ins>

When using <code>+</code> with a string and another type (like an int), Java automatically converts the other type into a string.

For more complex concatenation, you can also use the <code>String.concat()</code> method or a <code>StringBuilder</code> (better for performance when joining many strings).

👉 In short: Concatenation is the way to join text and other values into a single string in Java.

## Variables

A variable in Java is like a container that stores data.

<ins>Each variable has:</ins>

Type (what kind of data it can hold, e.g., <code>int</code>, <code>String</code>, <code>double</code>).

Name (the label you give it, e.g., <code>age</code>, <code>message</code>).

Value (the actual data stored).

<ins>Declaring and Initializing Variables</ins>

1. Declaration → telling Java you need a variable:

```java
int age;
```

2. Initialization → giving it a value:

```java
age = 25;
```

<ins>Examples of Common Variable Types:</ins>

```java
int number = 10;          // integer
double price = 19.99;     // decimal number
char grade = 'A';         // single character
boolean isJavaFun = true; // true/false
String name = "Alice";    // text
```

Once created, you use the variable name to access its value:

```java
System.out.println("Age is: " + age);
```

**Key Rules**

Variable names are **case-sensitive** (<code>Age</code> and <code>age</code> are different).

Must start with a <code>letter</code>, <code>$</code>, or <code>\_</code> (not a number).

Should be **descriptive** (e.g., <code>score</code> instead of <code>s</code>).

> Note! The first letter of a variable name is always lower-cased:

> A variable is a named storage location in memory that holds a value you can
> use and change while your program runs.

Once a variable's type has been declared, it can no longer be changed. For example, a <code>boolean</code> value cannot be assigned to a variable of the <code>integer</code> type, nor can an integer be assigned to a variable of the boolean type.

<ins>Example:</ins>

```java
boolean negative = false;
negative = 42; // Does not work

int value = 10;
negative = value; // Neither does this
```

However, exceptions do exist: an integer can be assigned to a variable of the double type, since Java knows how to convert an integer to a double during assignment.

```java
double floatingPoint = 0.42;
floatingPoint = 1; // Works

int value = 10;
floatingPoint = value; // Also works
```

A floating-point value cannot, however, be assigned to an integer variable. The reason for this is that those who develop the language aim to prevent developers from making errors that lead to a loss of information.

```java
int value = 4.2; // Does not work

double floatingPoint = 0.42;
value = floatingPoint; // Neither does this
```

## Mathematical operators

<table>
   <thead>
      <tr>
         <th>Operator</th>
         <th>Description</th>
         <th>Example</th>
      </tr>
   </thead>
   <tbody>
      <tr>
         <td>+</td>
         <td>Addition</td>
         <td><code>5 + 3 = 8</code></td>
      </tr>
      <tr>
         <td>-</td>
         <td>Subtraction</td>
         <td><code>5 - 3 = 2</code></td>
      </tr>
      <tr>
         <td>*</td>
         <td>Multiplication</td>
         <td><code>5 * 3 = 15</code></td>
      </tr>
      <tr>
         <td>/</td>
         <td>Division</td>
         <td><code>6 / 3 = 2</code></td>
      </tr>
      <tr>
         <td>%</td>
         <td>Modulus (Remainder)</td>
         <td><code>5 % 3 = 2</code></td>
      </tr>
      <tr>
         <td>++</td>
         <td>Increment</td>
         <td><code>int x = 5; x++; // x = 6</code></td>
      </tr>
      <tr>
         <td>--</td>
         <td>Decrement</td>
         <td><code>int x = 5; x--; // x = 4</code></td>
      </tr>
   </tbody>
</table>

**Important Notes:**

If both operands are integers, <code>/</code> gives an integer result (fraction is cut off).

<code>Example: 7 / 2 = 3 (not 3.5).</code>

If at least one operand is a <code>double</code>, result will be decimal.

<code>Example: 7.0 / 2 = 3.5.</code>

<code>% (modulus)</code> gives the <ins>remainder</ins>.

<code>Example: 10 % 4 = 2.</code>

**Increment & Decrement**

Special operators for adding or subtracting 1.

<code>++</code> → increase by 1

<code>--</code> → decrease by 1

<ins>Example:</ins>

```java
int x = 5;
x++;  // now x = 6
x--;  // now x = 5 again
```

> Mathematical operators in Java let you add, subtract, multiply, divide, and
> find remainders, along with quick ways to increment or decrement values.

## Conditional Statements

Conditional statements allow a program to make decisions based on certain conditions. The computer executes different code depending on whether a condition is <code>true</code> or <code>false</code>.

1. if Statement

Executes a block of code only if a condition is <code>true</code>.

```java
int age = 18;
if (age >= 18) {
    System.out.println("You are an adult.");
}
```

2. if-else Statement

Executes one block if the condition is true, and another block if it’s <code>false</code>.

```java
int age = 16;
if (age >= 18) {
    System.out.println("You are an adult.");
} else {
    System.out.println("You are not an adult.");
}
```

3. else-if Ladder

Checks multiple conditions in <code>sequence</code>.

```java
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

4. switch Statement

Used when you have a single variable to compare against many values.

```java
int day = 3;
switch(day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Other day"); break;
}
```

**Key Points**

Conditions usually use relational operators (<code>></code>, <code><</code>, <code>==</code>, <code>!=</code>, <code>>=</code>, <code><=</code>) or logical operators (<code>&&</code>, <code>||</code>, <code>!</code>).

Blocks of code are enclosed in curly braces **{}**.

**if-else** is preferred for ranges, **switch** is better for discrete values.

> Conditional statements let your program make decisions and execute different
> code depending on the situation.

## Methods

#### substring

<code>substring</code> is a method of the String class that lets you extract part of a string (a smaller string from a bigger one).

🔹 Syntax

There are two common forms:

<code>substring(beginIndex)</code>
→ Returns everything from beginIndex to the end.

<code>substring(beginIndex, endIndex)</code>
→ Returns everything from beginIndex up to but not including endIndex.

<ins>Example:</ins>

```java
public class SubstringExample {
    public static void main(String[] args) {
        String text = "Hello World";

        // From index 6 to end
        String part1 = text.substring(6);
        System.out.println(part1);   // Output: World

        // From index 0 up to index 5 (excluding 5)
        String part2 = text.substring(0, 5);
        System.out.println(part2);   // Output: Hello

        // From index 3 up to index 7
        String part3 = text.substring(3, 7);
        System.out.println(part3);   // Output: lo W
    }
}
```

#### toUpperCase()

<code>toUpperCase()</code> converts all characters in a string to uppercase.

<ins>Example:</ins>

```java
String text = "Hello Java";
System.out.println(text.toUpperCase());
// Output: HELLO JAVA
```

#### toLowerCase()

<code>toLowerCase()</code> converts all characters in a string to lowercase.

<ins>Example:</ins>

```java
String text = "Hello Java";
System.out.println(text.toLowerCase());
// Output: hello java
```

#### contains()

<code>contains()</code> checks if a string contains another substring. Returns true/false.

<ins>Example</ins>

```java
String text = "Hello Java";

System.out.println(text.contains("Java"));   // true
System.out.println(text.contains("World"));  // false
```

#### startsWith()

<code>startsWith()</code> checks if a string begins with a certain sequence.

<ins>Example:</ins>

```java
String text = "Hello Java";

System.out.println(text.startsWith("Hello")); // true
System.out.println(text.startsWith("Java"));  // false
```

#### endsWith()

<code>endsWith()</code> checks if a string ends with a certain sequence.

```java
String text = "Hello Java";

System.out.println(text.endsWith("Java")); // true
System.out.println(text.endsWith("Hello")); // false
```

## Classes and Objects

1. What is a Class?

A class is a blueprint or template for creating objects.

It defines:
What data an object has (fields / variables)
What actions it can perform (methods)

```java
public class Fish {
    ...
}
```

👉 Fish is a class.
It describes what a fish is and what it can do, but it is not a real fish yet.

Think of a class like a recipe.

```java
public class Fish{
    private String species;
    private int weight;

    public Fish(String species, int weight){
        this.species = species;
        this.weight = weight;
    }

    public String getSpecies(){
        return species;
    }

    public void setSpecies(String species){
         this.species = species;
    }

     public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
         this.weight = weight;
    }

    public void FishSpeak(){
        System.out.println("Pulipuli!");
    }
}
```

## More examples

#### Exercise 1

1. Define a variable <code>age</code> <code>(int)</code> and check whether the person belongs to children **(under 13)**, **teenagers (13–19)**, **adults (20–64)**, or **seniors (65+)**. Print the correct group to
   the terminal. Use <code>if / else / else if</code> for comparison.

```java
import java.util.Scanner;

public class AgeChecker{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("What is your age: ");
int age = scanner.nextInt();

if(age >= 0 && age < 13){
System.out.println("You are a kid.");
}else if(age >= 13 && age <= 19){
System.out.println("You are a teenager.");
}else if(age >= 20 && age <= 64){
System.out.println("You are an adult");
}else if(age >= 65){
System.out.println("You are a senior");
}else{
System.out.println("Invalid");
}

}
}
```

2. Define a grade <code>(int, 0–5)</code> and print a verbal evaluation based on the number:
   **0 = "Failed"**, **1–2 = "Poor"**, **3 = "Satisfactory"**, **4 = "Good"**, **5 = "Excellent"**.
   Use <code>switch/case</code> for comparison. If the value of the grade variable is something other
   than <code>0–5</code>, the program should print <code>“Invalid grade”</code>.

```java
import java.util.Scanner;

public class Grade{
public static void main(String[] args){

Scanner scanner  = new Scanner(System.in);
System.out.println("Type your grade: ");

int grade = scanner.nextInt();

switch(grade){
case 0:
System.out.println("Failed");
break;
case 1:
System.out.println("Poor");
break;
case 2:
System.out.println("Poor");
break;
case 3:
System.out.println("Satisfactory");
break;
case 4:
System.out.println("Good");
break;
case 5:
System.out.println("Excellent");
break;
default:
System.out.println("Invalid");
}

}
}
```

3. Create a variable number <code>(int)</code> and check whether the value assigned to the number
   variable is **even** or **odd**. Print the result to the terminal.

```java
import java.util.Scanner;

public class OddEven{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your number: ");

int num = scanner.nextInt();

if(num % 2 == 0){
System.out.println("It is even");
}else{
System.out.println("It is odd");
}

}
}
```

4. Create a program that generates a random number <code>(int)</code> between **1–5**, and
   check/print whether the number is below or above three.

```java
public class Random{
public static void main(String[] args){
int ran = (int)(Math.random() * 6);

if(ran < 3){
System.out.println(ran + " Random number is below 3");
}else if(ran > 3){
System.out.println(ran + " Random number is above 3");
}else{
System.out.println(ran + " Random number is equal to 3");
}
}
}
```

5. Create a program where you define the name of a month <code>(String)</code> and print how
   many days are in that month (February = 28, April/June/September/November = 30,
   others = 31). Use <code>switch/case</code>.

```java
public class Month {
    public static void main(String[] args) {

        String month = "February";

        switch (month) {
            case "February":
                System.out.println("28 days");
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;

            default:
                System.out.println("31 days");
                break;
        }
    }
}
```

6. Define three integers and print which one is the largest. For example, with the
   numbers 5, 7, 7 the program should print → The largest is 7.

```java
public class Largest{
public static void main (String[] args){
int numOne = 1;
int numTwo = 3;
int numThree = 9;

if( numOne > numTwo && numOne > numThree){
System.out.println("The biggest number is " + numOne);
}else if(numTwo > numOne && numTwo > numThree){
System.out.println("The biggest number is " + numTwo);
}else if(numThree > numOne && numThree > numTwo){
System.out.println("The biggest number is " + numThree);
}
}
}
```

#### Exercise 2 - Methods

1.  Create a program with a method that takes an integer and a text string as input. The method should print the text as many times as the number specifies.

2.  Look up the substring method online. Modify the previously created method to ensure that the first letter of the sentence is capitalized.

```java
import java.util.Scanner;

public class TestMethod{

public static void Print(String text, int num){
for(int i = 0; i<num; i++){
String capital = text.substring(0,1).toUpperCase() + text.substring(1);
System.out.println(capital);
}
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("What do you want to print: ");
String txt = sc.nextLine();
System.out.print("How many times: ");
int times = sc.nextInt();
Print(txt, times);
sc.close();
}
}
```

#### Exersice 3 - Product

Create a method (function) called **Multiplier** that takes two integers as parameters: **n** and **m**. The function returns the product of these two numbers (n\*m).

```bash
public class NumProduct {

    public static int Multiplier(int n, int m) {
        int mult = n * m;
        System.out.println("The product of " + n + " and " + m + " is: " + mult);
        return mult;

    }

    public static void main(String[] args) {
        Multiplier(6, 3);

    }
}
```

#### Exersice 4 - Check Weekday

Create a method called **Weekday** that takes one number (1–7) as a parameter. The method returns the corresponding day of the week. For example, if the parameter is the number 4, the function returns the text "Thursday".

```java
package Weekday;

import java.util.Scanner;

public class Weekday {
    public static String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid day number";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int dayNumber = sc.nextInt();
        String day = getDayOfWeek(dayNumber);
        System.out.println("The day of the week is: " + day);
        sc.close();
    }
}
```

#### Exersice 5 - Print Matrix(nested loops)

```java
public class Matrix {
    public static void PrintMatrix(int matrix) {
        int num = 1;
        for (int i = 0; i < matrix; i++) {
            for (int j = 0; j < matrix; j++) {
                System.out.print(num);
                num++;

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        PrintMatrix(2);
    }
}
```

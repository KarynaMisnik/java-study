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

## Exercise 1

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

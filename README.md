# 🤓

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

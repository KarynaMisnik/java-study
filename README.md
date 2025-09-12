# 🤓

## Exercise 1

Define a variable <code>age</code> <code>(int)</code> and check whether the person belongs to children **(under 13)**, **teenagers (13–19)**, **adults (20–64)**, or **seniors (65+)**. Print the correct group to
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

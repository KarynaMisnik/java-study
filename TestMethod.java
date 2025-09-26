
/*Exercise 2 - Methods
Completion requirements

Exercise 1) Create a program with a method that takes an integer and a text string as input. The method should print the text as many times as the number specifies.

Exercise 2) Look up the substring method online. Modify the previously created method to ensure that the first letter of the sentence is capitalized.

*/
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
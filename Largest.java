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
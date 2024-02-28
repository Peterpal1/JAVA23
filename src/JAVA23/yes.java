package JAVA23;
import java. util .Scanner;
class yes{
public static void main(String[] args) {
int number1 = (int)(Math.random() *10);

int number2 = (int)(Math.random() * 10);
    
//swap if number1 is less than number2 to avoid negative results
if (number1 < number2)
{
int temp = number1;
number1 = number2;
number2 = temp;
}
//Ask a user to enter an answer
System.out.println("What is" + number1 +  " - " + number2 +" ? ");
@SuppressWarnings("resource")
Scanner input = new Scanner(System.in);
int resp = input.nextInt();
    
//Perform the difference
int diff = number1 - number2;
    
//compare user input with the actual difference
if (resp == diff){
System.out.println("Your answer is Correct! \n" +
number1 + " - " + number2 + "=" + diff);
}
else
System.out.println("Your answer is Wrong! \n" +
number1 + " - " + number2 + "=" + diff);
}
}
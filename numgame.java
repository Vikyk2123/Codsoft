import java.util.*;

public class numgame{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("NUMBER GAME");
Random randomobj = new Random();
int num = randomobj.nextInt(100);
int attempts=5;
while(attempts != 0){
System.out.println("ATTEMPTS:" + attempts);
System.out.println("Enter your guess:");
int guess = input.nextInt();
attempts--;
if(guess == num){
 System.out.println("your guess is correct");
 break;
}
else if(guess <= num)
 System.out.println("your guess is too low TRY AGAIN");
else
 System.out.println("your guess is too High TRY AGAIN");

if(attempts == 0 && guess != num)
System.out.println("The correct number is:" +num);
}

}
}
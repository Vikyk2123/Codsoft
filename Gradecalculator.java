import java.util.*;

public class Gradecalculator{
public static void main(String[] args){
Scanner scan= new Scanner(System.in);
int tot=0,subject,i;
char grade;
System.out.println("Number of subjects:");
subject= scan.nextInt();
System.out.println("Enter the Subjects one by one:");
int[] marks = new int[subject];
for(i=0;i<subject;i++){
marks[i] = scan.nextInt();
tot += marks[i];
}
double avg = tot/subject;
if(avg >=90)
	grade='A';
else if( avg >=80)
	grade='B';
else if(avg >=70)
	grade='C';
else if(avg >=60)
	grade='D';
else
	grade='F';
System.out.println("Average: " + avg);
System.out.println("Grade: " + grade);
}
}
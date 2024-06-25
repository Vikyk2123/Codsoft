import java.util.*;
class Bankaccount{
public double bal;
public Bankaccount(double bal){
	this.bal=bal;
}
public double getBalance(){
return bal;
}
public void deposit(double amt){
if(amt>0){
bal += amt;
System.out.println("deposit success: currrent balance: Rs:" + bal + "\n");
}
else{
System.out.println("Invalid deposit amount: 0 \n" );
}
}

public void withdrawl(double amt){
if(amt > 0 && amt <= bal){
bal -= amt;
System.out.println("Withdrawl success balance: Rs:" + bal +"\n");
}
else if(amt>bal){
System.out.println("Insufficient balance current balance Rs:" + bal +"\n");
}
}

public void checkbalance(){
System.out.println("Current balance:"+bal +"\n");
}
}
class Atm{
private Bankaccount acc;
private Scanner scanner;

public Atm(Bankaccount acc){
this.acc= acc;
this.scanner = new Scanner(System.in);
}

public void start(){
int val=1;
while(val > 0){
System.out.println("Welcome to ATM");
System.out.println("Select your option");
System.out.println("1. Deposit");
System.out.println("2. Withdrawl");
System.out.println("3. Check balance");
System.out.println("4. Exit");
 int choice = scanner.nextInt();

switch(choice){
case 1:
handleDeposit();
break;
case 2:
handleWithdrawal();
break;
case 3:
handleCheckBalance();
break;
case 4:
System.out.println("Thankyou for using");
val=0;
break;
default:
System.out.println("Invalid choice");
}
}
}

private void handleDeposit(){
System.out.println("Enter Deposit amount:");
double amt= scanner.nextDouble();
acc.deposit(amt);
}

private void handleWithdrawal(){
System.out.println("Enter withdrawl amount:");
double amt= scanner.nextDouble();
acc.withdrawl(amt);
}
private void handleCheckBalance(){
acc.checkbalance();
}


public static void main(String[] args){
Bankaccount acc= new Bankaccount(1000);
Atm atm=new Atm(acc);
atm.start();
}
}

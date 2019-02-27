package welcome;

import java.util.Scanner;

public class Banking {
	static double Bal = 1000;
 public double withdrawl(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter amt ot deposit");
	 int amt=sc.nextInt();
	 if (amt < Bal){
			Bal=Bal-amt;
			System.out.println("debit " + Bal);
		}
		else
			System.out.println("insufficient balance");
	return Bal;
	 
 }
 public double deposit(){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter amt to deposit");
	 int amt=sc.nextInt();
	 Bal=Bal+amt;
		System.out.println("amount is" + Bal);
	return Bal;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}

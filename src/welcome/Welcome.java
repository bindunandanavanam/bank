package welcome;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		do{
		System.out.println("enter 1 for registration 2 for login");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			Registration r=new Registration();
			r.main1();
			break;
		case 2:
			Login o=new Login();
			o.m1();
			break;
		}
		System.out.println("press 1 to continue");
		 i = sc.nextInt();
	}while(i==1);

}
}


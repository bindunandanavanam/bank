package welcome;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Banking {

	public double withdrawl(double Bal) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amt for withdrawl");
		int amt = sc.nextInt();
		if (amt < Bal) {
			Bal = Bal - amt;
			System.out.println("debit " + Bal);
		} else
			System.out.println("insufficient balance");
		return Bal;

	}

	public double deposit(double Bal) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amt to deposit");
		int amt = sc.nextInt();
		Bal = Bal + amt;
		System.out.println("amount is" + Bal);
		return Bal;

	}

	public static void trans(double Bal) {
		System.out.println("enter choice \n 1. withdrawl \n 2. deposit \n 3. exit");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		double up = 0;
		switch (ch) {

		case 1:
			Banking b = new Banking();
			up = b.withdrawl(Bal);
			break;
		case 2:
			Banking b1 = new Banking();
			up = b1.deposit(Bal);
			break;

		case 3:
			System.out.println("thank you");
			break;

		}
		User u = new User();
		u.setBal((up));
		try {
			FileOutputStream f = new FileOutputStream("E:\\Capg\\RegBank.txt");
			ObjectOutputStream obj = new ObjectOutputStream(f);
			obj.writeObject(u);
			System.out.println("done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package welcome;

import java.io.*;
import java.util.*;

public class Login {
	static int count = 1;

	public static User setInfo() {
		User u = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter login details" + count);
		System.out.println("enter ac");
		u.setAccNo(sc.nextLong());
		System.out.println("enter pwd");
		u.setPswd(sc.nextInt());
		count++;
		return u;
	}

	public void m1() {
		User u = new User();
		Login L = new Login();
		u = L.setInfo();
		try {
			FileInputStream file = new FileInputStream("E:\\Capg\\RegBank.txt");
			ObjectInputStream out = new ObjectInputStream(file);
			ArrayList<User> userlist2 = (ArrayList<User>) out.readObject();
			int t = userlist2.size();
			long t1 = u.getAccNo();
			int t2 = u.getPswd();
			for (int i = 0; i < t; i++) {
				System.out.println(userlist2.get(i).getAccNo() + " " + t1);
				System.out.println(userlist2.get(i).getPswd() + " " + t2);
				if (userlist2.get(i).getAccNo() == t1) {
					if (userlist2.get(i).getPswd() == t2) {
						System.out.println("welcome" + " " + userlist2.get(i).getName() + "\n available bal: "
								+ userlist2.get(i).getBal());
						System.out.println("Banking Process Initiated");
						double m = userlist2.get(i).getBal();
						Banking b = new Banking();
						b.trans(m);
					} else {
						System.out.println("password is incorrect");
						Registration l = new Registration();
						l.main1();
					}
				} else {
					System.out.println("Not a registered user");
					Registration l = new Registration();
					l.main1();
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void disp() {
		System.out.println("enter your choice.\n 1. Withdrawl\n 2. Deposit\n 3. exit");
	}

	public static void main(String args[]) {
		Login l = new Login();
		l.m1();
	}

}

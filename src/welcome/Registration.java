package welcome;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
public class Registration {
	public static User setinfo() {
		User u = new User();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter details");
		Random r = new Random();
		long acc = r.nextLong();
		u.setAccNo(acc);
		System.out.println("enter pswd");
		u.setPswd(sc.nextInt());
		u.setName(sc.next());
		u.setPhno(sc.nextLong());
		System.out.println(u);
		return u;
	}
	public static void main1(){
		ArrayList<User> ua=new ArrayList<>();
		System.out.println("enter no of users");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		ua.add(setinfo());
		System.out.println("acc no is"+" "+ua.get(0).getAccNo());
		try {
			FileOutputStream f=new FileOutputStream("E:\\Capg\\RegBank.txt");
			ObjectOutputStream obj=new ObjectOutputStream(f);
			obj.writeObject(ua);
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

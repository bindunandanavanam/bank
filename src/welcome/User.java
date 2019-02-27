package welcome;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private Long phno;
	private Long accNo;
	private int pswd;
	private double bal;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public Long getAccNo() {
		return accNo;
	}

	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	public int getPswd() {
		return pswd;
	}

	public void setPswd(int pswd) {
		this.pswd = pswd;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

}

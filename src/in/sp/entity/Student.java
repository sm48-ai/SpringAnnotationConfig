package in.sp.entity;

public class Student {
	private int sid;
	private String sname;
	private String semail;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public void showDetails() {
		System.out.println("=========================");
		System.out.println("Student   ID      :"+sid);
		System.out.println("Student name      :"+sname);
		System.out.println("Student Email     :"+semail);
		
	}

}

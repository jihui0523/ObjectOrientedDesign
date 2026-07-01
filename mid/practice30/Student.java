
public class Student extends Person{
	private long sid;
	private String major;
	
	public void setSid(long s) {
		this.sid=s;
	}
	
	public void setMajor(String m) {
		this.major=m;
	}
	
	public long getSid() {
		return sid;
	}
	
	public String getMajor() {
		return major;
	}
	
	Student(){
		super();
		sid=-1;
		major="모름";
	}

	Student(String name){
		super(name);
		sid=-1;
		major="모름";
	}
	
	Student(String name, long sid) {
		super(name);
		this.sid=sid;
		major="모름";
	}
	
	Student(String name, long sid, String major) {
		super(name);
		this.sid=sid;
		this.major=major;
	}
	
	public String toString() {
		return "이름: " + getName() + ", 나이: " + getAge() + "세, 주소: " + getAddress() +
	            ", 학번: " + sid + ", 전공: " + major;
	 }
	
	public String printSafely() {
		return "이름: " + getName() + ", 학번: " + sid + ", 전공: " + major;
	}
}

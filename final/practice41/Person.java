

public class Person {
	private String name;
	 private int age;
	 private String address ;
	 
	 Person(){
		 name="모름";
		 age=-1;
		 address="모름";
	 }
	 
	 Person(String name){
		 this.name=name;
		 age=-1;
		 address="모름";
	 }
	 
	 Person(String name, int age){
		 this.name=name;
		 this.age=age;
		 address="모름";
	 }
	 
	 Person(String name, int age, String address){
		 this.name=name;
		 this.age=age;
		 this.address=address;
	 }
	 
	 public void setName(String n) {
		 this.name=n;
	 }
	 
	 public void setAge(int a) {
		 this.age=a;
	 }
	 
	 public void setAddress(String ad) {
		 this.address=ad;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 public int getAge() {
		 return age;
	 }
	 
	 public String getAddress() {
		 return address;
	 }
	 public String toString() {
		 return "이름: "+getName()+", 나이: "+getAge()+"세, 주소: "+getAddress();
	 }

}

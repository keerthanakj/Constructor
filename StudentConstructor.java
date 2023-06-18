package MyPkg;

class Student{
	String stdname;
	int stdid;
	int stdreg;
	
	public Student(String n,int i, int reg){
		stdname=n;
		stdid=i;
		stdreg=reg;
	}
	
	void display() {
		System.out.println("Student Details.......");
		System.out.println("Student ID:"+stdid);
		System.out.println("Student Name:"+stdname);
		System.out.println("Student Register Number:"+stdreg);
	}
}

public class StudentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("Keerthi",01,304);  
		Student std2 = new Student("Anu",02,301);
		Student std3 = new Student("Priya",03,303);
		
		std1.display();
		std2.display();
		std3.display();	
	}

}

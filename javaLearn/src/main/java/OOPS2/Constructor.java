package OOPS2;

public class Constructor {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		System.out.println(s1.rollno + " - "+ s1.marks);
		Student1 s2 = new Student1(2, 60);
		System.out.println(s2.rollno + " - "+s2.marks);
	}

}

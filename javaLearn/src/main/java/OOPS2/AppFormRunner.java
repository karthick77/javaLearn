package OOPS2;

public class AppFormRunner {

	static String name;
	static int age;
	public static void main(String[] args) {

		AppForm app1 = new AppForm();
		app1.setValues("Rahav", 4);
		name = app1.getName();
		age = app1.getAge();
		System.out.println(name+" - "+age);

		AppForm app2 = new AppForm();
		app2.setValues("Tarak", 5);
		name = app2.getName();
		age = app2.getAge();
		System.out.println(name+" - "+age);
		
		AppForm app3 = new AppForm();
		app3.setValues("Tarak", 7);
		name = app3.getName();
		age = app3.getAge();
		System.out.println(name+" - "+age);
		
	}

}

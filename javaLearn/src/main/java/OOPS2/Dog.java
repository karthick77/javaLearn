package OOPS2;

public class Dog extends Animal {

	boolean isBark = true;
	
	public static void main(String[] args) {
		
		Animal anim = new Animal();
		System.out.println("No of Legs: "+ anim.noLegs);
		anim.canEat();
		anim.canWalk();
		
		Dog dog = new Dog();
		System.out.println("No of Legs: "+ dog.noLegs);
		System.out.println("Can Bark: "+ dog.isBark);
		dog.canEat();
		dog.canWalk();
	}
}

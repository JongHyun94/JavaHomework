package ch07.exam11;

public class Example {
	public static void main(String[] args) {
		Animal animal=new Dog();
		Animal animal2=new Cat();
		
		animal.eat();
		animal.sleep();
		animal.sound();
		((Dog) animal).scratch();
		
		animal2.eat();
		animal2.sleep();
		animal2.sound();
		((Cat) animal2).keepHome();
	}
	
}

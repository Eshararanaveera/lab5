package lab5;

public abstract class animal {
	private String name;
	
	public abstract void speak();
	
	public animal(String name) {
	this.name = name;
	}
	
//	public void display() {
//	System.out.println("My name is " + this.name + ". " + this.speak() + ".");
//	}
}

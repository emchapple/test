
public class Cat {
	
	private String name;
	private String colour;
	private int age;

	public Cat(String name, String colour, int age){
		this.name = name;
		this.colour = colour;
		this.age = age;
	}
	
	public void introduce(){
		System.out.println("Hi, my name is " + name);
		System.out.println("I have  " + colour + " fur");
		System.out.println("and I am " + age +" years old!" );
	}



public static void main(String[] args){
	Cat Egon = new Cat("Egon", "black", 15);
	Egon.introduce();
}	
}
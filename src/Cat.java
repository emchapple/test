
public class Cat extends Animal implements Mammal {
	
	
	private String colour;
	private char sex;
	private int age;
	
	public Cat(String name, String colour, char sex, int age){
		super(name, 4);
		this.sex = sex;
		this.colour = colour;
		this.age = age;
	}
	
	public void introduce(){
		
		System.out.println("Hi, my name is " + name);
		System.out.println("I have  " + colour + " fur");
		System.out.println("and I am " + age +" years old!" );
	}

	public void freakOut(){
		System.out.println("Yoooowwwwlllll!!!!!");
		System.out.println("Hisss !!!!");
		System.out.println("scratch !!!!");
	}


public void giveBirth() {
	if(sex == 'F'){
		System.out.println("Am I even pregnant?");
	}
	else{
		System.out.println("I'm male, dummy!");
	}
	}

public static void main(String[] args){
	Cat Egon = new Cat("Egon", "black", 'M', 15);
	Egon.introduce();
	Egon.walk(3);
	Egon.freakOut();
	Egon.giveBirth();
}
	
}	


public class Animal {

	protected String name;
	private int numberOfLegs;

	public Animal(String name, int numberOfLegs){
		this.name = name;
		this.numberOfLegs = numberOfLegs;
	}
	
	public void walk(int numberOfSteps){
		for(int i=0; i < numberOfSteps; i++){
			System.out.println("Thump!");
		}
	}
}

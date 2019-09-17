
import java.util.*;

public class Dog extends Animal{
	
	
	public Dog(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	
	public String toString() {
		return name;
	}
	
/*	
	public static void main(String[] args) {
		Dog spot = new Dog("spot", 3);
		Dog spot2 = new Dog("spot", 4);
		Dog Sahji = new Dog("Sahji", 4);
				
		ArrayList<Dog> pack = new ArrayList<Dog>();
		pack.add(spot);
		pack.add(spot2);
		pack.add(Sahji);
		
		System.out.println(pack);
	
	}
*/

}

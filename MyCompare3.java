import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCompare3 {
	
	public static void main(String[] args) {
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>() {
			@Override
			public int compare(Animal a, Animal b){
			    int moreLegs = a.getLegs() - b.getLegs();
			    if(moreLegs == 0) {
			    	return a.name.compareTo(b.name);
			    }
			    return moreLegs;
			}
		});
		System.out.println(dogs);
	}
}

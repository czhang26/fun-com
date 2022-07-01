
public class AnimalNode implements Comparable<AnimalNode>{
	
	public String name;
	public AnimalNode next;

	public AnimalNode(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(AnimalNode animal) {		
		return this.name.compareTo(animal.name);
	}

}

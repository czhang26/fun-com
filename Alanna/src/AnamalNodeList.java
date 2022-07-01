import java.util.ArrayList;
import java.util.Collections;

public class AnamalNodeList {
	
	public AnimalNode head;
	public AnimalNode current;
	
	
	public void add(AnimalNode animal){
		if(head==null){  // create head
			head = animal;
			current = animal;
		}else{
			
			if(head.compareTo(animal)>0){ // new added animal is head				
				animal.next = head;
				head = animal;				
			}else{ // new added animal is not head				
			
				while(true){
					if(current.next==null){
						animal.next = current.next;
						current.next=animal;
						break;
					}else{
						current = current.next;
					}	
				}
			}		
		}
	}

	public static void main(String[] args) {
		AnamalNodeList animalList= new AnamalNodeList();
		AnimalNode a = new AnimalNode("b");
		AnimalNode b = new AnimalNode("d");
		AnimalNode c = new AnimalNode("a");
		AnimalNode d = new AnimalNode("z");
		AnimalNode e = new AnimalNode("e");
		animalList.add(e);
		animalList.add(a);
		animalList.add(b);
		animalList.add(c);
		animalList.add(d);
		//System.out.println(animalList.head.name + " " + animalList.head.next.name + " " + animalList.head.next.next.name + " " + animalList.head.next.next.next.name+ " " + animalList.head.next.next.next.next.name);

		
		ArrayList<AnimalNode> aList = new ArrayList<AnimalNode>();
		aList.add(a);
		aList.add(b);
		aList.add(c);
		aList.add(d);
		aList.add(e);
		Collections.sort(aList);
	    for(AnimalNode animal: aList){
			System.out.print(animal.name + ",");
		}
		
		
		
	}

}

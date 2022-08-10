package examples.s12_collection_iterator;

import examples.pets.*;

import static net.mindview.util.Print.*;

import java.util.*;

public class InterfaceVsIterator {
	public static void display(Iterator<Pet> ite) {
		while (ite.hasNext()) {
			Pet p = ite.next();
			printnb(p.id() + ":" + p + " ");
		}
		print();
	}

	public static void display(Collection<Pet> col) {
		for (Pet p : col)
			printnb(p.id() + ":" + p + " ");
		print();
	}

	public static void main(String[] args) {
		List<Pet> petList = Pets.arrayList(8);
		Set<Pet> petSet = new HashSet<>(petList);
		Map<String, Pet> petMap = new LinkedHashMap<>();
		String[] names = (
			"Ralph, Eric, Robin, Lacey, " + "Britney, Sam, Spot, Fluffy"
		).split(", ");
		for (int i = 0; i < names.length; i++)
			petMap.put(names[i], petList.get(i));
		print("petList:");
		display(petList);
		print("petSet:");
		display(petSet);
		print("petList.iterator():");
		display(petList.iterator());
		print("petSet.iterator():");
		display(petSet.iterator());
		print("petMap:\n" + petMap);
		print("petMap.keySet():\n" + petMap.keySet());
		print("petMap.values():");
		display(petMap.values());
		print("petMap.values().iterator():");
		display(petMap.values().iterator());
	}
}

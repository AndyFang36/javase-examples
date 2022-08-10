package examples.s10_map;

import examples.pets.*;

import java.util.HashMap;
import java.util.Map;

public class PetMap {
	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<>();
		petMap.put("my cat", new Cat("Molly"));
		petMap.put("my dog", new Cat("Ginger"));
		petMap.put("my hamster", new Cat("Bosco"));
		System.out.println(petMap);
		Pet dog = petMap.get("my dog");
		System.out.println(dog);
		System.out.println(petMap.containsKey("my dog"));
		System.out.println(petMap.containsValue(dog));
	}
}

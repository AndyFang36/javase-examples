package examples.s07_linkedlist;

import examples.pets.*;

import java.util.*;

import static net.mindview.util.Print.*;

public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
		print("Source:\n" + pets);
		// Identical:
		print("getFirst(): " + pets.getFirst());
		print("element(): " + pets.element());
		// Only differs in empty-list behavior:
		print("peek(): " + pets.peek());
		// Identical; remove and return the first element:
		pets.remove();
		print("remove():\n" + pets);
		pets.removeFirst();
		print("removeFirst():\n" + pets);
		// Only differs in empty-list behavior:
		pets.poll();
		print("poll():\n" + pets);
		pets.addFirst(new Rat());
		print("addFirst(new Rat()):\n" + pets);
		pets.offer(Pets.randomPet());
		print("offer(Pets.randomPet()):\n" + pets);
		pets.add(Pets.randomPet());
		print("add(Pets.randomPet()):\n" + pets);
		pets.addLast(new Hamster());
		print("addLast(new Hamster()):\n" + pets);
		pets.removeLast();
		print("removeLast():\n" + pets);
	}
}

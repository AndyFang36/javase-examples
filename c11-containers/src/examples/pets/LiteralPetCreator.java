//: typeinfo/examples.pets/LiteralPetCreator.java
// Using class literals.
package examples.pets;
import java.util.*;

public class LiteralPetCreator extends PetCreator {
  // No try block needed.
  @SuppressWarnings("unchecked")
  public static final List<Class<? extends Pet>> allTypes =
    Collections.unmodifiableList(Arrays.asList(
      Pet.class, Dog.class, Cat.class,  Rodent.class,
      Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
      Cymric.class, Rat.class, Mouse.class,Hamster.class));
  // Types for random creation:
  private static final List<Class<? extends Pet>> types =
    allTypes.subList(allTypes.indexOf(Mutt.class),
      allTypes.size());
  public List<Class<? extends Pet>> types() {
    return types;
  }	
  public static void main(String[] args) {
    System.out.println(types);
  }
} /* Output:
[class typeinfo.examples.pets.Mutt, class typeinfo.examples.pets.Pug, class typeinfo.examples.pets.EgyptianMau, class typeinfo.examples.pets.Manx, class typeinfo.examples.pets.Cymric, class typeinfo.examples.pets.Rat, class typeinfo.examples.pets.Mouse, class typeinfo.examples.pets.Hamster]
*///:~

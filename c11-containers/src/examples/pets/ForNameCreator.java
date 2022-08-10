//: typeinfo/examples.pets/ForNameCreator.java
package examples.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "typeinfo.examples.pets.Mutt",
    "typeinfo.examples.pets.Pug",
    "typeinfo.examples.pets.EgyptianMau",
    "typeinfo.examples.pets.Manx",
    "typeinfo.examples.pets.Cymric",
    "typeinfo.examples.pets.Rat",
    "typeinfo.examples.pets.Mouse",
    "typeinfo.examples.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~

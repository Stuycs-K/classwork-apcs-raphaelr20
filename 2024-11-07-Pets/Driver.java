// When super.speak() is called from Bird in speak(), 
// the getName() in Animal is overridden by the new getName() in Bird.
// Therefore the name that is printed has the changes that were made to getName() in Bird.java.
// Bird b2 = new Animal(...) didn't work, but the rest did.
// This makes sense because Animals are not always Birds, so a new Animal is-a Bird does not make sense.
// It also makes sense that Animal a2 = new Bird(...) works because all Birds are Animals, just as in Bird is-a Animal.
public class Driver{
    public static void main(String[] args){
      Animal a1 = new Animal("Moo", 5, "Cow");
      a1.speak();
  
      Bird b1 = new Bird("Chirp", 2, "Bird", 5, "Blue");
      b1.speak();

      // Bird b2 = new Animal("Growl", 3, "Grizzly");

      Animal a2 = new Bird("cacaw", 1, "parakeet", 6.2, "rainbow");
      a2.speak();
    }
  }
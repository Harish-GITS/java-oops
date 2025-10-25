package javaoops;

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}
class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}
public class PolymorphismJava {
  public static void main(String[] args) {
    Animal ani = new Animal();  
    Animal pig = new Pig();  
    Animal dog = new Dog();  
    ani.animalSound();
    pig.animalSound();
    dog.animalSound();
  }
}



package Session7;

public class Zoo {
    static void main() {

//        Dog dog = new Dog();
//        dog.makeSound();
//        Animal animal = new Animal();
//        animal.makeSound();

        Animal animal = new Dog(); //Polymorphism
        animal.makeSound();//polymorphic object reference type parent and object type subclass
        ((Dog) animal).bite(); //Casting id required "down casting alshan yshoof al method ely msh 3ndo aclun"
        feed(animal);

        animal = new Cat();
        animal.makeSound();
        ((Cat) animal).scratch();
        feed(animal);

    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here is your Dog food ");
        } else {
            System.out.println("Here is your Cat food ");
        }
    }

    public void polyMethod(int userChoice) {
        Animal animal;
        if (userChoice == 1) {
            animal = new Dog();
        } else {
            animal = new Cat();
        }
    }

}
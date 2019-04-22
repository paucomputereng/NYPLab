public class Ornek1 {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.havla();

        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.havla();
        puppy.weep();

        System.out.println("Puppy is a Dog? = " + (puppy instanceof Dog));
        System.out.println("Puppy is a Animal? = " + (puppy instanceof Animal));
        System.out.println("Dog is a Animal? = " + (dog instanceof Animal));
    }
}

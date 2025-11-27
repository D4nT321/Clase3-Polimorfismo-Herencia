public class App {
    public static void main(String[] args) throws Exception {
        animalSample();
    }

    private static void animalSample() {
        Dog animal = new Dog("Firulais", 3, "Labrador");
        

        System.out.println("Nombre: " + animal.getName());
        animal.makeNoise();
        animal.eat("croquetas");
        animal.bark();
        animal.sleep();
        
        Cat animal2 = new Cat("Dante", 4);
        System.out.println("Nombre: " + animal2.getName());
        animal2.makeNoise();
        animal2.eat("Ratones");
        animal2.scratch();
        animal2.sleep();
    }
}

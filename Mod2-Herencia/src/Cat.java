public class Cat extends Animal {

    public Cat(String name, Integer age) {
        super(name, age);
    }

    public void eat(String food) {
        System.out.println(getName() + " esta comiendo " + food);
    }

    public void scratch() {
        System.out.println(" está rascando.");

    }
    @Override
    public void makeNoise() {
        System.out.println("Miau Miau");
    }

    
}

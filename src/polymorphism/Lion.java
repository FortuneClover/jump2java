package polymorphism;

public class Lion extends Animal implements Barkable{
    @Override
    public void bark() {
        System.out.println("Tiger bark");
    }
}

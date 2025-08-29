package inheritance;

public class Sample {
    public static void main(String[] args){
        Dog houseDog = new HouseDog();
        houseDog.setName("Dog");

        HouseDog houseDog2 = new HouseDog("Harry");

        HouseDog houseDog3 = new HouseDog("MAX", 3);

        houseDog.sleep();
        houseDog2.sleep();
        houseDog3.sleep();
    }
}

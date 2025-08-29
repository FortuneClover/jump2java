package inheritance;

public class HouseDog extends Dog{
    HouseDog(){}
    HouseDog(String name, int age){
        this.setName(name);
        this.setAge(age);
    }
    HouseDog(String name){
        this.setName(name);
    }

    @Override
    void sleep(){
        super.sleep();
        System.out.println(this.name + " zzz in house");
    }
}

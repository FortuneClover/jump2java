class Updater {
    void update(int count){
        System.out.println("Updating count: " + count);
        count++;
        System.out.println("Updating count: " + count);
    }

    void update(Counter counter){
        counter.count++;
    }
}

class Counter {
    int count = 0;
}

public class Callby{
    public static void main(String[] args){
//        Counter myCounter = new Counter();
//        System.out.println("before update:"+myCounter.count);
//        Updater myUpdater = new Updater();
//        myUpdater.update(myCounter.count);
//        System.out.println("after update:"+myCounter.count);
//
//        System.out.println("================================");
//
//        Counter myCounter1 = new Counter();
//        System.out.println("before update:"+myCounter1.count);
//        Updater myUpdater1 = new Updater();
//        myUpdater.update(myCounter1);
//        System.out.println("after update:"+myCounter1.count);

        System.out.println("================================");
        Counter myCounter = new Counter();
        System.out.println(myCounter.toString());
    }
}
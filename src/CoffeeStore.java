import java.util.Scanner;

public class CoffeeStore {
    public static void main(String[] args){
//        CoffeeMachine coffeeMachine = new CoffeeMachine();
//        coffeeMachine.insertItem(CoffeeType.CAFE_LATTE.name(), 1000);
//        coffeeMachine.insertItem(CoffeeType.AMERICANO.name(), 500);
//        coffeeMachine.insertItem(CoffeeType.ICE_AMERICANO.name(), 600);
//        for(String itemName : coffeeMachine.itemlist.keySet()){
//            System.out.println(itemName + " : " + coffeeMachine.itemlist.get(itemName));
//        }
//        System.out.println(coffeeMachine.insertMoney(10000));
//        System.out.println(coffeeMachine.withdrawMoney(1000));
////        System.out.println(coffeeMachine.money);
//        coffeeMachine.sell(CoffeeType.CAFE_LATTE.name(), 2000);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.insertMoney(10000);
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("===================================");
            System.out.printf("\n [INFO] current charge : %d \n\n", coffeeMachine.money);
            System.out.println("1. insert product");
            System.out.println("2. show product list");
            System.out.println("3. delete product");
            System.out.println("4. insert money");
            System.out.println("5. take out money");
            System.out.println("6. sell");
            System.out.println("7. exit");
            System.out.println("===================================");
            System.out.print("Select menu >>>>>>>> ");
            String menu = scanner.next();
            switch(menu) {
                case "1":
                    System.out.println("1. insert product");
                    System.out.print("insert product's name >> ");
                    String name = scanner.next();

                    System.out.print("insert product's price >> ");
                    int price = scanner.nextInt();

                    coffeeMachine.insertItem(name, price);

                    if(coffeeMachine.itemlist.containsKey(name)){
                        System.out.println("insert success");
                    }else{
                        System.out.println("insert fail");
                    }

                    break;

                case "2":
                    System.out.println("2. show product list");
                    if(coffeeMachine.itemlist.isEmpty()){
                        System.out.println("no items in list");
                    }

                    for(String itemName : coffeeMachine.itemlist.keySet()){
                        System.out.println(itemName + " : " + coffeeMachine.itemlist.get(itemName));
                    }

                    break;

                case "3":
                    System.out.println("3. delete product");
                    System.out.println("delete successl");
                    System.out.println("add something");
                    break;
                case "4":
                    System.out.println("4. insert money");
                    break;
                case "5":
                    System.out.println("5. take out money");
                    break;
                case "6":
                    System.out.println("6. sell");
                    break;
                case "7":
                    System.out.println("thank you");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

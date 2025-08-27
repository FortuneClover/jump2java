import java.util.HashMap;
import java.util.Map;

public class CoffeeMachine {
        // attribute
        char name;
        int price;
        Map<String, Integer> itemlist = new HashMap<>();
        int money = 0;

        // methode
        // setting product / intput(product's name and price) & return(void), function name(insertItem)
        public void insertItem(String name, int price){
            itemlist.put(name, price);
        }
        // update product
//        public void updateItem(String name, int price){
//            itemlist.put(name, price);
//        }
        // delete product
        public void deleteItem(String name){
            itemlist.remove(name);
        }

        // insert charge
        public int insertMoney(int money){
            return this.money += money;
        }

        // put down charge
        public int withdrawMoney(int money) {
            if (this.money >= money) {
                this.money -= money;
                return this.money;
            }else{
                money = this.money;
                this.money = 0;
                return money;
            }
        }

        // selling
        public void sell(String name, int inputmoney){
            if(itemlist.containsKey(name)){
                int price = itemlist.get(name);
                if(inputmoney < price){
                    System.out.println("need more money");
                }else{
                    int charge = inputmoney-price;
                    this.money += price;
                    System.out.println("charge is remained " + charge + " dollars");
                }
            }
        }
}

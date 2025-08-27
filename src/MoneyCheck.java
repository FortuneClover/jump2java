import java.util.ArrayList;

public class MoneyCheck {
    public static void main(String[] args){
        ArrayList<String> pocket =  new ArrayList<>();
        pocket.add("2000");
        pocket.add("card");
        pocket.add("gun");
        pocket.add("knife");


        if(Integer.parseInt(pocket.get(0)) >=3000 || pocket.contains("card")){
            System.out.println("take a taxi.");
        }else{
            System.out.println("just walk man.");
        }

    }
}

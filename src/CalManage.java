public class CalManage {
    public static void main (String[] args){
        Calculator cal = new Calculator();
        Calculator cal1 = new Calculator();

        System.out.println(cal.add(1));
        System.out.println(cal.add(2));

        System.out.println(cal1.add(11));
        System.out.println(cal1.add(12));
    }
}

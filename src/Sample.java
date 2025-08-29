public class Sample {

    int a;

    int varTest(int a){
        a++;
        System.out.println("varTest : " + a);
        return a;
    }

    public static void main(String[] args){
        int a = 2;
        Sample s = new Sample();
        a = s.varTest(a);
        System.out.println("main : " + a);
    }
}

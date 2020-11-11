package Java_pectic;

public class Narrowing_Custing {
    public static void main(String[] args ){
        // double - float - long - int - short - byte

        //double to float
        double a = 2.5;
        float b =(float) a;
        System.out.println("narrowing Type custing : "+b);

        // float to long
        float c =(float)5.6;
        long d = (long) c;
        System.out.println("narrowing Type custing : "+d);

        //long to int
        long e = 101020;
        int f = (int)e;
        System.out.println("narrowing Type custing : "+f);

        //int to short
        int g = 8;
        short h = (short) g;
        System.out.println("narrowing Type custing : "+h);

        //short to byte
        short i = 12;
        byte j = (byte) i;
        System.out.println("narrowing Type custing : "+j);

    }

}

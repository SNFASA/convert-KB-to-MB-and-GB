import java.util.Scanner;
public class convert {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilobyte,kb  = ");
        double kilobyte = sc.nextDouble();
        double Megabyte , Gigabyte ;
        Megabyte = kilobyte * 0.001;
        Gigabyte = kilobyte  * 0.000001;
        System.out.println("Megabyte = " + Megabyte +"MB");
        System.out.println("Gigabyte = " + Gigabyte + "GB");
    }
}
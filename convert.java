import java.util.Scanner;
public class convert {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilobyte,kb  = ");
        double kilobyte = sc.nextDouble();
        double Megabyte , Gigabyte ;
        Megabyte = kilobyte / 1024.0;
        Gigabyte = kilobyte  / 1048576;
        System.out.println("Megabyte = " + Megabyte +"MB");
        System.out.println("Gigabyte = " + Gigabyte + "GB");
    }
}

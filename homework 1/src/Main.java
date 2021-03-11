import java.util.Scanner;

public class Main {


    public static void printBytes(long b) {


        if (b >= 1099511627776L) {
            System.out.println(String.format("%.1f", b / 1099511627776.) + " TB");
        } else if (b >= 1073741824) {
            System.out.println(String.format("%.1f", b / 1073741824.) + " GB");
        } else if (b >= 1048576) {
            System.out.println(String.format("%.1f", b / 1048576.) + " MB");
        } else if (b >= 1024) {
            System.out.println(String.format("%.1f", b / 1024.) + " KB");
        } else if (b >= 0) {
            System.out.println(b * 1.0 + " B");
        } else System.out.println("error");

    }
    public static void main(String[] args) {
        System.out.print("Введите количество байт: ");
        Scanner in = new Scanner(System.in);
        long b = in.nextLong();
        printBytes(b);
    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstInt,secondInt,total=1;

        System.out.print("Taban Sayıyı Gİriniz : ");
        firstInt = input.nextInt();

        System.out.print("Üssü Gİriniz : ");
        secondInt = input.nextInt();

        for(int i=1;i<=secondInt;i++) {
            total *=firstInt;
        }
        System.out.print("Sonuc = " + total);
    }
}

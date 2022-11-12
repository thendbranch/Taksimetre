//https://app.patika.dev/
//https://app.patika.dev/thendbranch

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*
        Taksimetre Programı
            Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

            Taksimetre KM başına 2.20 TL tutmaktadır.
            Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
            Taksimetre açılış ücreti 10 TL'dir.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Taksimetreye Hoşgeldiniz");
        System.out.println("Kaç KM gidildi : ");
        int yol = input.nextInt();
        double birim = 2.20;
        double acilis = 10.0;
        double odeme = (yol*birim)+acilis<20 ? 20 : (yol*birim)+acilis;

        System.out.println("Ödenecek Tutar : " + odeme);
        System.out.println("Gidilen KM : " + yol);

    }
}
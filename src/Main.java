import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    /*
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
    çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
     */

        int sayi;
        int toplam=0;

        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("sayi giriniz:");
            sayi=scan.nextInt();

            if (sayi%2==0 && sayi%4==0){
                toplam+=sayi;
            }
        }while (sayi%2==0);
        System.out.println("toplam:"+toplam);

    }
}

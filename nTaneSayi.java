import java.util.Scanner;

public class nTaneSayi {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("Kaç adet sayı gireceksiniz? ");
    int n = scanner.nextInt();

    

    int[] sayilar = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print((i + 1) + ". sayıyı girin: ");
        sayilar[i] = scanner.nextInt();
    }

    int enBuyuk = sayilar[0];
    int enKucuk = sayilar[0];

    for (int i = 1; i < n; i++) {
        if (sayilar[i] > enBuyuk) {
            enBuyuk = sayilar[i];
        }

        if (sayilar[i] < enKucuk) {
            enKucuk = sayilar[i];
        }
    }

    System.out.println("En büyük sayı: " + enBuyuk);
    System.out.println("En küçük sayı: " + enKucuk);

    scanner.close();










    }
}
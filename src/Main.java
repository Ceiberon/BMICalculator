import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kg;
        double boy;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu girin: ");
        kg = input.nextInt();

        System.out.print("Boyunuzu girin (Metre Cinsinden): ");
        boy = input.nextDouble();

        double vucutKitleEndeksi = kg / (boy * boy); // Doğru formül burada kullanıldı.

        System.out.print("Vücut Kitle Endeksiniz: " + vucutKitleEndeksi);
    }
}

import java.util.Scanner;

public class HasilLuasKeliling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menghitung Persegi Panjang
        System.out.println("Menghitung Persegi Panjang");
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();
        PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.hitungKeliling());

        // Menghitung Bujur Sangkar
        System.out.println("\nMenghitung Bujur Sangkar");
        System.out.print("Masukkan sisi: ");
        double sisi = scanner.nextDouble();
        BujurSangkar bs = new BujurSangkar(sisi);
        System.out.println("Luas Bujur Sangkar: " + bs.hitungLuas());
        System.out.println("Keliling Bujur Sangkar: " + bs.hitungKeliling());

        // Menghitung Segitiga
        System.out.println("\nMenghitung Segitiga");
        System.out.print("Masukkan alas: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan sisi 1: ");
        double sisi1 = scanner.nextDouble();
        System.out.print("Masukkan sisi 2: ");
        double sisi2 = scanner.nextDouble();
        System.out.print("Masukkan sisi 3: ");
        double sisi3 = scanner.nextDouble();
        Segitiga segitiga = new Segitiga(alas, tinggi, sisi1, sisi2, sisi3);
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());

        scanner.close();
    }
}
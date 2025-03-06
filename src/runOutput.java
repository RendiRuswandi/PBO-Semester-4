import java.util.Scanner;

public class runOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("  1. Bujur Sangkar");
        System.out.println("  2. Persegi Panjang");
        System.out.println("  3. Segitiga");

        System.out.println("Isikan Pilihan: ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.println("Pilihan Anda adalah Bujur Sangkar");
            System.out.println("Masukkan Panjang Sisi: ");
            double sisi = sc.nextDouble();
            BujurSangkar k1 = new BujurSangkar(sisi);
            k1.infoBujurSangkar();
        } else if (pilihan == 2) {
            System.out.println("Pilihan Anda adalah Persegi Panjang");
            System.out.println("Masukkan Panjang: ");
            double panjang = sc.nextDouble();
            System.out.println("Masukkan Lebar: ");
            double lebar = sc.nextDouble();
            PersegiPanjang k2 = new PersegiPanjang(panjang, lebar);
            k2.infoPersegiPanjang();
        } else if (pilihan == 3) {
            System.out.println("======================");
            System.out.println("1. Segitiga Sama Kaki");
            System.out.println("2. Segitiga Sama Sisi");
            System.out.println("3. Segitiga Sembarang");
            System.out.println("Isikan Pilihan Segitiga: ");
            int pilihanSegitiga = sc.nextInt();

            if (pilihanSegitiga == 1) {
                System.out.println("Pilihan Anda adalah Segitiga Sama Kaki");
                System.out.println("Masukkan Alas: ");
                double alas = sc.nextDouble();
                System.out.println("Masukkan Tinggi: ");
                double tinggi = sc.nextDouble();
                System.out.println("Masukkan Sisi Miring a: ");
                double sisiMiringA = sc.nextDouble();
                
                // Correct constructor usage
                SegitigaSamaKaki m1 = new SegitigaSamaKaki(alas, tinggi, sisiMiringA);
                m1.infoSegitigaSamaKaki();
            } else if (pilihanSegitiga == 2) {
                System.out.println("Pilihan Anda adalah Segitiga Sama Sisi");
                System.out.println("Masukkan Alas: ");
                double alas = sc.nextDouble();
                System.out.println("Masukkan Tinggi: ");
                double tinggi = sc.nextDouble();
                
                // Presuming SegitigaSamaSisi takes 2 parameters
                SegitigaSamaSisi m2 = new SegitigaSamaSisi(alas, tinggi);
                m2.infoSegitigaSamaSisi();
            } else if (pilihanSegitiga == 3) {
                System.out.println("Pilihan Anda adalah Segitiga Sembarang");
                System.out.println("Masukkan Alas: ");
                double alas = sc.nextDouble();
                System.out.println("Masukkan Tinggi: ");
                double tinggi = sc.nextDouble();
                System.out.println("Masukkan Sisi Miring a: ");
                double sisiMiringA = sc.nextDouble();
                System.out.println("Masukkan Sisi Miring b: ");
                double sisiMiringB = sc.nextDouble();
                
                // Correct constructor usage for SegitigaSembarang
                SegitigaSembarang m3 = new SegitigaSembarang(alas, tinggi, sisiMiringA, sisiMiringB);
                m3.infoSegitigaSembarang();
            }
        }
        sc.close(); // Close scanner to avoid resource leak
    }
}
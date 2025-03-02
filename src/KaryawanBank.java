import java.util.Scanner;
public class KaryawanBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");

        System.out.print("Isikan Pilihan: ");
        int pilihan = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Tunjangan: ");
        double tunjangan = sc.nextDouble();

        if (pilihan == 1) {
            System.out.print("Gaji Pokok: ");
            double gapok = sc.nextDouble();
            KaryawanTetap k1 = new KaryawanTetap(nama, gapok, tunjangan);
            k1.infoKaryawan();
        } else if (pilihan == 2) {
            System.out.print("Gaji Harian: ");
            double gaji_per_hari = sc.nextDouble();
            System.out.print("Jumlah Masuk: ");
            int jml_masuk = sc.nextInt();
            KaryawanKontrak k2 = new KaryawanKontrak(nama, tunjangan);
            k2.setKaryawanKontrak(gaji_per_hari, jml_masuk);
            k2.infoKaryawan();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        sc.close();
    }
}
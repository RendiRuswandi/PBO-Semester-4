import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        BankBNI bankBNI = new BankBNI();
        BankBCA bankBCA = new BankBCA();

        // Menguji method overloading
        System.out.println("Uji Bank:");
        System.out.print("Masukkan jumlah uang untuk transfer: ");
        int jumlah = scanner.nextInt();
        System.out.print("Masukkan nomor rekening tujuan: ");
        String rekeningTujuan = scanner.next();
        System.out.print("Masukkan nama bank tujuan: ");
        String bankTujuan = scanner.next();
        bank.transferUang(jumlah, rekeningTujuan, bankTujuan);

        System.out.print("Masukkan berita (opsional, tekan enter jika tidak ada): ");
        scanner.nextLine(); // Clear the buffer
        String berita = scanner.nextLine();
        if (!berita.isEmpty()) {
            bank.transferUang(jumlah, rekeningTujuan, bankTujuan, berita);
        }

        bank.sukuBunga();

        System.out.println("\nUji Bank BNI:");
        System.out.print("Masukkan jumlah uang untuk transfer ke BNI: ");
        jumlah = scanner.nextInt();
        System.out.print("Masukkan nomor rekening tujuan: ");
        rekeningTujuan = scanner.next();
        bankBNI.transferUang(jumlah, rekeningTujuan, "BNI");
        bankBNI.sukuBunga();

        System.out.println("\nUji Bank BCA:");
        System.out.print("Masukkan jumlah uang untuk transfer ke BCA: ");
        jumlah = scanner.nextInt();
        System.out.print("Masukkan nomor rekening tujuan: ");
        rekeningTujuan = scanner.next();
        bankBCA.transferUang(jumlah, rekeningTujuan, "BCA");
        bankBCA.sukuBunga();

        scanner.close();
    }
}
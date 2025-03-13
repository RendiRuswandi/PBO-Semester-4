import java.util.Scanner;

class Bank {
    // Method untuk menghitung biaya transfer berdasarkan bank tujuan
    public double hitungBiayaTransfer(String bankTujuan) {
        switch (bankTujuan.toUpperCase()) {
            case "BNI":
                return 5000; // Biaya transfer ke BNI
            case "BCA":
                return 7000; // Biaya transfer ke BCA
            case "MANDIRI":
                return 6000; // Biaya transfer ke Mandiri
            case "BRI":
                return 4000; // Biaya transfer ke BRI
            default:
                return 10000; // Biaya transfer ke bank lain
        }
    }

    // Method untuk transfer uang ke rekening lain
    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan);
    }

    // Method untuk transfer uang ke rekening lain di bank berbeda
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        double biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " dengan biaya transfer: " + biaya);
    }

    // Method untuk transfer uang dengan tambahan berita
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        double biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("Transfer " + jumlah + " ke rekening " + rekeningTujuan + " di bank " + bankTujuan + " dengan berita: " + berita + " dan biaya transfer: " + biaya);
    }

    // Method untuk mencetak suku bunga standar
    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
}
//
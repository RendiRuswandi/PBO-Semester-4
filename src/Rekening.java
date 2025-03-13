public class Rekening {
    String namaPemilik;
    String nomorRekening;
    double saldo;

    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor: " + jumlah + " berhasil. Saldo anda sekarang: " + saldo);
        } else {
            System.out.println("Jumlah setor harus lebih besar dari 0");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Tarik: " + jumlah + " berhasil. Saldo anda sekarang: " + saldo);
        } else if (jumlah > saldo) {
            System.out.println("Tarik gagal. Saldo tidak cukup.");
        } else {
            System.out.println("Jumlah tarik harus lebih besar dari 0.");
        }
    }
        
    public void tampilkanInfo() {
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Rekening rekening = new Rekening("Rendi", "12345678", 200000.0);
        rekening.tampilkanInfo();
        rekening.setor(5000);
        rekening.tarik(20000);
        rekening.tarik(3000); 
        rekening.tampilkanInfo();
    }
}
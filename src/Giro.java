// Subclass Giro
class Giro extends Rekening {
    private double limitPenarikan;

    // Constructor
    public Giro(String namaPemilik, String nomorRekening, double saldo, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldo);
        this.limitPenarikan = limitPenarikan;
    }

    // Override method tarik
    @Override
    public void tarik(double jumlah) {
        if (jumlah > 0 && (saldo + limitPenarikan) >= jumlah) {
            saldo -= jumlah;
            System.out.println("Tarik: " + jumlah + " berhasil. Saldo sekarang: " + saldo);
        } else {
            System.out.println("Tarik gagal. Melebihi limit penarikan.");
        }
    }
}

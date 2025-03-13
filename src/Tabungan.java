class Tabungan extends Rekening {
    private double bungaTahunan; // Dalam persen

    // Constructor
    public Tabungan(String namaPemilik, String nomorRekening, double saldo, double bungaTahunan) {
        super(namaPemilik, nomorRekening, saldo);
        this.bungaTahunan = bungaTahunan;
    }

    // Override method tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
    }

    // Method untuk menghitung bunga
    public double hitungBunga(int bulan) {
        return (saldo * (bungaTahunan / 100) / 12) * bulan;
    }
}

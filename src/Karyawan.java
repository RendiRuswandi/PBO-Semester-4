class Karyawan {
    String nama;
    double gaji_pokok;
    double tunjangan;

    public Karyawan(String nama, double gapok, double tunjangan) {
        this.nama = nama;
        this.gaji_pokok = gapok;
        this.tunjangan = tunjangan;
    }

    public Karyawan(String nama, double tunjangan) {
        this.nama = nama;
        this.tunjangan = tunjangan; 
    }

    public String getNama() {
        return nama;
    }

    public double getGajiPokok() {
        return gaji_pokok;
    }

    public double getTunjangan() {
        return tunjangan;
    }
}

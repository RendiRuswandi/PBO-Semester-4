public class BangunDatar {
    double sisi;
    double panjang;
    double lebar;

    public BangunDatar(double sisi) {
        this.sisi = sisi;
    }

    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //membuat class setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setPanjangLebar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //membuat class getter
    public double getSisi() {
        return sisi;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    
}
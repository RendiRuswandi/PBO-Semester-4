public class SegitigaSamaSisi extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiMiring;
    
    public SegitigaSamaSisi(double alas, double tinggi) {
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
        // Calculate sisi miring using Pythagorean theorem
        this.sisiMiring = Math.sqrt((alas / 2) * (alas / 2) + tinggi * tinggi);
    }
    
    public void infoSegitigaSamaSisi() {
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi Miring: " + sisiMiring);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas: " + getLuas());
    }

    public double getKeliling() {
        return alas + 2 * sisiMiring;
    }

    public double getLuas() {
        return (alas * tinggi) / 2;
    }

}
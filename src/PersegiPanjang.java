public class PersegiPanjang extends BangunDatar{

    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);

    }

    public double getKeliling(){
        return 2 * (getPanjang() + getLebar());
    }

    public double getLuas(){
        return getPanjang() * getLebar();
    }

    public void infoPersegiPanjang(){
        System.out.println("Panjang: " + getPanjang());
        System.out.println("Lebar: " + getLebar());
        System.out.println("Keliling Persegi Panjang : " + getKeliling());
        System.out.println("Luas Persegi Panjang : " + getLuas());
        System.out.println("========================================");
    }


}
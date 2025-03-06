public class SegitigaSembarang extends Segitiga{
    private double sisiMiringB;

    public SegitigaSembarang(double alas, double tinggi, double sisiMiringA, double sisiMiringB){
        super(alas, tinggi);
        this.sisiMiringB = sisiMiringB;
    }

    public double getKeliling(){
        return super.getAlas() + super.getSisiMiringA() + sisiMiringB;
    }

    public double getLuas(){
        return 0.5 * super.getAlas() * super.getTinggi();
    }

    public void infoSegitigaSembarang(){
        System.out.println("Segitiga Sembarang");
        System.out.println("Alas : " + super.getAlas());
        System.out.println("Tinggi : " + super.getTinggi());
        System.out.println("Sisi Miring a : " + super.getSisiMiringA());
        System.out.println("Sisi Miring b : " + sisiMiringB);
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Luas : " + getLuas());
        System.out.println("=============================");
    }
}
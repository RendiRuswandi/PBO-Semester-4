public class SegitigaSamaKaki extends Segitiga{
    private double sisiMiringA;

    public SegitigaSamaKaki(double alas, double tinggi, double sisiMiringA) {
        super(alas, tinggi);
        this.sisiMiringA = sisiMiringA;
    }

    public double getKeliling(){
        return super.getAlas() + sisiMiringA + sisiMiringA; // Use sisiMiringA twice as it's isosceles
    }

    public double getLuas(){
        return 0.5 * super.getAlas() * super.getTinggi();
    }

    public void infoSegitigaSamaKaki(){
        System.out.println("Segitiga Sama Kaki");
        System.out.println("Alas : " + super.getAlas());
        System.out.println("Tinggi : " + super.getTinggi());
        System.out.println("Sisi Miring a : " + sisiMiringA);
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Luas : " + getLuas());
        System.out.println("=====================================");
    }
}
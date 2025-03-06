public class SegitigaSikuSiku extends Segitiga {

    public SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi);
    }

    public double getKeliling(){
        return super.getAlas() + super.getSisiMiringA() + super.getSisiMiringB();
    }

    public double getLuas(){
        return 0.5 * super.getAlas() * super.getTinggi();
    }

    public void infoSegitigaSikuSiku(){
        System.out.println("Segitiga Siku-Siku");
        System.out.println("Alas : " + super.getAlas());
        System.out.println("Tinggi : " + super.getTinggi());
        System.out.println("Sisi Miring a : " + super.getSisiMiringA());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Luas : " + getLuas());
        System.out.println("=====================================");

    }

}
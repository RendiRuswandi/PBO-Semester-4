public class Segitiga extends BangunDatar {
    double alas;
    double tinggi;
    double sisiMiringA;
    double sisiMiringB;

    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi); 
        this.alas = alas;
        this.tinggi = tinggi;
        sisiMiringA = 1;
        sisiMiringB = 2;

    }

    //membuat setter
    public void setSegitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getKeliling(){
        return alas + sisiMiringA + sisiMiringB;
    }

    public double getLuas(){
        return (alas * tinggi) / 2;
    }

    public double getSisiMiringA(){
        return sisiMiringA;
    }

    public double getSisiMiringB(){
        return sisiMiringB;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    

    public void infoSegitiga(){
        
        System.out.println("Sisi Miring a : " + sisiMiringA);
        System.out.println("Sisi Miring b : " + sisiMiringB);
        System.out.println("Alas : " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Keliling Segitiga: " + getKeliling());
        System.out.println("Luas Segitiga: " + getLuas());
        System.out.println("==========================");

    }


}
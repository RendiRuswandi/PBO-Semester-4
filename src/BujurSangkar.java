public class BujurSangkar extends BangunDatar {

    public BujurSangkar(double sisi) {
        super(sisi);
    }

    public double getKeliling(){
        double total = super.getSisi() * 4;
        return total;
    }

    public double getLuas(){
        double total = super.getSisi() * super.getSisi();
        return total;
    }

    public void infoBujurSangkar(){
        System.out.println("Sisi: " + super.getSisi());
        System.out.println("Luas Bujur Sangkar: " + getLuas());
        System.out.println("Keliling Bujur Sangkar: " + getKeliling());
        System.out.println("===========================================");
        
    }
    

}
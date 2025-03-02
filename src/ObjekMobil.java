public class ObjekMobil {
    public static void main(String[] args) {
        Mobil m1 = new Mobil();
        Mobil m2 = new Mobil();

        m1.setDataMobil("Avanza", "Merah", 0);
        m2.setDataMobil("Ionic", "Putih", 0);

        m1.nyalakanMobil(); // Now this method is defined
        m1.tambahKecepatan(10);
        m1.tambahKecepatan(20);
        m1.tambahKecepatan(10);

        m1.infoMobil();
        m2.infoMobil();
    }
}
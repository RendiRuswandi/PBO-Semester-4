public class Mobil {
    String merk;
    String warna;
    int kecepatan;
    boolean nyala;

    public void setDataMobil(String b, String warna, int k) {
        merk = b;
        kecepatan = k;
        this.warna = warna;
        this.nyala = false; // Initialize the car as off
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void nyalakanMobil() {
        nyala = true; // Set the car to on
        System.out.println("Mobil " + merk + " dinyalakan.");
    }

    public void tambahKecepatan(int k) {
        if (nyala) {
            kecepatan += k;
            System.out.println("Mobil menyala, kecepatan: " + kecepatan);
        } else {
            System.out.println("Mobil belum dinyalakan");
        }
    }  

    public void infoMobil() {
        System.out.println("Merk: " + getMerk());
        System.out.println("Warna: " + getWarna());
        System.out.println("Kecepatan: " + getKecepatan());
        System.out.println("==========================");
    }
}
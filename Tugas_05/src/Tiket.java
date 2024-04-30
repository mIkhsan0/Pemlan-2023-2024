// Kelas abstrak untuk semua jenis tiket
abstract class Tiket {
    //Do your magic here
    protected double hargaTiket;
    protected String namaTiket;

    public Tiket(int hargaTiket, String namaTiket) {
        this.hargaTiket = hargaTiket;
        this.namaTiket = namaTiket;
    }
}
// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama;
    private String tahap;
    private Tiket tiket;
    private int jumlah;

    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public void cetakNota() {
        // Do your magic here
        System.out.println("--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + nama);
        System.out.println("Tahap Pembelian: " + tahap);
        System.out.println("Jenis Tiket: " + tiket.namaTiket);
        System.out.println("Jumlah Tiket: " + jumlah);
        System.out.println("Total Harga: " + cekHargaTiket(tahap, tiket, jumlah));
    }

    public double cekHargaTiket(String tahap, Tiket tiket, int jumlahTiket) {
        double hargaTiket = 0;

        switch (tahap) {
            case "Presale" -> hargaTiket = (tiket.hargaTiket - (tiket.hargaTiket * 20/100)) * jumlahTiket;
            case "Reguler" -> hargaTiket = tiket.hargaTiket * jumlahTiket;
        }

        return hargaTiket;
    }
}

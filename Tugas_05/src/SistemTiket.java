public class SistemTiket {

    private double tiketFestival = 100;
    private double tiketVIP = 150;
    private double tiketVVIP = 200;

    private String tahapPembelian;
    private String jenisTiket;

    private Tiket tiket;

    public void KonversiTiket(String tahapPembelian, String jenisTiket) {
        switch (tahapPembelian) {
            case "1" -> this.tahapPembelian = "Presale";
            case "2" -> this.tahapPembelian = "Reguler";
        }
        if (tahapPembelian.equals("Presale")) {
            switch (jenisTiket) {
                /*case "1" -> this.jenisTiket = "VIP";
                case "2" -> this.jenisTiket = "VVIP";*/

                case "1" -> tiket = new VIP();
                case "2" -> tiket = new VVIP();
            }
        }
        else {
            switch (jenisTiket) {
                /*case "1" -> this.jenisTiket = "Festival";
                case "2" -> this.jenisTiket = "VIP";
                case "3" -> this.jenisTiket = "VVIP";*/

                case "1" -> tiket = new Festival();
                case "2" -> tiket = new VIP();
                case "3" -> tiket = new VVIP();
            }
        }
    }

    public void sistemValidasi(String cekValidasi, String maks) {
        if (!cekValidasi.matches("^[1-" + maks + "]$")) {
            System.out.println("Input tidak valid!");
            System.exit(0);
        }
    }

    public double cekHargaTiket(String jenisTiket, String jumlahTiket) {
        double hargaTiket = 0;
        if (this.tahapPembelian.equals("Presale")) {
            switch (jenisTiket) {
                case "1" -> hargaTiket = (tiketVIP - (tiketVIP * 20/100)) * Integer.parseInt(jumlahTiket);
                case "2" -> hargaTiket = (tiketVVIP - (tiketVVIP * 20/100)) * Integer.parseInt(jumlahTiket);
            }
        }
        else {
            switch (jenisTiket) {
                case "1" -> hargaTiket = tiketFestival * Integer.parseInt(jumlahTiket);
                case "2" -> hargaTiket = tiketVIP * Integer.parseInt(jumlahTiket);
                case "3" -> hargaTiket = tiketVVIP * Integer.parseInt(jumlahTiket);
            }
        }
        return hargaTiket;
    }

    public String getTahapPembelian() {
        return tahapPembelian;
    }

    /*public String getJenisTiket() {
        return jenisTiket;
    }*/

    public Tiket getTiket() {
        return tiket;
    }
}

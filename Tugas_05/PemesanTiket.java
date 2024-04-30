package Tugas05;

import java.util.Scanner;

public class PemesanTiket extends SistemTiket{

    private Scanner inputPemesan;
    private String namaPemesan;
    private String tahapPembelian;
    private String jenisTiket;
    private String jumlahTiket;

    public PemesanTiket() {
        inputPemesan = new Scanner(System.in);

        masukanNamaPemesan();
        pilihTahapPembelian();
        pilihJenisTiket(tahapPembelian);
        masukanJumlahTiket();
        printNota();

        inputPemesan.close();
    }

    public void masukanNamaPemesan() {
        System.out.println("Selamat datang di program pemesanan tiket!");
        System.out.print("Masukan nama pembeli: ");
        namaPemesan = inputPemesan.nextLine();
    }

    public void pilihTahapPembelian() {
        System.out.println("Pilih tahap pembelian:");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): ");
        tahapPembelian = inputPemesan.nextLine();
        sistemValidasi(tahapPembelian, "2");
    }

    public void pilihJenisTiket(String tahapPembelian) {
        System.out.println("Pilih jenis tiket:");
        if (tahapPembelian.equals("1")) {
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): ");
            jenisTiket = inputPemesan.nextLine();
            sistemValidasi(jenisTiket, "2");
        } else if (tahapPembelian.equals("2")) {
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): ");
            jenisTiket = inputPemesan.nextLine();
            sistemValidasi(jenisTiket, "3");
        }
    }

    public void masukanJumlahTiket() {
        System.out.print("Masukan jumlah tiket yang ingin dibeli: ");
        jumlahTiket = inputPemesan.nextLine();
    }

    public void printNota() {
        KonversiTiket(tahapPembelian, jenisTiket);
        System.out.println("--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + namaPemesan);
        System.out.println("Tahap Pembelian: " + getTahapPembelian());
        System.out.println("Jenis Tiket: " + getJenisTiket());
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Total Harga: " + cekHargaTiket(jenisTiket, jumlahTiket));
    }


}

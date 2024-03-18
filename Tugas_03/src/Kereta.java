import java.util.ArrayList;

public class Kereta {

    private String trainName;
    private int trainTicket;
    private int trainTicketTemp;
    private boolean isOldTrain;
    private Ticket order;
    private ArrayList<String> personName; //Tempat penyimpanan buatan sementara
    private ArrayList<String> personDeparture; //Tempat penyimpanan buatan sementara
    private ArrayList<String> personDestination; //Tempat penyimpanan buatan sementara

    //Konstruktor Untuk Kereta Komuter
    public Kereta() {
        trainTicket = 1000;
        isOldTrain = true;

        order = new Ticket();
        personName = new ArrayList<>(1);
        personDeparture = new ArrayList<>(1);
        personDestination = new ArrayList<>(1);
    }
    //Konstruktor Untuk Kereta kajj
    public Kereta(String trainName, int trainTicket) {
        this.trainTicket = trainTicket;

        order = new Ticket(trainName, trainTicket);
        personName = new ArrayList<>(1);
        personDeparture = new ArrayList<>(1);
        personDestination = new ArrayList<>(1);
    }

    //method untuk nambah orang ke penyimpanan buatan sementara agar lebih gampang buat di kelola nanti
    public void tambahTiket(String name) {
        personName.add(name);
    }
    public void tambahTiket(String name, String departure, String destination) {
        personName.add(name);
        personDeparture.add(departure);
        personDestination.add(destination);
    }

    //method untuk nampilkan tiket
    public void tampilkanTiket() {

        //Memasukan data dari tempat penyimpanan buatan sementara ke kelas tiket
        order.setNamaPenumpang(personName.toArray(new String[0]));
        order.setAsal(personDeparture.toArray(new String[0]));
        order.setTujuan(personDestination.toArray(new String[0]));

        //menampilkan sisa tiket jika tiket kurang dari 30
        if (trainTicket < 30) {
            for (int i = 0; i < order.getNamaPenumpang().length; i++) {
                System.out.println("================================================================");
                if (trainTicket > 0) {
                    System.out.println("Tiket berhasil dipesan Sisa tiket tersedia: " + --trainTicket);
                    trainTicketTemp++;
                }
                else
                    System.out.println("Kereta telah habis dipesan, silahkan cari jadwal keberangkatan lainnya");
            }
        } else {
            for (int i = 0; i < order.getNamaPenumpang().length; i++) {
                System.out.println("================================================================");
                System.out.println("Tiket berhasil dipesan");
                trainTicketTemp++;
            }
        }
        System.out.println("================================================================");
        if (trainName == null)
            System.out.println("Daftar penumpang kereta api komuter:");
        else
            System.out.println("Daftar penumpang kereta api " + trainName + ":");

        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < order.getNamaPenumpang().length; i++) {
            if (trainTicketTemp > 0) {
                     replyOrder(i);
                     trainTicketTemp--;
            }
        }
    }

    //method dibuat hanya sebagai subtitusi print biar lebih enak diliat
    private void replyOrder(int i) {
        if (isOldTrain) {
            System.out.println("Nama: " + order.getNamaPenumpang()[i]);
        } else {
            System.out.println("Nama: " + order.getNamaPenumpang()[i]);
            System.out.println("Asal: " + order.getAsal()[i]);
            System.out.println("Tujuan: " + order.getTujuan()[i]);
            System.out.println("--------------------------------------------------------");
        }
    }
}

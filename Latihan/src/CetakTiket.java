public class CetakTiket implements PrinterTiket {

    // SRP: class ini khusus untuk mencetak tiket saja diambil dari ReservasiKereta agar mengurangi beban tugasnya
    public void cetak(String nama, String nik, KeretaApi kereta, int jumlah) {
        System.out.println("Pemesanan berhasil");
        System.out.println("Nama Penumpang : " + nama);
        System.out.println("NIK : " + nik);
        System.out.println("Kereta : " + kereta.getNamaKereta());
        System.out.println("Rute : " + kereta.getRute());
        System.out.println("Jumlah Tiket : " + jumlah);
        System.out.println("Sisa Kursi : " + kereta.getSisaKursi());
    }
}
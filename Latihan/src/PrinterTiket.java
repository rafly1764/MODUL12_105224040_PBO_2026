public interface PrinterTiket {
    // OCP + DIP: ReservasiKereta cukup bergantung ke interface ini
    void cetak(String nama, String nik, KeretaApi kereta, int jumlah); }
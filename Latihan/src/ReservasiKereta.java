import java.util.HashMap;
import java.util.Map;

public class ReservasiKereta {
    private Map<String, KeretaApi> daftarKereta = new HashMap<>();
    private PrinterTiket printerTiket;
    public ReservasiKereta(PrinterTiket printerTiket) {
    this.printerTiket = printerTiket;
        daftarKereta.put("K01", new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.put("K02", new KeretaApi("K02", "Parahyangan", "JKT - BDG", 15));
        daftarKereta.put("K03", new KeretaApi("K03", "Brantas", "JKT - SMG", 5));
    }

    public void lihatJadwal() {
        System.out.println("=== Jadwal Kereta JAVA EXPRESS ===");
        for (KeretaApi k : daftarKereta.values()) {
            k.tampilkanInfo();
        }
    }

    public void pesanTiket(String kodeKereta, String nik, String nama, int jumlah)
            throws RuteTidakDitemukanException, TiketHabisException {
        validasiNik(nik);

        if (jumlah <= 0) {
            throw new DataPenumpangTidakValidException("Jumlah tiket harus lebih dari 0");
        }

        KeretaApi kereta = daftarKereta.get(kodeKereta);

        if (kereta == null) {
            throw new RuteTidakDitemukanException("Kode kereta " + kodeKereta + " tidak ditemukan");
        }

        if (jumlah > kereta.getSisaKursi()) {
            throw new TiketHabisException("Tiket tidak mencukupi", kereta.getNamaKereta(), kereta.getSisaKursi());
        }

        kereta.kurangiKursi(jumlah);
        printerTiket.cetak(nama, nik, kereta, jumlah);
    }

    private void validasiNik(String nik) {
        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("NIK harus berjumlah 16 karakter");
        }

        for (int i = 0; i < nik.length(); i++) {
            if (!Character.isDigit(nik.charAt(i))) {
                throw new DataPenumpangTidakValidException("NIK hanya boleh berisi angka");
            }
        }
    }
}
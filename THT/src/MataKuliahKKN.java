public class MataKuliahKKN implements MataKuliah {
    private String nama;
    private int sks;
    public MataKuliahKKN(String nama, int sks) {
        this.nama = nama;
        this.sks = sks;
    }
    public String getNama() {
        return nama;
    }
    public int getSks() {
        return sks;
    }
    public void tampilkanInfo() {
        System.out.println("Mata kuliah lapangan/KKN: " + nama + " (" + sks + " SKS)");
    }
    public void cekLokasiKegiatan() {
        System.out.println("Lokasi kegiatan KKN dicek untuk " + nama);
    }
}
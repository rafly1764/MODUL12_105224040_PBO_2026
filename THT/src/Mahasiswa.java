public class Mahasiswa {
    private String nim;
    private String nama;
    private String jalurMasuk;
    public Mahasiswa(String nim, String nama, String jalurMasuk) {
        this.nim = nim;
        this.nama = nama;
        this.jalurMasuk = jalurMasuk;
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getJalurMasuk() {
        return jalurMasuk;
    }
}
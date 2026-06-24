public class MataKuliahPraktikum implements MataKuliah, OperasiPraktikum {
    private String nama;
    private int sks;
    public MataKuliahPraktikum(String nama, int sks) {
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
        System.out.println("Mata kuliah praktikum: " + nama + " (" + sks + " SKS)");
    }
    public void alokasiAsistenLab() {
        System.out.println("Asisten lab dialokasikan untuk " + nama);
    }
    public void cekPeralatanPraktikum() {
        System.out.println("Peralatan praktikum dicek untuk " + nama);
    }
}
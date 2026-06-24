public class MataKuliahTeori implements MataKuliah {
    private String nama;
    private int sks;
    public MataKuliahTeori(String nama, int sks) {
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
        System.out.println("Mata kuliah teori: " + nama + " (" + sks + " SKS)");
    }
}
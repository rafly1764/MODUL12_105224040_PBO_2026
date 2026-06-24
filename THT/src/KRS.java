import java.util.ArrayList;
import java.util.List;
public class KRS {
    private Mahasiswa mahasiswa;
    private List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    public KRS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }
    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
    public int hitungTotalSks() {
        int total = 0;
        for (MataKuliah mk : daftarMataKuliah) {
            total += mk.getSks();
        }
        return total;
    }
    public void tampilkanRingkasan() {
        System.out.println("NIM         : " + mahasiswa.getNim());
        System.out.println("Nama        : " + mahasiswa.getNama());
        System.out.println("Jalur Masuk : " + mahasiswa.getJalurMasuk());
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : daftarMataKuliah) {
            System.out.println("- " + mk.getNama() + " (" + mk.getSks() + " SKS)");
        }
        System.out.println("Total SKS   : " + hitungTotalSks());
    }
}
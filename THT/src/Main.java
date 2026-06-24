import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("105224040", "Rafly", "MBKM");
        MataKuliah teori = new MataKuliahTeori("Pemrograman Berorientasi Objek", 3);
        MataKuliahPraktikum praktikum = new MataKuliahPraktikum("Praktikum PBO", 2);
        MataKuliah kkn = new MataKuliahKKN("Kuliah Kerja Nyata", 2);
        praktikum.alokasiAsistenLab();
        praktikum.cekPeralatanPraktikum();
        List<MataKuliah> daftarPilihan = new ArrayList<>();
        daftarPilihan.add(teori);
        daftarPilihan.add(praktikum);
        daftarPilihan.add(kkn);
        DatabaseConnection database = new NoSQLDatabaseConnection();
        KRSRepository repository = new KRSRepository(database);
        KRSValidator validator = new KRSValidator();
        KRSPDFGenerator pdfGenerator = new KRSPDFGenerator();
        UKTCalculator uktCalculator = new UKTMBKMCalculator();
        SistemKRSManager manager = new SistemKRSManager(validator, repository, pdfGenerator, uktCalculator);
        manager.prosesPengisianKRS(mahasiswa, daftarPilihan);
    }
}
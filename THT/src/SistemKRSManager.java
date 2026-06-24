import java.util.List;

public class SistemKRSManager {
    private KRSValidator validator;
    private KRSRepository repository;
    private KRSPDFGenerator pdfGenerator;
    private UKTCalculator uktCalculator;
    public SistemKRSManager(KRSValidator validator, KRSRepository repository, KRSPDFGenerator pdfGenerator, UKTCalculator uktCalculator) {
        this.validator = validator;
        this.repository = repository;
        this.pdfGenerator = pdfGenerator;
        this.uktCalculator = uktCalculator;
    }
    public void prosesPengisianKRS(Mahasiswa mahasiswa, List<MataKuliah> daftarPilihan) {
        KRS krs = new KRS(mahasiswa);
        System.out.println("=== Proses Pengisian KRS Dimulai ===");
        for (MataKuliah mk : daftarPilihan) {
            if (!validator.validasiPrasyarat(mahasiswa, mk)) {
                System.out.println("Prasyarat tidak terpenuhi untuk " + mk.getNama());
                continue;
            }
            if (!validator.validasiBatasSks(krs, mk)) {
                System.out.println("Mata kuliah " + mk.getNama() + " ditolak karena melebihi batas SKS.");
                continue;
            }
            krs.tambahMataKuliah(mk);
        }
        double totalUKT = uktCalculator.hitungUKT(krs);
        pdfGenerator.cetakDrafPDF(krs, totalUKT);
        repository.simpanRiwayat(krs);
        System.out.println("=== Proses Pengisian KRS Selesai ===");
    }
}
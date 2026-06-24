public class KRSPDFGenerator {
    public void cetakDrafPDF(KRS krs, double totalUKT) {
        System.out.println("===== DRAF KRS PDF =====");
        krs.tampilkanRingkasan();
        System.out.println("Total UKT    : Rp" + totalUKT);
        System.out.println("========================");
    }
}
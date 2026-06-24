public class KRSValidator {
    private final int BATAS_MAKSIMAL_SKS = 24;
    public boolean validasiPrasyarat(Mahasiswa mahasiswa, MataKuliah mataKuliah) {
        return mahasiswa != null && mataKuliah != null;
    }
    public boolean validasiBatasSks(KRS krs, MataKuliah mataKuliah) {
        return krs.hitungTotalSks() + mataKuliah.getSks() <= BATAS_MAKSIMAL_SKS;
    }
}
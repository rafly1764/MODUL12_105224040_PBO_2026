public class UKTKaryawanCalculator implements UKTCalculator {
    public double hitungUKT(KRS krs) {
        return krs.hitungTotalSks() * 300000 + 500000;
    }
}
public class UKTMBKMCalculator implements UKTCalculator {
    public double hitungUKT(KRS krs) {
        return krs.hitungTotalSks() * 150000;
    }
}
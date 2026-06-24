public class UKTRegulerCalculator implements UKTCalculator {
    public double hitungUKT(KRS krs) {
        return krs.hitungTotalSks() * 250000;
    }
}
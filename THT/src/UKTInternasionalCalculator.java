public class UKTInternasionalCalculator implements UKTCalculator {
    public double hitungUKT(KRS krs) {
        return krs.hitungTotalSks() * 500000 + 2000000;
    }
}
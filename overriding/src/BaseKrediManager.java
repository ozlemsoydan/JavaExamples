public class BaseKrediManager {
    // "final" overridable'ı ortadan kaldırır.
    // ör:  public final double hesapla(double tutar){} şeklinde kullanılır.
    public double hesapla(double tutar){
        return tutar * 1.18;

    }
}

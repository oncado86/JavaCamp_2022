package Homeworks.h03_overriding;


public class OgrenciKrediManager extends BaseKrediManager {

    @Override
    public double hesapla(double tutar) {
        return (tutar * 1.10);
    }
    
}

package Homeworks.h03_overriding;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BaseKrediManager> krediManagers= Arrays.asList(
            new OgretmenKrediManager(),
            new TarimKrediManager(),
            new OgrenciKrediManager()
        );

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}

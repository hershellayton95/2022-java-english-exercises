package javainproduction._1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("0.00000000000000000000000000000000000000001");
        System.out.println("Big decimal value=" + bigDecimal);
        bigDecimal.divide(new BigDecimal("0.000000000000000000000000000000000000000000001"));
        System.out.println("Big decimal value=" + bigDecimal);
    }
}

package us.deans.javastuff.operations.op06_CurrencyHRTest;

import org.junit.Test;
import us.deans.javastuff.operations.op06_CurrencyHR.OP06_CurrencyHR;

public class OP06CurrencyHRTest {

    @Test
    public void testCurrency() {

        OP06_CurrencyHR op = new OP06_CurrencyHR();
        System.out.println(op.getLocalPrice(12324.134,"US"));
        System.out.println(op.getLocalPrice(12324.134,"India"));
        System.out.println(op.getLocalPrice(12324.134,"China"));
        System.out.println(op.getLocalPrice(12324.134,"France"));

    }

}

package us.deans.javastuff.operations.op06_CurrencyHR;

import us.deans.javastuff.base.BaseOperation;

import java.text.NumberFormat;
import java.util.Locale;

public class OP06_CurrencyHR extends BaseOperation {

    @Override
    public void start() {
        super.start();
    }

    public String getLocalPrice(double payment, String co) {

        NumberFormat nf = null;
        if (co.equals("US")) nf = NumberFormat.getCurrencyInstance(Locale.US);
        if (co.equals("India")) {
            Locale ind = new Locale("en","in");
            nf = NumberFormat.getCurrencyInstance(ind);
        }
        if (co.equals("China")) nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        if (co.equals("France")) nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        assert nf != null;
        return co + ": " + nf.format(payment);
    }

}

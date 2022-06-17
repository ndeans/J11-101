package us.deans.javastuff.operations.op07_StringsHR;

import us.deans.javastuff.base.BaseOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OP07_Strings1HR extends BaseOperation {

    private String A;
    private String B;

    public OP07_Strings1HR(String A, String B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public void start() {
        super.start();

        // 1
        System.out.println(A.length() + B.length());


        // 2
        String C = A;
        List<String> ab = new ArrayList<>(
                Arrays.asList(A, B)
        );

        Collections.sort(ab);

        if (ab.get(0).equals(A))
            System.out.println("No");
        else
            System.out.println("Yes");


        // 3
        String[] a = A.split("");
        a[0] = a[0].toUpperCase();
        A = String.join("", a);

        String[] b = B.split("");
        b[0] = b[0].toUpperCase();
        B = String.join("", b);

        System.out.println(A + " " + B);

    }
}

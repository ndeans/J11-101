package us.deans.javastuff.operations.op07_StringsHR;

import us.deans.javastuff.base.BaseOperation;
import java.util.Arrays;

public class OP10_Strings3HR extends BaseOperation {

    @Override
    public void start() {
        super.start();
    }

    public void start(String s) {
        super.start();

        assert 1 <= s.length();
        assert s.length() <= 4 * (int) Math.pow(10, 5);

        String[] array = s.split("[^A-Za-z]");

        java.util.ArrayList<String> list = new java.util.ArrayList<>(
                Arrays.asList(array)
        );

        // list.removeIf(n -> (n.matches("[^A-Za-z]")));
        list.removeIf(n -> (n.matches("")));

        System.out.println(list.size());

        for(String t: list) {
            System.out.println(t);
        }
    }
}

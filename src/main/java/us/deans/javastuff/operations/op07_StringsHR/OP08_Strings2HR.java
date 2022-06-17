package us.deans.javastuff.operations.op07_StringsHR;

import us.deans.javastuff.base.BaseOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OP08_Strings2HR extends BaseOperation {

    private String s;
    private int k;
    private String largest;
    private String smallest;


    public OP08_Strings2HR(String s, int k) {
        this.s = s;
        this.k = k;
    }

    @Override
    public void start() {
        super.start();
        outSmallestAndLargest();
    }

    public void outSmallestAndLargest() {

        List<String> words = new ArrayList<>();

        for (int i = 0; i < s.length()-(k-1); i++) {
            String word = s.substring(i, i + k);
            words.add(word);
        }
        printOut(words);
        words.sort(Comparator.naturalOrder());
        printOut(words);
        smallest = words.get(0);
//      words.sort(Comparator.reverseOrder());
        java.util.Collections.reverse(words);
        printOut(words);
        largest = words.get(0);

        System.out.println("\n" + smallest + ", " + largest);

    }

    void printOut(List<String> words) {

        System.out.println();
        for (String word: words) {
            System.out.println(word);

        }

    }

}

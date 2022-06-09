package us.deans.javastuff.operations.op04_GoDaddyInt;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class OP04GoDaddyLookUpTest {

    @Test
    public void testOp04() {

        List<String> data = new ArrayList<>(
                Arrays.asList("aba","dwx","efe","ex","e")
        );

        List<String> queries = new ArrayList<>(
                Arrays.asList("1-3","2-5","3-4")
        );

        OP04_GoDaddy_LookUp op04 = new OP04_GoDaddy_LookUp();

        List<Integer> scoreList = op04.getScore(data, queries);

        scoreList.forEach(System.out::println);
    }
}

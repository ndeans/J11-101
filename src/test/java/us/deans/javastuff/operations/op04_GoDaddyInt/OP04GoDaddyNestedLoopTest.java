package us.deans.javastuff.operations.op04_GoDaddyInt;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OP04GoDaddyNestedLoopTest {

    @Test
    public void testop04_2() {

        List<String> listOfWords = new ArrayList<>(
                Arrays.asList("aba", "dwx", "efe", "ex", "e"));

        List<String> listOfQueries = new ArrayList<>(
                Arrays.asList("1-3", "2-5", "3-4"));

        OP04_GoDaddy_NestedLoop op4_2 = new OP04_GoDaddy_NestedLoop();
        List<Integer> ListOfScores = op4_2.getScoreList(listOfWords, listOfQueries);

        ListOfScores.forEach(System.out::println);

    }
}

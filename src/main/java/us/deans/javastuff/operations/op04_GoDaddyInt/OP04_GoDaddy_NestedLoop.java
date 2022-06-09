package us.deans.javastuff.operations.op04_GoDaddyInt;

import us.deans.javastuff.base.BaseOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OP04_GoDaddy_NestedLoop extends BaseOperation {

    @Override
    public void start() {
        super.start();
    }

    public List<Integer> getScoreList(List<String> words, List<String> queries) {

        List<Integer> scoreList = new ArrayList<>();
        List<String> vowels = new ArrayList<>(
                Arrays.asList("a", "e", "o", "u")
        );

        for (String query: queries) {

            int points = 0;
            String[] tokens = query.split("-");
            int start = Integer.parseInt(tokens[0]);
            int stop = Integer.parseInt(tokens[1]);

            for (int i = start; i < stop; i++) {

                String word = words.get(i);
                String first = word.substring(0,1);
                String last = word.substring(word.length()-1);

                if (vowels.contains(first) && vowels.contains(last)) points++;

            }
            scoreList.add(points);
        }

        return scoreList;
    }

}

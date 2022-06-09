package us.deans.javastuff.operations.op04_GoDaddyInt;

import us.deans.javastuff.base.BaseOperation;

import java.util.*;

public class OP04_GoDaddy_LookUp extends BaseOperation {

    @Override
    public void start() {
        super.start();
    }

    public List<Integer> getScore(List<String> data, List<String> queries) {

        List<Integer> scoreList = new ArrayList<>();
        List<String> vowels = new ArrayList<>(
                Arrays.asList("a","e","i","o","u"));
        Map<Integer, Integer> pointMap = new HashMap<>();
        int wordNum = 0;

        for (String word: data) {
            int point = 0;
            wordNum++;
            String first = word.substring(0,1);
            String last = word.substring(word.length()-1);
            if (vowels.contains(first) && vowels.contains(last)) point = 1;
            pointMap.put(wordNum,point);
        }

        for (String query: queries) {
            int queryPts = 0;
            String[] queryRange = query.split("-");
            int start = Integer.parseInt(queryRange[0]);
            int stop = Integer.parseInt(queryRange[1]);

            for (int j = start; j < stop + 1; j++ ) {
                queryPts = queryPts + pointMap.get(j);
            }
            scoreList.add(queryPts);
        }

        return scoreList;
    }

}

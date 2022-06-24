package us.deans.javastuff.operations.op09_AnagramHR;

import us.deans.javastuff.base.BaseOperation;

import java.util.HashMap;
import java.util.Map;

public class OP09_Anagram extends BaseOperation {



    @Override
    public void start() {
        super.start();
        System.out.println("Is WHAT an anagram?");
    }

    public void start(String a, String b) {
        super.start();
        if (isAnagram(a,b)) System.out.println("nah"); else System.out.println("yup");
    }

    public boolean isAnagram(String a, String b) {

        Map<String, Integer> a_map = new HashMap<>();
        Map<String, Integer> b_map = new HashMap<>();

        a = a.toLowerCase(); b = b.toLowerCase();
        String[] a_array = a.split("");
        String[] b_array = b.split("");

        if (a_array.length != b_array.length) return false;

        for (String letter: a_array) {
            if (a_map.containsKey(letter)) {
                Integer p = a_map.get(letter);
                a_map.replace(letter,p,p+1);
            }
            else a_map.put(letter,1);

        }

        for (String letter: b_array) {

            if (a_map.containsKey(letter)) {
                if (b_map.containsKey(letter)) {
                    Integer p = b_map.get(letter);
                    b_map.replace(letter,p,p+1);
                }
                else b_map.put(letter, 1);

            } else return false;

        }

        if (a_map.size() != b_map.size()) return false;

        for (String key: a_map.keySet()){
            if (!a_map.get(key).equals(b_map.get(key))) {
                return false;
            }
        }

        return true;
    }

}

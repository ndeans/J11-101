package us.deans.javastuff.operations.op02;

import us.deans.javastuff.base.BaseOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This test is from the Optimizely Interview:
 * input: CSV with records indicating name, age and state of people
 * output the average age (in decimal)
 *
 */
public class OP02_AverageAge extends BaseOperation {

    @Override
    public void start() {
        super.start();
        List<Person> data = buildDataSet();
        report(data);
    }

    private List<Person> buildDataSet() {

        File file = new File("src/main/resources/optimizely1.csv");
        List<Person> list = new ArrayList<>();

        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();
            while(scan.hasNext()) {
                String[] fields = scan.nextLine().split(",");
                list.add(new Person(Integer.parseInt(fields[1]),fields[0],fields[2]));
            }
        } catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public void report(List<Person> people) {

        Set<String> states = new HashSet<>();
        for (Person person: people) {
            System.out.println("..." + person.getName() + ", " + person.getAge() + ", " + person.getState());
            states.add(person.getState());
        }

        double averageAge = people.stream().collect(Collectors.averagingDouble(Person::getAge));
        System.out.println("Average Age: " + averageAge);

        Map<String, Long> stateCounts = new HashMap<>();
        for (String state: states) {
            long count = people.stream().filter(v -> v.getState().equals(state)).count();
            stateCounts.put(state, count);
        }
        // System.out.println("States...");
        // stateCounts.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("States by Count...");
        stateCounts.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEach(System.out::println);

    }
}

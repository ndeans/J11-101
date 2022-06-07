package us.deans.javastuff.operations.op02_Optimizely;

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
public class OP02_IntOptimizely extends BaseOperation {

    private List<State> stateData;
    private double averageAgeRound1;

    @Override
    public void start() {

        super.start();
        List<Person> p_data = this.getPeopleData();
        double averageAgeRound1 = this.getAverageAgeAll(p_data);
        List<State> s_data = this.getStateData(p_data);

        report(s_data,averageAgeRound1);

    }

    protected List<Person> getPeopleData() {

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

    protected double getAverageAgeAll(List<Person> people) {



        // double averageAgeRound1 = total average age
        double averageAge = people.stream().collect(Collectors.averagingDouble(Person::getAge));
        return Math.round(averageAge * 100.0)/100.0;
    }


    protected List<State> getStateData(List<Person> people) {

        // build state list
        Set<String> states = new HashSet<>();
        for (Person person: people) {
            // System.out.println("..." + person.getName() + ", " + person.getAge() + ", " + person.getState());
            states.add(person.getState());
        }

        // build state data
        List<State> stateData = new ArrayList<>();
        for (String state: states) {

            // int countInt = count of people per state
            long count = people.stream().filter(v -> v.getState().equals(state)).count();
            int countInt = (int) count;

            // int averageAgeInt = average age per state
            double averageAge = people.stream().filter(v -> v.getState().equals(state)).collect(Collectors.averagingDouble(Person::getAge));
            int averageAgeInt = (int) Math.ceil(averageAge);

            // int averageAgeInRangeInt = average age within range, per state
            double averageAgeInRange = people.stream()
                    .filter(v -> v.getState().equals(state) && v.getAge() > 15 && v.getAge() < 55)
                    .collect(Collectors.averagingDouble(Person::getAge));
            int averageAgeInRangeInt = (int) Math.ceil(averageAgeInRange);

            // System.out.println("Average Age for " +  state + ": " + "(int) " + averageAgeInt + ", (int) " + averageAgeInRangeInt);

            stateData.add(new State(state, countInt, averageAgeInt, averageAgeInRangeInt));

        }

        return stateData;
    }

    protected void report(List<State> stateData, double averageAgeRound1) {

        this.stateData = stateData;
        this.averageAgeRound1 = averageAgeRound1;

        System.out.println("\nReport:\n");

        // 1. select round(avg(age), 1) from people
        // overall average age, rounded to 1 decimal place)
        System.out.println(averageAgeRound1);
        System.out.println();


        // 2. select state, count(*) from people group by state order by count(*) desc
        // number of people in each state, ordered most to least)
        List<State> sortedByCount = stateData.stream()
                .sorted(Comparator.comparingInt(State::getPopulation).reversed())
                .collect(Collectors.toList());
        sortedByCount.forEach(s -> System.out.println(s.getAbbrv() + "," + s.getPopulation()));
        System.out.println();


        // 3. select state, round(avg(age), 0) from people group by state order by avg(age)
        // (average age per state, ordered smallest to largest average)
        List<State> sortedByAverageAge = stateData.stream()
                .sorted(Comparator.comparingInt(State::getAvgage))
                .collect(Collectors.toList());
        sortedByAverageAge.forEach(s -> System.out.println(s.getAbbrv() + "," + s.getAvgage()));
        System.out.println();

        // 4. select state, round(avg(age), 0) from people where age > 15 AND age < 55 group by state order by state
        // (average age per state for people between 15 and 55 years old, ordered by state name)
        List<State> sortedByState = stateData.stream()
                .sorted(Comparator.comparing(State::getAbbrv))
                .collect(Collectors.toList());
        for (State state: sortedByAverageAge) {
            if (state.getAvgageInRange() < 1) sortedByState.remove(state);
        }
        sortedByState.forEach(s -> System.out.println(s.getAbbrv() + "," + s.getAvgageInRange()));
        System.out.println();

    }

}

package us.deans.javastuff.operations.op02_OptimizelyInt;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OP02IntOptimizelyTest {

    OP02_IntOptimizely op2 = new OP02_IntOptimizely();

    @Test
    public void test1_BuildDataSet() {

        List<Person> p_data = op2.getPeopleData();
        for (Person person : p_data) {
            System.out.println(person.getName() + "," + person.getAge() + "," + person.getState());
        }
        System.out.println();
    }

    @Test
    public void test2_Process() {

        List<Person> p_data = op2.getPeopleData();
        List<State> s_data = op2.getStateData(p_data);
        // query state data
        for (State state: s_data) {
            System.out.println(state.getAbbrv() + ", " + state.getPopulation() + ", " + state.getAvgage() + ", " +  state.getAvgageInRange());
        }
        System.out.println();

    }

    @Test
    public void test3_Complete() {
        op2.start();
    }

}

package us.deans.javastuff.operations.op02_OptimizelyInt;

public class State {

    private final String abbrv;
    private final int population;
    private final int avgage;
    private final int avgageInRange;

    public State(String abbrv, int population, int avgage, int avgageInRange) {
        this.abbrv = abbrv;
        this.population = population;
        this.avgage = avgage;
        this.avgageInRange = avgageInRange;
    }

    public String getAbbrv() {
        return abbrv;
    }

    public int getAvgage() {
        return avgage;
    }

    public int getPopulation() {
        return population;
    }

    public int getAvgageInRange() {
        return avgageInRange;
    }

}

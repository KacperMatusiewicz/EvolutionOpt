package l;

import java.util.ArrayList;
import java.util.List;


public class Configuration<I> {
    private int generationAmountLimit;
    private FitnessFunctionDerivativeStopCriteria derivative;
    private int populationSize;
    private List<I> initialIndividuals;

    private Configuration(int generationAmountLimit, int populationSize) {
        this.generationAmountLimit = generationAmountLimit;
        this.populationSize = populationSize;
    }
    
    
    public static Configuration create(int generationAmountLimit, int populationSize){
        return new Configuration(generationAmountLimit, populationSize);
    }
    
    public Configuration withDerivative(int generationsAmount, double fitnessFunctionChange){
        
        this.derivative = new FitnessFunctionDerivativeStopCriteria(generationsAmount, fitnessFunctionChange);
        return this;
    }
    public Configuration withPopulation(List<I> initialIndividuals){
        this.initialIndividuals = new ArrayList(initialIndividuals);
        return this;
    }

    public int getGenerationAmountLimit() {
        return generationAmountLimit;
    }

    public FitnessFunctionDerivativeStopCriteria getDerivative() {
        return derivative;
    }

    public int getPopulationSize() {
        return populationSize;
    }

    public List<I> getInitialIndividuals() {
        return initialIndividuals;
    }
    
    
}

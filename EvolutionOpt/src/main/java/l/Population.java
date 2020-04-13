package l;

import java.util.TreeMap;

public class Population<I> {
    
    private final IndividualService<I> service;
    private final Configuration<I> config;
    private TreeMap<Double, I> population = new TreeMap();

    
    public Population(IndividualService<I> service, Configuration config) {
        this.service = service;
        this.config = config;
    }

    
    public Result<I> solve(){
        init();
        while(true){
            
        }
    }

    private void init() {
        if(config.getInitialIndividuals()!= null){
            config.getInitialIndividuals().forEach(individual -> population.put(service.fitnessFunction(individual), individual));
        }
        for(int i=population.size(); i<config.getPopulationSize(); i++){
            I individual = service.createRandom();
            //population.put(service.fitnessFunction(a), value)
        }
    }
    
}

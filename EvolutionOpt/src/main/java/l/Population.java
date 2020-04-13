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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

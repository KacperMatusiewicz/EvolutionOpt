
package l;

public class FitnessFunctionDerivativeStopCriteria {
    
    public final int generationsAmount;
    public final double fitnessFunctionChange;

    public FitnessFunctionDerivativeStopCriteria(int generations, double fitnessFunctionChange) {
        this.generationsAmount = generations;
        this.fitnessFunctionChange = fitnessFunctionChange;
    }
    
}

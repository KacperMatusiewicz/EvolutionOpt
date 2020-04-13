package l;

public abstract class IndividualService<I> {
    
    public abstract I cross(I a, I b);
    public abstract I mutate(I a);
    public abstract I normalize(I a);
    public abstract double fitnessFunction(I a);
    public abstract I createRandom();
}

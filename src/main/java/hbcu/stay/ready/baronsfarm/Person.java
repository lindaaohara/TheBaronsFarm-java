package hbcu.stay.ready.baronsfarm;

public abstract class Person implements Eater, NoiseMaker{
    private String name;

    public abstract void setName(String name);

    public abstract String getName();



    @Override
    public String makeNoise(){
        return "Ol' McBaron had a farm";

    }


}

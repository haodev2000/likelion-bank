package model;

public class CurrentAccount extends Account{
    private String name;
    private float OverdraftLimit;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public float getOverdraftLimit() {
        return OverdraftLimit;
    }

    public void setOverdraftLimit(float overdraftLimit) {
        OverdraftLimit = overdraftLimit;
    }
}

package org.studyeasy;

public abstract class Animal {
    private int order;
    protected String name;

    public Animal(String n){
        this.name=n;
    }

    public abstract String name();

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder(){
        return order;
    }

    public boolean isOlderThan(Animal a){
        return this.order<a.getOrder();
    }
}

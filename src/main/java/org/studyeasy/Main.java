package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        AnimalQueue aq=new AnimalQueue();
        aq.enQueue(new Cat("Kiki"));
        aq.enQueue(new Dog("Oscar"));
        aq.enQueue(new Cat("Kari"));
        aq.enQueue(new Dog("Dexter"));
        aq.enQueue(new Cat("Rekin"));
        System.out.println(aq.deQueueDogs().name());
        System.out.println(aq.deQueueAny().name());
    }
}
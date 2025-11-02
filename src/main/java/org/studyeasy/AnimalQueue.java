package org.studyeasy;
import java.util.LinkedList;
public class AnimalQueue {
    LinkedList<Dog> dog=new LinkedList<Dog>();
    LinkedList<Cat> cat=new LinkedList<Cat>();
    private int order=0;

    public void enQueue(Animal a){
        a.setOrder(order);
        order++;
        if(a instanceof Dog){
            dog.addLast((Dog) a);
        }else if(a instanceof Cat){
            cat.addLast((Cat) a);
        }
    }

    public int size(){
        return dog.size()+cat.size();
    }

    public Dog deQueueDogs(){
        return dog.poll();
    }
    public Dog dogPeek(){
        return dog.peek();
    }

    public Cat deQueueCats(){
        return cat.poll();
    }
    public Cat catPeek(){
        return cat.peek();
    }

    public Animal deQueueAny(){
        if(dog.size()==0){
            return deQueueCats();
        } else if (cat.size()==0) {
            return deQueueDogs();
        }
        Dog dogs=dog.peek();
        Cat cats=cat.peek();
        if(dogs.isOlderThan(cats)){
            return dog.poll();
        }else{
            return cat.poll();
        }
    }


    public Animal peek(){
        if(dog.size()==0){
            return cat.peek();
        } else if (cat.size()==0) {
            return dog.peek();
        }
        Dog dogs=dog.peek();
        Cat cats=cat.peek();
        if(dogs.isOlderThan(cats)){
            return dog.peek();
        }else{
            return cat.peek();
        }
    }
}

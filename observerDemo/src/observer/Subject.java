package observerDemo.src;


import java.util.ArrayList;
import java.util.List;

public class Subject {
    
    // List to keep track of the observers.
    private List<Observer> observers = new ArrayList<Observer>();
    
    // State of the subject.
    private int state;

    // Getter method to access the state.
    public int getState() {
        return state;
    }

    // Setter method to change the state and notify all observers.
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();  // Notify all attached observers whenever state changes.
    }

    // Method to attach an observer to the subject.
    public void attach(Observer observer){
        observers.add(observer);  // Add the observer to the list.
    }

    // Method to detach an observer from the subject.
    public void detach(Observer observer) {
        observers.remove(observer);  // Remove the observer from the list.
    }

    // Notify all the observers by calling their update() method.
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();  // Call the update method for each observer in the list.
        }
    }    
}
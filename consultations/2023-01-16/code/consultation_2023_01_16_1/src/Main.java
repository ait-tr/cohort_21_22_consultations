public class Main {
    public static void main(String[] args) {
        ObservedClass observedClass = new ObservedClass();

        Observer observer1= new Observer1();
        Observer observer2= new Observer2();


        observedClass.addObserver(observer1);
        observedClass.addObserver(observer2);

        observedClass.setObservedState("hello");


    }
}
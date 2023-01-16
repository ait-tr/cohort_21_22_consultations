public class Handler5 implements PersonHandler{

    @Override
    public boolean test(Person p) {
        return true;
    }

    @Override
    public void action(Person p) {
        p.incAge();
    }
}

package spring.bean.b_scope.Bean;

public class Child {

    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Child{" +
                "toy=" + toy +
                '}';
    }
}

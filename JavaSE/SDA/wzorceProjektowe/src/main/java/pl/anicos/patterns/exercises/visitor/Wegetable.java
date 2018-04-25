package pl.anicos.patterns.exercises.visitor;

public class Wegetable implements ItemElement {
    int price;
    boolean bio;

    public Wegetable(int price, boolean bio) {
        this.price = price;
        this.bio = bio;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

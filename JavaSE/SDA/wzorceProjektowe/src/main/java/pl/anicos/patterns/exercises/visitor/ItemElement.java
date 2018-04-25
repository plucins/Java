package pl.anicos.patterns.exercises.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}

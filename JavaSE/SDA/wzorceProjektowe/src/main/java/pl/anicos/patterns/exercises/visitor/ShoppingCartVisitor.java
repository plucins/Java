package pl.anicos.patterns.exercises.visitor;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Wegetable wegetable);
    int visit(Fruit fruit);
}

package repoInterface;

public interface IRepository<T> {

    T GetById(int id);
    void add(T entity);
    void remove(T entity);
    void update(T entity);

}

package repositorio;

public interface Repositorio<T, U> {

    public T save(T objeto);

    public T update(T objeto);

    public T find(U primaryKey);

    public Boolean delete(U objeto);
}

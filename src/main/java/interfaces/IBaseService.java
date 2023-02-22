package interfaces;

import java.util.List;
public interface IBaseService<T> {
    public List<T> getAll();

    public T get(int id);

    public void create(T model);

    public void delete(T model);

    public void update(T model);
}

package context.Interfaces;

public interface IContext<T> {

    /**
     * Deletes existing entity in the database of type T
     * @param entity The object of type T that needs to be deleted
     * @return if query was successful or not
     */
    boolean delete(T entity);

    /**
     * Updates the existing entity in the database of type T
     * @param entity The object of type T that needs to be updated
     * @return if query was successful or not
     */
    boolean update(T entity);

    /**
     * Creates a new entity in the database of type T
     * @param entity The object of type T that needs to be put in the database
     * @return the created id
     */
    int create(T entity);

}

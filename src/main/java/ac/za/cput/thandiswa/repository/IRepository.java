package ac.za.cput.thandiswa.repository;

public interface IRepository <T, ID>{
    T create (T t);
    T update (T t);
    void delete (ID id);
    T read (ID id);
}

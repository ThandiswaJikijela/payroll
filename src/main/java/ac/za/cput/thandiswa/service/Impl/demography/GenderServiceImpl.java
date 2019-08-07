package ac.za.cput.thandiswa.service.Impl.demography;

import ac.za.cput.thandiswa.domain.demography.Gender;
import ac.za.cput.thandiswa.repository.Impl.demography.GenderRepositoryImpl;
import ac.za.cput.thandiswa.repository.demography.GenderRepository;
import ac.za.cput.thandiswa.service.demography.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {

    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    private GenderServiceImpl(){
        this.repository = GenderRepositoryImpl.getRepository();
    }

    public static GenderServiceImpl getService(){
        if(service == null) service = new GenderServiceImpl();
        return service;
    }

    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Gender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }
}

package ac.za.cput.thandiswa.repository.Impl.demography;

import ac.za.cput.thandiswa.domain.demography.Gender;
import ac.za.cput.thandiswa.repository.demography.GenderRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl repository = null;
    private Map<String, Gender> genderMap;

    private GenderRepositoryImpl(){genderMap = new HashMap<>();}

    public static GenderRepositoryImpl getRepository(){
        if(repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }


    @Override
    public Gender create(Gender gender) {
        return null;
    }

    @Override
    public Gender update(Gender gender) {
        return null;
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public Gender read(String s) {
        return null;
    }

    @Override
    public Set<Gender> getAll() {
        return null;
    }
}

package ac.za.cput.thandiswa.repository.Impl.demography;

import ac.za.cput.thandiswa.domain.demography.Gender;
import ac.za.cput.thandiswa.repository.demography.GenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepositoryImpl implements GenderRepository {

    private static GenderRepositoryImpl repository = null;
    private Set<Gender> genderMap;

    private GenderRepositoryImpl(){this.genderMap = new HashSet<>();}

    private Gender findGender(String female){
        return this.genderMap.stream()
                .filter(gender -> gender.getFemale().trim().equals(female))
                .findAny()
                .orElse(null);
    }

    public static GenderRepositoryImpl getRepository(){
        if (repository == null) repository = new GenderRepositoryImpl();
        return repository;
    }


    @Override
    public Gender create(Gender gender) {
        this.genderMap.add(gender);
        return gender;
    }

    @Override
    public Gender update(Gender gender) {
        Gender gender1 = findGender(gender.getMale());
        if (gender1 != null){
            this.genderMap.remove(gender1);
            return create(gender);
        }
        return null;
    }

    @Override
    public void delete(String female) {
        Gender gender = findGender(female);
        if (gender != null)this.genderMap.remove(gender);
    }

    @Override
    public Gender read(String male) {
        Gender gender = findGender(male);
        return gender;
    }

    @Override
    public Set<Gender> getAll() {

        return this.genderMap;
    }
}

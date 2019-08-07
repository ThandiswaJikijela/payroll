package ac.za.cput.thandiswa.repository.Impl.demography;

import ac.za.cput.thandiswa.domain.demography.Race;
import ac.za.cput.thandiswa.repository.demography.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {

    private static RaceRepositoryImpl repository = null;
    private Set<Race> races;

    private RaceRepositoryImpl(){
        this.races = new HashSet<>();
    }

    private Race findRace(final String african){
        return this.races.stream()
                .filter(race -> race.getAfrican().trim().equals(african))
                .findAny()
                .orElse(null);
    }

    public static RaceRepositoryImpl getRepository() {
        if (repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }

    @Override
    public Race create(Race race) {
        this.races.add(race);
        return race;
    }

    @Override
    public Race update(Race race) {
        Race toDelete = findRace(race.getColoured());
        if(toDelete != null){
            this.races.remove(toDelete);
            return create(race);
        }
        return null;
    }

    @Override
    public void delete(String white) {
        Race race = findRace(white);
        if (race !=null) this.races.remove(race);

    }

    @Override
    public Race read(final String african) {
        Race race = findRace(african);
        return race;
    }

    @Override
    public Set<Race> getAll() {
        return this.races;
    }

}

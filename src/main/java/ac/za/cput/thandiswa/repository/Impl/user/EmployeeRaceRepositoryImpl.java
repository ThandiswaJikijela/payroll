package ac.za.cput.thandiswa.repository.Impl.user;

import ac.za.cput.thandiswa.domain.user.EmployeeRace;
import ac.za.cput.thandiswa.repository.user.EmployeeRaceRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {
    private static EmployeeRaceRepositoryImpl repository = null;
    private Set<EmployeeRace> employeeRaces;

    private EmployeeRaceRepositoryImpl(){
        this.employeeRaces = new HashSet<>();
    }

    private EmployeeRace findEmployeeRace(final String raceID){
        return this.employeeRaces.stream()
                .filter(employeeRace -> employeeRace.getRaceID().trim().equals(raceID))
                .findAny()
                .orElse(null);
    }

    public static EmployeeRaceRepositoryImpl getRepository() {
        if (repository == null) repository = new EmployeeRaceRepositoryImpl();
        return repository;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        this.employeeRaces.add(employeeRace);
        return employeeRace;
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        EmployeeRace toDelete = findEmployeeRace(employeeRace.getEmpNum());
        if(toDelete != null){
            this.employeeRaces.remove(toDelete);
            return create(employeeRace);
        }
        return null;
    }

    @Override
    public void delete(String empNum) {
        EmployeeRace employeeRace = findEmployeeRace(empNum);
        if (employeeRace !=null) this.employeeRaces.remove(employeeRace);

    }

    @Override
    public EmployeeRace read(String raceID) {
        EmployeeRace employeeRace = findEmployeeRace(raceID);
        return employeeRace;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.employeeRaces;
    }
}

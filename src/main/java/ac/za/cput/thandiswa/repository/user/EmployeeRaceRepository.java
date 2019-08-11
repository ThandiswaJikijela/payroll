package ac.za.cput.thandiswa.repository.user;

import ac.za.cput.thandiswa.domain.user.EmployeeRace;
import ac.za.cput.thandiswa.repository.IRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends IRepository<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}

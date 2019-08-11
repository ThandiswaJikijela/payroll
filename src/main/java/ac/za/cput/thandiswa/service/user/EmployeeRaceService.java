package ac.za.cput.thandiswa.service.user;

import ac.za.cput.thandiswa.domain.user.EmployeeRace;
import ac.za.cput.thandiswa.service.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}

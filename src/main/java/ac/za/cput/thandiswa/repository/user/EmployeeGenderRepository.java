package ac.za.cput.thandiswa.repository.user;

import ac.za.cput.thandiswa.domain.user.EmployeeGender;
import ac.za.cput.thandiswa.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}

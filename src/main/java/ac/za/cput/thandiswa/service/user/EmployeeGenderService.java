package ac.za.cput.thandiswa.service.user;

import ac.za.cput.thandiswa.domain.user.EmployeeGender;
import ac.za.cput.thandiswa.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}

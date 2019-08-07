package ac.za.cput.thandiswa.service.user;

import ac.za.cput.thandiswa.domain.user.Employee;
import ac.za.cput.thandiswa.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}

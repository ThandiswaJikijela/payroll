package ac.za.cput.thandiswa.repository.user;

import ac.za.cput.thandiswa.domain.user.Employee;
import ac.za.cput.thandiswa.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}

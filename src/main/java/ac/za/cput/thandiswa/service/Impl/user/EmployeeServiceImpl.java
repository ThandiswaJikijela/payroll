package ac.za.cput.thandiswa.service.Impl.user;

import ac.za.cput.thandiswa.domain.user.Employee;
import ac.za.cput.thandiswa.repository.Impl.user.EmployeeRepositoryImpl;
import ac.za.cput.thandiswa.repository.user.EmployeeRepository;
import ac.za.cput.thandiswa.service.user.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){
        this.repository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeServiceImpl getService(){
        if (service == null) service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.repository.update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }
}

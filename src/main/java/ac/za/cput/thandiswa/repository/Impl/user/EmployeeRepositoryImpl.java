package ac.za.cput.thandiswa.repository.Impl.user;

import ac.za.cput.thandiswa.domain.user.Employee;
import ac.za.cput.thandiswa.repository.user.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> employees;

    private EmployeeRepositoryImpl(){
        this.employees = new HashSet<>();
    }

    private Employee findEmployee(final String empNum){
        return this.employees.stream()
                .filter(employee -> employee.getEmpNum().trim().equals(empNum))
                .findAny()
                .orElse(null);
    }

    public static EmployeeRepositoryImpl getRepository() {
        if (repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        Employee toDelete = findEmployee(employee.getEmpNum());
        if(toDelete != null){
            this.employees.remove(toDelete);
            return create(employee);
        }
        return null;
    }

    @Override
    public void delete(String empNum) {
        Employee employee = findEmployee(empNum);
        if (employee !=null) this.employees.remove(employee);
    }

    @Override
    public Employee read(final String empNum) {
        Employee employee = findEmployee(empNum);
        return employee;
    }

    @Override
    public Set<Employee> getAll() {
        return this.employees;
    }
}

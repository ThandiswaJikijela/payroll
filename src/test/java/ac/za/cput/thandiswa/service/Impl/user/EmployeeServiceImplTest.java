package ac.za.cput.thandiswa.service.Impl.user;

import ac.za.cput.thandiswa.domain.user.Employee;
import ac.za.cput.thandiswa.factory.user.EmployeeFactory;
import ac.za.cput.thandiswa.repository.Impl.user.EmployeeRepositoryImpl;
import ac.za.cput.thandiswa.repository.user.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeServiceImplTest {
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Vuzo","Ranana");
    }

    @Test
    public void create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created, this.employee);
    }

    @Test
    public void update() {
        String newName = "Gerry";
        Employee updated = new Employee.Builder().name(newName).build();
        System.out.println("In update, about_to_updated = " + employee.getName());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newName, updated.getName());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(employee.getEmpNum());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, surname = "+ employee.getSurname());
        Employee read = this.repository.read(employee.getSurname());
        getAll();
        assertNotEquals(employee,read);
    }

    @Test
    public void getAll() {
        Set<Employee> genders = this.repository.getAll();
    }
}
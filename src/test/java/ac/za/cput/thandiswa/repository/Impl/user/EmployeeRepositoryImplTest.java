package ac.za.cput.thandiswa.repository.Impl.user;

import ac.za.cput.thandiswa.domain.user.Employee;
import ac.za.cput.thandiswa.factory.user.EmployeeFactory;
import ac.za.cput.thandiswa.repository.user.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRepositoryImplTest {
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmployee("Thandie","Jicks");
    }

    @Test
    public void create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created,this.employee);
    }

    @Test
    public void update() {
        String newName = "Zulu";
        Employee updated = new Employee.Builder().surname(newName).build();
        System.out.println("In update, about_to_update = " + employee.getSurname());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newName, updated.getSurname());
    }

    @Test
    public void delete() {
        this.repository.delete(employee.getName());
    }

    @Test
    public void read() {
        System.out.println("In read, name = " + employee.getName());
        Employee read = this.repository.read(employee.getName());
        getAll();
        assertNotEquals(employee, read);
    }

    @Test
    public void getAll() {
        Set<Employee> all = this.repository.getAll();
    }
}
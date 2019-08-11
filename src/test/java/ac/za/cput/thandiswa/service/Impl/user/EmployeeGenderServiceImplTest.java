package ac.za.cput.thandiswa.service.Impl.user;

import ac.za.cput.thandiswa.domain.user.EmployeeGender;
import ac.za.cput.thandiswa.factory.user.EmployeeGenderFactory;
import ac.za.cput.thandiswa.repository.Impl.user.EmployeeGenderRepositoryImpl;
import ac.za.cput.thandiswa.repository.user.EmployeeGenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderServiceImplTest {
    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.getEmployeeGender("T76457","F763545");
    }

    @Test
    public void create() {
        EmployeeGender created = this.repository.create(this.employeeGender);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created, this.employeeGender);
    }

    @Test
    public void update() {
        String newName = "W89494";
        EmployeeGender updated = new EmployeeGender.Builder().genderID(newName).build();
        System.out.println("In update, about_to_updated = " + employeeGender.getGenderID());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newName, updated.getGenderID());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(employeeGender.getGenderID());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, employee ID = "+ employeeGender.getEmpNum());
        EmployeeGender read = this.repository.read(employeeGender.getEmpNum());
        getAll();
        assertNotEquals(employeeGender,read);
    }

    @Test
    public void getAll() {
        Set<EmployeeGender> genders = this.repository.getAll();
    }
}
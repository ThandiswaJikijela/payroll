package ac.za.cput.thandiswa.repository.Impl.user;

import ac.za.cput.thandiswa.domain.user.EmployeeGender;
import ac.za.cput.thandiswa.factory.user.EmployeeGenderFactory;
import ac.za.cput.thandiswa.repository.user.EmployeeGenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryImplTest {
    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.getEmployeeGender("M785437","W763873");
    }

    @Test
    public void create() {
        EmployeeGender created = this.repository.create(this.employeeGender);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created,this.employeeGender);
    }

    @Test
    public void update() {
        String newName = "W98652";
        EmployeeGender updated = new EmployeeGender.Builder().empNum(newName).build();
        System.out.println("In update, about_to_update = " + employeeGender.getEmpNum());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newName, updated.getEmpNum());
    }

    @Test
    public void delete() {
        this.repository.delete(employeeGender.getGenderID());
    }

    @Test
    public void read() {
        System.out.println("In read, gender ID = " + employeeGender.getGenderID());
        EmployeeGender read = this.repository.read(employeeGender.getGenderID());
        getAll();
        assertNotEquals(employeeGender, read);
    }

    @Test
    public void getAll() {
        Set<EmployeeGender> all = this.repository.getAll();
    }
}
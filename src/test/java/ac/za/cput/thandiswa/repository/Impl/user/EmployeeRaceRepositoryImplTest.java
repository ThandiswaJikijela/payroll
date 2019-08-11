package ac.za.cput.thandiswa.repository.Impl.user;

import ac.za.cput.thandiswa.domain.user.EmployeeRace;
import ac.za.cput.thandiswa.factory.user.EmployeeRaceFactory;
import ac.za.cput.thandiswa.repository.user.EmployeeRaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceRepositoryImplTest {
    private EmployeeRaceRepository repository;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRaceRepositoryImpl.getRepository();
        this.employeeRace = EmployeeRaceFactory.getEmployeeRace("97639746","hw7692w");
    }

    @Test
    public void create() {
        EmployeeRace created = this.repository.create(this.employeeRace);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created,this.employeeRace);
    }

    @Test
    public void update() {
        String newName = "836895";
        EmployeeRace updated = new EmployeeRace.Builder().empNum(newName).build();
        System.out.println("In update, about_to_update = " + employeeRace.getEmpNum());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newName, updated.getEmpNum());
    }

    @Test
    public void delete() {
        this.repository.delete(employeeRace.getRaceID());
    }

    @Test
    public void read() {
        System.out.println("In read, gender ID = " + employeeRace.getRaceID());
        EmployeeRace read = this.repository.read(employeeRace.getRaceID());
        getAll();
        assertNotEquals(employeeRace, read);
    }

    @Test
    public void getAll() {
        Set<EmployeeRace> all = this.repository.getAll();
    }
}
package ac.za.cput.thandiswa.service.Impl.user;

import ac.za.cput.thandiswa.domain.user.EmployeeRace;
import ac.za.cput.thandiswa.factory.user.EmployeeRaceFactory;
import ac.za.cput.thandiswa.repository.Impl.user.EmployeeRaceRepositoryImpl;
import ac.za.cput.thandiswa.repository.user.EmployeeRaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceServiceImplTest {
    private EmployeeRaceRepository repository;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRaceRepositoryImpl.getRepository();
        this.employeeRace = EmployeeRaceFactory.getEmployeeRace("W7143822","6534th");
    }

    @Test
    public void create() {
        EmployeeRace created = this.repository.create(this.employeeRace);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created, this.employeeRace);
    }

    @Test
    public void update() {
        String newName = "7832648";
        EmployeeRace updated = new EmployeeRace.Builder().raceID(newName).build();
        System.out.println("In update, about_to_updated = " + employeeRace.getRaceID());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newName, updated.getRaceID());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(employeeRace.getRaceID());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, employee ID = "+ employeeRace.getEmpNum());
        EmployeeRace read = this.repository.read(employeeRace.getEmpNum());
        getAll();
        assertNotEquals(employeeRace,read);
    }

    @Test
    public void getAll() {
        Set<EmployeeRace> genders = this.repository.getAll();
    }
}
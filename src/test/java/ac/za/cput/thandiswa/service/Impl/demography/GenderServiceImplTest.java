package ac.za.cput.thandiswa.service.Impl.demography;

import ac.za.cput.thandiswa.domain.demography.Gender;
import ac.za.cput.thandiswa.factory.demography.GenderFactory;
import ac.za.cput.thandiswa.repository.Impl.demography.GenderRepositoryImpl;
import ac.za.cput.thandiswa.repository.demography.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderServiceImplTest {
    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender("Boy","girl");
    }

    @Test
    public void create() {
        Gender created = this.repository.create(this.gender);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created, this.gender);
    }

    @Test
    public void update() {
        String newName = "Gerry";
        Gender updated = new Gender.Builder().male(newName).build();
        System.out.println("In update, about_to_updated = " + gender.getMale());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newName, updated.getMale());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(gender.getFemale());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, female = "+ gender.getFemale());
        Gender read = this.repository.read(gender.getFemale());
        getAll();
        assertNotEquals(gender,read);
    }

    @Test
    public void getAll() {
        Set<Gender> genders = this.repository.getAll();
    }
}
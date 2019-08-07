package ac.za.cput.thandiswa.repository.Impl.demography;

import ac.za.cput.thandiswa.domain.demography.Gender;
import ac.za.cput.thandiswa.factory.demography.GenderFactory;
import ac.za.cput.thandiswa.repository.demography.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {

    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender("sizwe","girlly");
    }

    @Test
    public void create() {
        Gender created = this.repository.create(this.gender);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created,this.gender);
    }

    @Test
    public void update() {
        String newName = "Boy";
        Gender updated = new Gender.Builder().male(newName).build();
        System.out.println("In update, about_to_update = " + gender.getMale());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newName, updated.getMale());
        //getAll();

    }

    @Test
    public void delete() {
        //Gender savedGender = getSavedGender();
        this.repository.delete(gender.getFemale());
        //getAll();
    }

    @Test
    public void read() {
        //Gender saveGender = getSavedGender();
        System.out.println("In read, female = " + gender.getFemale());
        Gender read = this.repository.read(gender.getFemale());
        //System.out.println("In read, read = " + read);
        getAll();
        assertNotEquals(gender, read);
    }

    @Test
    public void getAll() {
        Set<Gender> all = this.repository.getAll();
        //System.out.println("In getAll, all = " + all);
    }
}
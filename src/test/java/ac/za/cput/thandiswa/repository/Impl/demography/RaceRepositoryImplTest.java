package ac.za.cput.thandiswa.repository.Impl.demography;

import ac.za.cput.thandiswa.domain.demography.Race;
import ac.za.cput.thandiswa.factory.demography.RaceFactory;
import ac.za.cput.thandiswa.repository.demography.RaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {
    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.getRace("IsiXhosa","English","Afrikaans", "Hindi");
    }

    @Test
    public void create() {
        Race created = this.repository.create(this.race);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created,this.race);
    }

    @Test
    public void update() {
        String newName = "IsiZulu";
        Race updated = new Race.Builder().african(newName).build();
        System.out.println("In update, about_to_update = " + race.getAfrican());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newName, updated.getAfrican());
    }

    @Test
    public void delete() {
        this.repository.delete(race.getIndian());
    }

    @Test
    public void read() {
        System.out.println("In read, coloured = " + race.getColoured());
        Race read = this.repository.read(race.getColoured());
        getAll();
        assertNotEquals(race, read);
    }

    @Test
    public void getAll() {
        Set<Race> all = this.repository.getAll();
    }
}
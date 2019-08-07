package ac.za.cput.thandiswa.factory.demography;

import ac.za.cput.thandiswa.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void getRace() {
        String african = "IsiXhosa";
        String white = "English";
        String coloured = "Afrikaans";
        String indian = "Hindi";
        Race race = RaceFactory.getRace(african,white,coloured,indian);
        System.out.println(race);
        Assert.assertNotNull(race.toString());
    }
}
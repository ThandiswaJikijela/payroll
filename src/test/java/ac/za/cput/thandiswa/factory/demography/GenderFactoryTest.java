package ac.za.cput.thandiswa.factory.demography;

import ac.za.cput.thandiswa.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void getGender() {
        String male = "Boy";
        String female = "Girl";
        Gender gender = GenderFactory.getGender(male, female);
        System.out.println(gender);
        Assert.assertNotNull(gender.toString());
    }
}
package ac.za.cput.thandiswa.factory.user;

import ac.za.cput.thandiswa.domain.user.EmployeeRace;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeRaceFactoryTest {

    @Test
    public void getEmployeeRace() {
        String raceID = "a63763";
        String empNum = "624013g";
        EmployeeRace employeeRace = EmployeeRaceFactory.getEmployeeRace(raceID,empNum);
        System.out.println(employeeRace);
        Assert.assertNotNull(employeeRace.toString());
    }
}
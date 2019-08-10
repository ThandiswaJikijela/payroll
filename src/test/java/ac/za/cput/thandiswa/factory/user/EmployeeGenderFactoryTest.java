package ac.za.cput.thandiswa.factory.user;

import ac.za.cput.thandiswa.domain.user.EmployeeGender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeGenderFactoryTest {

    @Test
    public void getEmployeeGender() {
        String genderID = "f86599235";
        String empNum = "W7162399";
        EmployeeGender employeeGender = EmployeeGenderFactory.getEmployeeGender(genderID,empNum);
        System.out.println(employeeGender);
        Assert.assertNotNull(employeeGender.toString());
    }
}
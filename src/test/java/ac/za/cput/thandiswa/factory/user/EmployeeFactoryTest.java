package ac.za.cput.thandiswa.factory.user;

import ac.za.cput.thandiswa.domain.user.Employee;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {
        String name = "Thandie";
        String surname = "Jikijela";
        Employee employee = EmployeeFactory.getEmployee(name,surname);
        System.out.println(employee);
        Assert.assertNotNull(employee.toString());
    }
}
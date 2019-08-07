package ac.za.cput.thandiswa.factory.user;

import ac.za.cput.thandiswa.domain.user.Employee;
import ac.za.cput.thandiswa.util.EmpNums;

public class EmployeeFactory {
    public static Employee getEmployee(String name, String surname){
        return new Employee.Builder().empNum(EmpNums.generateId())
                .name(name)
                .surname(surname)
                .build();
    }
}

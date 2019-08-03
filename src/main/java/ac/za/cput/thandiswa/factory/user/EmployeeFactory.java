package ac.za.cput.thandiswa.factory.user;

import ac.za.cput.thandiswa.domain.user.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(String empNum, String name, String surname){
        return new Employee.Builder().empNum(empNum)
                .name(name)
                .surname(surname)
                .build();
    }
}

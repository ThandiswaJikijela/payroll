package ac.za.cput.thandiswa.factory.user;

import ac.za.cput.thandiswa.domain.user.EmployeeGender;

public class EmployeeGenderFactory {
    public static EmployeeGender getEmployeeGender(String genderID, String empNum){
        return new EmployeeGender.Builder().genderID(genderID)
                .empNum(empNum)
                .build();
    }
}

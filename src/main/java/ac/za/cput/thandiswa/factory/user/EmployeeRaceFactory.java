package ac.za.cput.thandiswa.factory.user;

import ac.za.cput.thandiswa.domain.user.EmployeeRace;

public class EmployeeRaceFactory {
    public static EmployeeRace getEmployeeRace(String raceID, String empNum) {
        return new EmployeeRace.Builder().raceID(raceID)
                .empNum(empNum)
                .build();
    }
}

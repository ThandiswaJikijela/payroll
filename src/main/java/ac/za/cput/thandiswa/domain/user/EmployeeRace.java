package ac.za.cput.thandiswa.domain.user;

public class EmployeeRace {
    private String raceID;
    private String empNum;

    private EmployeeRace() {
    }

    private EmployeeRace(Builder builder) {
        this.raceID = builder.raceID;
        this.empNum = builder.empNum;
    }

    public String getRaceID() {
        return raceID;
    }

    public String getEmpNum() {
        return empNum;
    }

    public static class Builder {
        private String raceID, empNum;

        public Builder raceID (String raceID) {
            this.raceID = raceID;
            return this;
        }

        public Builder empNum(String empNum) {
            this.empNum = empNum;
            return this;
        }

        public EmployeeRace build() {
            return new EmployeeRace(this);
        }
    }

    public String toString() {
        return "EmployeeRace{" +
                "Race ID='" + raceID + '\'' +
                ", Employee ID ='" + empNum + '\'' +
                '}';
    }
}

package ac.za.cput.thandiswa.domain.user;


public class EmployeeGender {
    private String genderID;
    private String empNum;

    private EmployeeGender() {
    }

    private EmployeeGender(Builder builder) {
        this.genderID = builder.genderID;
        this.empNum = builder.empNum;
    }

    public String getGenderID() {
        return genderID;
    }

    public String getEmpNum() {
        return empNum;
    }

    public static class Builder {
        private String genderID, empNum;

        public Builder genderID(String genderID) {
            this.genderID = genderID;
            return this;
        }

        public Builder empNum(String empNum) {
            this.empNum = empNum;
            return this;
        }

        public EmployeeGender build() {
            return new EmployeeGender(this);
        }
    }

    public String toString() {
        return "EmployeeGender{" +
                "Gender ID='" + genderID + '\'' +
                ", Employee ID ='" + empNum + '\'' +
                '}';
    }
}

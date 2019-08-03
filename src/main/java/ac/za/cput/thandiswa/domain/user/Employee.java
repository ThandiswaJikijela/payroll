package ac.za.cput.thandiswa.domain.user;

public class Employee {
    private String empNum, name, surname;

    private Employee(){}

    private Employee (Builder builder){
        this.empNum = builder.empNum;
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder{
        private String empNum, name, surname;

        public Builder empNum(String empNum)
        {
            this.empNum = empNum;
            return this;
        }

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder surname(String surname)
        {
            this.surname = surname;
            return this;
        }

        public Builder copy(Employee employee){
            this.empNum = employee.empNum;
            this.name = employee.name;
            this.empNum = employee.empNum;

            return this;
        }

        public Employee build() {return new Employee(this);}
    }

    public String toString(){
        return "Employee{" +
                "Employee number ='" + empNum + '\'' +
                ", Name ='" + name + '\'' +
                ", Surname ='" + surname + '\'' +
                '}';
    }
}
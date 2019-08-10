package ac.za.cput.thandiswa.repository.Impl.user;


import ac.za.cput.thandiswa.domain.user.EmployeeGender;
import ac.za.cput.thandiswa.repository.user.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {
    private static EmployeeGenderRepositoryImpl repository = null;
    private Set<EmployeeGender> employeeGenders;

    private EmployeeGenderRepositoryImpl(){
        this.employeeGenders = new HashSet<>();
    }

    private EmployeeGender findEmployeeGender(final String genderID){
        return this.employeeGenders.stream()
                .filter(employeeGender -> employeeGender.getGenderID().trim().equals(genderID))
                .findAny()
                .orElse(null);
    }

    public static EmployeeGenderRepositoryImpl getRepository() {
        if (repository == null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        this.employeeGenders.add(employeeGender);
        return employeeGender;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        EmployeeGender toDelete = findEmployeeGender(employeeGender.getEmpNum());
        if(toDelete != null){
            this.employeeGenders.remove(toDelete);
            return create(employeeGender);
        }
        return null;
    }

    @Override
    public void delete(String empNum) {
        EmployeeGender employeeGender = findEmployeeGender(empNum);
        if (employeeGender !=null) this.employeeGenders.remove(employeeGender);

    }

    @Override
    public EmployeeGender read(String genderID) {
        EmployeeGender employeeGender = findEmployeeGender(genderID);
        return employeeGender;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return this.employeeGenders;
    }
}

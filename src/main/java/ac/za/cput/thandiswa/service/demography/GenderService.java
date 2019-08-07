package ac.za.cput.thandiswa.service.demography;

import ac.za.cput.thandiswa.domain.demography.Gender;
import ac.za.cput.thandiswa.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}

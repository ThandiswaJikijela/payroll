package ac.za.cput.thandiswa.service.demography;

import ac.za.cput.thandiswa.domain.demography.Race;
import ac.za.cput.thandiswa.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, String> {
    Set<Race> getAll();
}

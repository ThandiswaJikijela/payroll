package ac.za.cput.thandiswa.util;

import java.util.UUID;

public class EmpNums {
    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}

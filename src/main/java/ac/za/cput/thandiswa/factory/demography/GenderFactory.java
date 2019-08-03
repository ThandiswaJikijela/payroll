package ac.za.cput.thandiswa.factory.demography;

import ac.za.cput.thandiswa.domain.demography.Gender;

public class GenderFactory {
    public static Gender getGender(String male, String female){
        return new Gender.Builder().male(male)
                .female(female)
                .build();
    }
}

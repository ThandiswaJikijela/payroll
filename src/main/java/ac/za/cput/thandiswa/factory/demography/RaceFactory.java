package ac.za.cput.thandiswa.factory.demography;

import ac.za.cput.thandiswa.domain.demography.Race;

public class RaceFactory {
    public static Race getRace(String african, String white, String coloured, String indian){
        return new Race.Builder().african(african)
                .coloured(coloured)
                .white(white)
                .indian(indian)
                .build();
    }
}

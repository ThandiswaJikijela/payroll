package ac.za.cput.thandiswa.domain.demography;

public class Gender {
    private String male, female;

    private Gender(){}

    private Gender (Builder builder)
    {
        this.male = builder.male;
        this.female = builder.female;
    }

    public String getMale() {
        return male;
    }

    public String getFemale() {
        return female;
    }

    public static class Builder{
        private String male, female;

        public Builder male(String male)
        {
            this.male = male;
            return this;
        }

        public Builder female(String female)
        {
            this.female = female;
            return this;
        }

        public Builder copy(Gender gender){
            this.male = gender.male;
            this.female = gender.female;

            return this;
        }

        public Gender build() {return new Gender(this);}
    }

    public String toString(){
        return "Gender{" +
                "Male ='" + male + '\'' +
                ", Female ='" + female + '\'' +
                '}';
    }
}

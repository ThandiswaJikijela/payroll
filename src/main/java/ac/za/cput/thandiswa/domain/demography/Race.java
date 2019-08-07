package ac.za.cput.thandiswa.domain.demography;

public class Race {
    private String african, white, coloured, indian;

    private Race(){}

    private Race (Builder builder){
        this.african = builder.african;
        this.white = builder.white;
        this.coloured = builder.coloured;
        this.indian = builder.indian;
    }

    public String getAfrican() {
        return african;
    }

    public String getWhite() {
        return white;
    }

    public String getColoured() {
        return coloured;
    }

    public String getIndian() {
        return indian;
    }

    public static class Builder{
        private String african, white, coloured, indian;

        public Builder african(String african)
        {
            this.african = african;
            return this;
        }

        public Builder white(String white)
        {
            this.white = white;
            return this;
        }

        public Builder coloured(String coloured)
        {
            this.coloured = coloured;
            return this;
        }

        public Builder indian(String indian)
        {
            this.indian = indian;
            return this;
        }

        public Builder copy(Race race){
            this.african = race.african;
            this.white = race.white;
            this.coloured = race.coloured;
            this.indian = race.indian;

            return this;
        }

        public Race build(){return new Race(this);}
    }

    public String toString(){
        return "Race{" +
                "African ='" + african + '\'' +
                ", White ='" + white + '\'' +
                ", Coloured ='" + coloured + '\'' +
                ", Indian ='" + indian + '\'' +
                '}';
    }
}

public class Colloquio {
    private String orario;
    private Genitore genitore;

    public Colloquio(String orario, Genitore genitore){
        this.orario = orario;
        this.genitore = genitore;
    }

    public void setGenitore(Genitore genitore){
        this.genitore = genitore;
    }

    public void setOrario(String orario){
        this.orario = orario;
    }

    public Genitore getGenitore(){
        return genitore;
    }

    public String getOrario(){
        return orario;
    }
}

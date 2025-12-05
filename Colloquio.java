public class Colloquio {
    private String orario;
    private Genitore genitore;
    private Professore professore;

    public Colloquio(String orario, Genitore genitore, Professore professore){
        this.orario = orario;
        this.genitore = genitore;
        this.professore = professore;
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

    public Professore getProfessore(){
        return professore;
    }

    public String toStringProfessore(){
        return "[orario: " + orario + ", genitore: " + genitore + "]";
    }

    public String toStringGenitore(){
        return "[orario: " + orario + ", professore: " + professore + "]";
    }
}

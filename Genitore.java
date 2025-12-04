public class Genitore {
    private String figlio;
    private String classeFiglio;
    private Colloquio colloquio;

    public Genitore(String figlio, String classeFiglio){
        this.figlio = figlio;
        this.classeFiglio = classeFiglio;
    }

    public void prenotaColloquio(String orario){
        if (){
            return true;
        }
        return false;
    }

    public String toString(){
        return getClass() + "[figlio: " + figlio + "classe figlio: " + classeFiglio + "]";
    }
}

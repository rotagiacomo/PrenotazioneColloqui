public class Genitore {
    private String figlio;
    private String classeFiglio;
    private Colloquio colloquio;

    public Genitore(String figlio, String classeFiglio){
        this.figlio = figlio;
        this.classeFiglio = classeFiglio;
    }

    public void prenotaColloquio(Professore professore, String orario){
        Colloquio prenotato = professore.setColloquio(orario, this);
        if (prenotato == null){

        }else {
            colloquio = prenotato;
        }
    }

    public String mostraPrenotazione(){
        return colloquio.toStringGenitore();
    }

    public void faiColloquio(){
        colloquio = null;
    }

    public String toString(){
        return "[figlio: " + figlio + ", classe figlio: " + classeFiglio + "]";
    }
}

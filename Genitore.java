public class Genitore {
    private String nome;
    private String cognome;
    private String figlio;
    private String classeFiglio;
    private Colloquio colloquio;

    public Genitore(String nome, String cognome, String nomeFiglio, String classeFiglio){
        this.nome = nome;
        this.cognome = cognome;
        this.figlio = nomeFiglio;
        this.classeFiglio = classeFiglio;
    }

    public void prenotaColloquio(Professore professore, String orario){
        Colloquio prenotato = professore.setColloquio(orario, this);
        if (prenotato == null){

        }else {
            colloquio = prenotato;
        }
    }

    public void annullaColloquio(){
        colloquio.getProfessore().faiColloquio(colloquio.getOrario());
    }

    public String mostraPrenotazione(){
        return colloquio.toStringGenitore();
    }

    public void setColloquio(Colloquio colloquio){
        this.colloquio = colloquio;
    }

    public String toString(){
        return "[figlio: " + figlio + ", classe figlio: " + classeFiglio + "]";
    }
}

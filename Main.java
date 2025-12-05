public class Main {
    public static void main(String[] args){
        Professore mastroianni = new Professore("Luca", "Mastroianni");
        Genitore paolo = new Genitore("Paolo", "Franceschi", "Giacomo", "4IE");
        Genitore silvia = new Genitore("Silvia", "Verri", "Manuel", "4IE");
        Genitore marco = new Genitore("Marco", "Rossi", "Luca", "4IE");
        Genitore lucia = new Genitore("Lucia", "Rizzo", "lisa", "4AM");
        Genitore samuele = new Genitore("Samuele", "Grassi", "max", "5IE");

        paolo.prenotaColloquio(mastroianni, "12:15");
        silvia.prenotaColloquio(mastroianni, "12:45");
        marco.prenotaColloquio(mastroianni, "12:45");
        lucia.prenotaColloquio(mastroianni, "12:30");
        lucia.annullaColloquio();
        samuele.prenotaColloquio(mastroianni, "12:00");
        System.out.println(mastroianni.mostraPrenotazioni());

    }
}

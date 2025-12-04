public class Main {
    public static void main(String[] args){
        Professore mastroianni = new Professore("Mastroianni");
        Genitore paolo = new Genitore("Giacomo", "4IE");
        paolo.prenotaColloquio(mastroianni, "12:15");
        Genitore silvia = new Genitore("Giacomo", "4IE");
        silvia.prenotaColloquio(mastroianni, "12:15");
        System.out.println(paolo.mostraPrenotazione());
        System.out.println(mastroianni.mostraPrenotazioni());
    }
}

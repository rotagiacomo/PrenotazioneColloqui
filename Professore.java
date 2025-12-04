public class Professore {
    private String nome;
    private Colloquio[] prenotazioni;

    public Professore(String nome){
        this.nome = nome;
        prenotazioni = new Colloquio[4];
    }

    public Colloquio setColloquio(String orario, Genitore genitore){
        int indice = trovaIndice(orario);
        if (prenotazioni[indice] == null){
            prenotazioni[indice] = new Colloquio(orario, genitore, this);
        }else {
            for (int i = 0; i<prenotazioni.length; i++){
                if (prenotazioni[i] == null){
                    indice = i;
                    break;
                }
                if (i == prenotazioni.length -1){
                    return null;
                }
            }
            prenotazioni[indice] = new Colloquio("12:" + Integer.toString(indice*15), genitore, this);
        }
        return prenotazioni[indice];
    }

    private int trovaIndice(String orario){
        int quartoDiOra;
        if (orario.length() == 4){
            quartoDiOra = Integer.parseInt((orario.substring(2,4)));
        }else {
            quartoDiOra = Integer.parseInt((orario.substring(3,5)));
        }
        int i = 0;
        while (i*15 != quartoDiOra){
            i++;
        }
        return i;
    }

    public void faiColloquio(String orario){

    }

    public String mostraPrenotazioni(){
        String stringa = "Prenotazioni[";
        for (int i = 0; i<prenotazioni.length; i++){
            if(prenotazioni[i] == null){
                stringa += "[orario: 12:" + i*15 + ", libero]";
            }else {
                stringa += prenotazioni[i].toStringProfessore();
            }
            if (i < prenotazioni.length -1){
                stringa += ", ";
            }
        }
        return stringa += "]";
    }
}

public class SistemaPrenotazioni {
    private Colloquio[] colloqui = new Colloquio[4];

    public Colloquio occupa(String orario, Genitore genitore){
        int quartoDiOra;
        if (orario.length() == 4){
            quartoDiOra = Integer.parseInt((orario.substring(2,4)));
        }else {
            quartoDiOra = Integer.parseInt((orario.substring(3,5)));
        }
        int indiceLibero = -1;
        for (int i = 0; i<colloqui.length; i++){
            if (indiceLibero == -1 && colloqui[i] == null){
                indiceLibero = i;
            }
            if ((i+1)*15 == quartoDiOra && colloqui[i] == null){
                colloqui[i] = new Colloquio(orario, genitore);
                return colloqui[i];
            }else if ((i+1)*15 > quartoDiOra && indiceLibero != -1){
                colloqui[i] = new Colloquio(Integer.toString((i+1)*15), genitore);
                return colloqui[i];
            }
        }
        return null;
    }
}

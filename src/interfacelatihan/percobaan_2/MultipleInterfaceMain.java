package interfacelatihan.percobaan_2;

import interfacelatihan.percobaan_1.Sarjana;

public class MultipleInterfaceMain {

    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        pakRektor.beriSertifikatMawapres(sarjanaCum);
        pakRektor.beriSertifikatMawapres(masterCum);
    }
}

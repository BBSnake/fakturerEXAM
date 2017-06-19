package eu.programisci.zwierzeta.dto;

import eu.programisci.zwierzeta.enums.EGatunek;

public class ZwierzeZOczamiDTO {

    private String nazwa;
    private EGatunek gatunek;
    private String kolorLewegoOka;
    private String kolorPrawegoOka;

    public ZwierzeZOczamiDTO(String nazwa, EGatunek gatunek, String kolorLewegoOka, String kolorPrawegoOka) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.kolorLewegoOka = kolorLewegoOka;
        this.kolorPrawegoOka = kolorPrawegoOka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public EGatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(EGatunek gatunek) {
        this.gatunek = gatunek;
    }

    public String getKolorLewegoOka() {
        return kolorLewegoOka;
    }

    public void setKolorLewegoOka(String kolorLewegoOka) {
        this.kolorLewegoOka = kolorLewegoOka;
    }

    public String getKolorPrawegoOka() {
        return kolorPrawegoOka;
    }

    public void setKolorPrawegoOka(String kolorPrawegoOka) {
        this.kolorPrawegoOka = kolorPrawegoOka;
    }
}

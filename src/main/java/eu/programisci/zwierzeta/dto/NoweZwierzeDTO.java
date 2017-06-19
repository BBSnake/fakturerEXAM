package eu.programisci.zwierzeta.dto;

import eu.programisci.zwierzeta.enums.EGatunek;
import eu.programisci.zwierzeta.enums.EPlec;

public class NoweZwierzeDTO {

    private String nazwa;
    private EGatunek gatunek;
    private EPlec plec;
    private Integer wiek;
    private String kolorLewegoOka;
    private String kolorPrawegoOka;

    public NoweZwierzeDTO() {}

    public NoweZwierzeDTO(String nazwa, EGatunek gatunek, EPlec plec, Integer wiek, String kolorLewegoOka, String kolorPrawegoOka) {
        this.nazwa = nazwa;
        this.gatunek = gatunek;
        this.plec = plec;
        this.wiek = wiek;
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

    public EPlec getPlec() {
        return plec;
    }

    public void setPlec(EPlec plec) {
        this.plec = plec;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
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

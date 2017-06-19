package eu.programisci.zwierzeta.dto;

import eu.programisci.zwierzeta.enums.EGatunek;
import eu.programisci.zwierzeta.enums.EPlec;

public class ZwierzeDTO {
    private String nazwa;
    private EGatunek gatunek;
    private EPlec plec;
    private Integer wiek;

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
}

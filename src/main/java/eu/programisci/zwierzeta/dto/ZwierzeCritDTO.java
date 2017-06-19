package eu.programisci.zwierzeta.dto;

import eu.programisci.zwierzeta.enums.EGatunek;

public class ZwierzeCritDTO {

    private EGatunek gatunek;
    private Integer wiek;

    public ZwierzeCritDTO() {}

    public ZwierzeCritDTO(EGatunek gatunek, Integer wiek) {
        this.gatunek = gatunek;
        this.wiek = wiek;
    }

    public EGatunek getGatunek() {
        return gatunek;
    }

    public void setGatunek(EGatunek gatunek) {
        this.gatunek = gatunek;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }
}

package eu.programisci.zwierzeta.dto;

public class ZwierzeNazwaIWiekDTO {
    private String nazwa;
    private Integer wiek;

    public ZwierzeNazwaIWiekDTO(String nazwa, Integer wiek) {
        this.nazwa = nazwa;
        this.wiek = wiek;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }
}

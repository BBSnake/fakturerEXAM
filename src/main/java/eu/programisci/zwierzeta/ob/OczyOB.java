package eu.programisci.zwierzeta.ob;

import javax.persistence.*;

@Entity
@Table(name = "oczy")
@SequenceGenerator(allocationSize = 1, name = "SEKWENCJA", sequenceName = "gen_oczy_id")
public class OczyOB {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEKWENCJA")
    private Long id;

    @Column(name = "kolor_lewego_oka")
    private String kolorLewegoOka;

    @Column(name = "kolor_prawego_oka")
    private String kolorPrawegoOka;

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

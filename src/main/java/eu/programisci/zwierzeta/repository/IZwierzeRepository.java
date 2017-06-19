package eu.programisci.zwierzeta.repository;

import eu.programisci.zwierzeta.dto.ZwierzeCritDTO;
import eu.programisci.zwierzeta.dto.ZwierzeNazwaIWiekDTO;
import eu.programisci.zwierzeta.dto.ZwierzeZOczamiDTO;
import eu.programisci.zwierzeta.enums.EGatunek;
import eu.programisci.zwierzeta.ob.ZwierzeOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IZwierzeRepository extends JpaRepository<ZwierzeOB, Long>{
    @Query("SELECT t FROM ZwierzeOB t WHERE t.wiek > :wiek")
    List<ZwierzeOB> znajdzStarszeNiz(@Param("wiek") Integer aWiek);

    @Query("SELECT t FROM ZwierzeOB t WHERE t.gatunek = :gatunek")
    List<ZwierzeOB> znajdzWgGatunku(@Param("gatunek")EGatunek aGatunek);

    @Query("SELECT new eu.programisci.zwierzeta.dto.ZwierzeNazwaIWiekDTO(t.nazwa, t.wiek) FROM ZwierzeOB t WHERE upper(t.nazwa) LIKE upper(concat(:partial, '%'))")
    List<ZwierzeNazwaIWiekDTO> znajdzZwierzetaZImieniemZaczynajacymSieOd(@Param("partial") String aPartial);

    @Query("SELECT new eu.programisci.zwierzeta.dto.ZwierzeZOczamiDTO(k.nazwa, k.gatunek, a.kolorLewegoOka, a.kolorPrawegoOka)" +
    " FROM ZwierzeOB k " +
    " LEFT JOIN k.oczy a " +
    " WHERE a.kolorLewegoOka = :kolor OR a.kolorPrawegoOka = :kolor")
    List<ZwierzeZOczamiDTO> znajdzZCoNajmniejJednymOkiemWKolorze(@Param("kolor") String aKolor);

    @Query("SELECT k" +
    " FROM ZwierzeOB k WHERE k.plec = 'SAMIEC' AND k.gatunek = :#{#zwierze.gatunek} AND k.wiek > :#{#zwierze.wiek}")
    List<ZwierzeOB> znajdzSamcowGatunkuStarszychNiz(@Param("zwierze") ZwierzeCritDTO aZwierze);
}

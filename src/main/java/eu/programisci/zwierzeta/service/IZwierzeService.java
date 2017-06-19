package eu.programisci.zwierzeta.service;

import eu.programisci.zwierzeta.dto.*;
import eu.programisci.zwierzeta.enums.EGatunek;
import eu.programisci.zwierzeta.ob.ZwierzeOB;

import java.util.List;

public interface IZwierzeService {
    NoweZwierzeDTO findOne(Long id);
    List<NoweZwierzeDTO> findAll();
    void deleteOne(Long id);
    NoweZwierzeDTO save(NoweZwierzeDTO dto);
    List<NoweZwierzeDTO> znajdzStarszeNiz(Integer wiek);
    List<NoweZwierzeDTO> znajdzWgGatunku(EGatunek gatunek);
    List<ZwierzeNazwaIWiekDTO> znajdzZwierzetaZImieniemZaczynajacymSieOd(String partial);
    List<ZwierzeZOczamiDTO> znajdzZCoNajmniejJednymOkiemWKolorze(String kolor);
    List<ZwierzeOB> znajdzSamcowGatunkuStarszychNiz(ZwierzeCritDTO zwierze);
}

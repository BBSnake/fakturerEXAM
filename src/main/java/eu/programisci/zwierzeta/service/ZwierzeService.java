package eu.programisci.zwierzeta.service;

import eu.programisci.zwierzeta.converters.ZwierzeConverter;
import eu.programisci.zwierzeta.dto.*;
import eu.programisci.zwierzeta.enums.EGatunek;
import eu.programisci.zwierzeta.ob.ZwierzeOB;
import eu.programisci.zwierzeta.repository.IZwierzeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ZwierzeService implements IZwierzeService {

    @Autowired
    private IZwierzeRepository repository;

    @Autowired
    private ZwierzeConverter converter;

    @Override
    public NoweZwierzeDTO findOne(Long id) {
        ZwierzeOB ob = repository.findOne(id);
        return converter.obToDto(ob);
    }

    @Override
    public List<NoweZwierzeDTO> findAll() {
        List<ZwierzeOB> obList = repository.findAll();
        return converter.obListToDtoList(obList);
    }

    @Override
    public void deleteOne(Long id) {
        repository.delete(id);
    }

    @Override
    public NoweZwierzeDTO save(NoweZwierzeDTO dto) {
        ZwierzeOB ob = converter.dtoToOb(dto);
        ob.setDataUtworzenia(new Date());
        ob = repository.save(ob);
        return converter.obToDto(ob);
    }

    @Override
    public List<NoweZwierzeDTO> znajdzStarszeNiz(Integer wiek) {
        List<ZwierzeOB> obList = repository.znajdzStarszeNiz(wiek);
        return converter.obListToDtoList(obList);
    }

    @Override
    public List<NoweZwierzeDTO> znajdzWgGatunku(EGatunek gatunek) {
        List<ZwierzeOB> obList = repository.znajdzWgGatunku(gatunek);
        return converter.obListToDtoList(obList);
    }

    @Override
    public List<ZwierzeNazwaIWiekDTO> znajdzZwierzetaZImieniemZaczynajacymSieOd(String partial) {
        return repository.znajdzZwierzetaZImieniemZaczynajacymSieOd(partial);
    }

    @Override
    public List<ZwierzeZOczamiDTO> znajdzZCoNajmniejJednymOkiemWKolorze(String kolor) {
        return repository.znajdzZCoNajmniejJednymOkiemWKolorze(kolor);
    }

    @Override
    public List<ZwierzeOB> znajdzSamcowGatunkuStarszychNiz(ZwierzeCritDTO zwierze) {
        return repository.znajdzSamcowGatunkuStarszychNiz(zwierze);
    }

    private ZwierzeDTO create(ZwierzeDTO dto) {
        return null;
    }

    private ZwierzeDTO update(ZwierzeDTO dto) {
        return null;
    }
}

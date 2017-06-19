package eu.programisci.zwierzeta.api;

import eu.programisci.zwierzeta.dto.*;
import eu.programisci.zwierzeta.enums.EGatunek;
import eu.programisci.zwierzeta.ob.ZwierzeOB;
import eu.programisci.zwierzeta.service.IZwierzeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/zwierzeta")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.HEAD, RequestMethod.OPTIONS, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class ZwierzeRestController {

    @Autowired
    private IZwierzeService zwierzeService;

    @RequestMapping(value = "/findOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public NoweZwierzeDTO findOne(@RequestParam("id") Long aId) {
        return zwierzeService.findOne(aId);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NoweZwierzeDTO> findAll() {
        return zwierzeService.findAll();
    }

    @RequestMapping(value = "/deleteOne", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void deleteOne(@RequestParam("id") Long aId) {
        zwierzeService.deleteOne(aId);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public NoweZwierzeDTO save(@RequestBody NoweZwierzeDTO aZwierzeDto) {
        return zwierzeService.save(aZwierzeDto);
    }

    @RequestMapping(value = "/znajdzStarszeNiz", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NoweZwierzeDTO> znajdzStarszeNiz(@RequestParam("wiek") Integer aWiek) { return zwierzeService.znajdzStarszeNiz(aWiek); }

    @RequestMapping(value = "/znajdzWgGatunku", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<NoweZwierzeDTO> znajdzWgGatunku(@RequestParam("gatunek") EGatunek aGatunek) { return zwierzeService.znajdzWgGatunku(aGatunek); }

    @RequestMapping(value = "/znajdzZwierzetaZImieniemZaczynajacymSieOd", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ZwierzeNazwaIWiekDTO> znajdzZwierzetaZImieniemZaczynajacymSieOd(@RequestParam("partial") String aPartial) { return zwierzeService.znajdzZwierzetaZImieniemZaczynajacymSieOd(aPartial); }

    @RequestMapping(value = "/znajdzZCoNajmniejJednymOkiemWKolorze", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ZwierzeZOczamiDTO> znajdzZCoNajmniejJednymOkiemWKolorze(@RequestParam("kolor") String kolor) { return zwierzeService.znajdzZCoNajmniejJednymOkiemWKolorze(kolor); }

    @RequestMapping(value = "/znajdzSamcowGatunkuStarszychNiz", method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<ZwierzeOB> znajdzSamcowGatunkuStarszychNiz(@RequestBody ZwierzeCritDTO aZwierzeDto) { return zwierzeService.znajdzSamcowGatunkuStarszychNiz(aZwierzeDto); }

}

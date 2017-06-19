package eu.programisci.zwierzeta.converters;

import eu.programisci.zwierzeta.dto.NoweZwierzeDTO;
import eu.programisci.zwierzeta.dto.ZwierzeDTO;
import eu.programisci.zwierzeta.dto.ZwierzeNazwaIWiekDTO;
import eu.programisci.zwierzeta.ob.OczyOB;
import eu.programisci.zwierzeta.ob.ZwierzeOB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZwierzeConverter {

    public NoweZwierzeDTO obToDto(ZwierzeOB in) {
        NoweZwierzeDTO out = new NoweZwierzeDTO();

        out.setNazwa(in.getNazwa());
        out.setGatunek(in.getGatunek());
        out.setPlec(in.getPlec());
        out.setWiek(in.getWiek());
        out.setKolorLewegoOka(in.getOczy().getKolorLewegoOka());
        out.setKolorPrawegoOka(in.getOczy().getKolorPrawegoOka());
        return out;
    }

    public ZwierzeOB dtoToOb(NoweZwierzeDTO in) {
        ZwierzeOB out = new ZwierzeOB();

        out.setNazwa(in.getNazwa());
        out.setGatunek(in.getGatunek());
        out.setPlec(in.getPlec());
        out.setWiek(in.getWiek());
        OczyOB oczy = new OczyOB();
        oczy.setKolorLewegoOka(in.getKolorLewegoOka());
        oczy.setKolorPrawegoOka(in.getKolorPrawegoOka());
        out.setOczy(oczy);
        return out;
    }

    public List<NoweZwierzeDTO> obListToDtoList(List<ZwierzeOB> inList) {
        if(inList == null)
            return null;

        List<NoweZwierzeDTO> outList = new ArrayList<>();
        for(ZwierzeOB in : inList) {
            outList.add(obToDto(in));
        }

        return outList;
    }
}

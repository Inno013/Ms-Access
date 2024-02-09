package ms.access.MSAccess.service;

import ms.access.MSAccess.model.ProsesLogLine;
import ms.access.MSAccess.model.ProsesLogTable;
import ms.access.MSAccess.repository.ProsesLogLineRepository;
import ms.access.MSAccess.repository.ProsesLogTableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsAccessService {
    private final ProsesLogLineRepository prosesLogLineRepository;
    private final ProsesLogTableRepository prosesLogTableRepository;

    public MsAccessService(ProsesLogLineRepository prosesLogLineRepository, ProsesLogTableRepository prosesLogTableRepository) {
        this.prosesLogLineRepository = prosesLogLineRepository;
        this.prosesLogTableRepository = prosesLogTableRepository;
    }

    public List<ProsesLogLine> getAllProsesLogLine() {
        return prosesLogLineRepository.getAllProsesLogLine() ;
    }

    public ProsesLogLine saveProsesLogLine(ProsesLogLine proseslogline) {
        return prosesLogLineRepository.saveProsesLogLine(proseslogline);
    }


    public List<ProsesLogTable> getAllProsesLogTable() {
        return prosesLogTableRepository.getAllProsesLogTable() ;
    }

    public ProsesLogTable saveProsesLogTable(ProsesLogTable proseslogtable) {
        return prosesLogTableRepository.saveProsesLogTable(proseslogtable);
    }

}
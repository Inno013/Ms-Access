package ms.access.MSAccess.service;

import ms.access.MSAccess.advice.ExecutionTimeTrackerAdvice;
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
    private final ExecutionTimeTrackerAdvice executionTimeTrackerAdvice;

    public MsAccessService(ProsesLogLineRepository prosesLogLineRepository, ProsesLogTableRepository prosesLogTableRepository, ExecutionTimeTrackerAdvice executionTimeTrackerAdvice) {
        this.prosesLogLineRepository = prosesLogLineRepository;
        this.prosesLogTableRepository = prosesLogTableRepository;
        this.executionTimeTrackerAdvice = executionTimeTrackerAdvice;
    }

    public List<ProsesLogLine> getAllProsesLogLine() {
        return prosesLogLineRepository.getAllProsesLogLine() ;
    }

    public void saveProsesLogLine(List<ProsesLogLine> proseslogline) {
        for(ProsesLogLine logLine : proseslogline){
            prosesLogLineRepository.saveProsesLogLine(logLine);
        }
    }

    public List<ProsesLogTable> getAllProsesLogTable() {
        return prosesLogTableRepository.getAllProsesLogTable() ;
    }

    public void saveProsesLogTable(List<ProsesLogTable> prosesLogTables) {
        for (ProsesLogTable logTable : prosesLogTables){
            prosesLogTableRepository.saveProsesLogTable(logTable);
        }
    }

    public String averageExecutionTime(){
        return String.valueOf(executionTimeTrackerAdvice.getAverageExecutionTime());
    }

}
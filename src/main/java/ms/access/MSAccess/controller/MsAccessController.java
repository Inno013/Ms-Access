package ms.access.MSAccess.controller;

import ms.access.MSAccess.model.ProsesLogLine;
import ms.access.MSAccess.model.ProsesLogTable;
import ms.access.MSAccess.service.FileService;
import ms.access.MSAccess.service.MsAccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class MsAccessController {

    @Autowired
    private FileService service;
    @Autowired
    private MsAccessService service1;

    @PostMapping(value = "/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") List<MultipartFile> files){
        try {
            for (MultipartFile file : files){
                service.prosesDanSaveData(file);
            }
            return ResponseEntity.ok("Sukses Upload File Ms Access, Rata - rata waktu eksekusi : " + service1.averageExecutionTime() + " ms waktu dijalankan : ");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error terjadi " + e.getMessage());
        }
    }

    @GetMapping(value =  "/finds/logline")
    public List<ProsesLogLine> findsLogline(){
        List<ProsesLogLine> logLines = service1.getAllProsesLogLine();
        return logLines;
    }

    @GetMapping(value =  "/finds/logtable")
    public List<ProsesLogTable> findsLogTable(){
        List<ProsesLogTable> logTables = service1.getAllProsesLogTable();
        return logTables;
    }
}

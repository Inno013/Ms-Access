package ms.access.MSAccess;

import ms.access.MSAccess.model.ProsesLogLine;
import ms.access.MSAccess.model.ProsesLogTable;
import ms.access.MSAccess.service.FileService;
import ms.access.MSAccess.service.MsAccessService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class MsAccessApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MsAccessApplication.class, args);

		ProsesLogLine logLine = context.getBean(ProsesLogLine.class);
//		logLine.set
		FileService fileService = context.getBean(FileService.class);

		List<ProsesLogLine> logLines = fileService.ubahKeProsesLogLines(fileService.readFile("AA30ProcessLogLine_1afc1d43-3fe0-4b34-9ad9-6448127ef136.csv"));

		MsAccessService service = context.getBean(MsAccessService.class);
		int i = 0;
		// Insert Data Ke Database
		for(ProsesLogLine log : logLines){
			service.saveProsesLogLine(log);
			if(i == 4){
				break;
			}
			i++;
		}

		List<ProsesLogTable> logTables = fileService.ubahKeProsesLogTables(fileService.readFile("AA30ProcessLogTable_0a6c903a-6ea2-47f7-9b74-641e98c2264f.csv"));
		int a = 0;
		// Insert Data Ke Database
		for(ProsesLogTable log : logTables){
			service.saveProsesLogTable(log);
			if(a == 4){
				break;
			}
			a++;
		}
		//Read Data Database
		for (ProsesLogLine list : service.getAllProsesLogLine()){
			System.out.println(list);
		}
		for (ProsesLogTable table : service.getAllProsesLogTable()){
			System.out.println(table);
		}
	}

}

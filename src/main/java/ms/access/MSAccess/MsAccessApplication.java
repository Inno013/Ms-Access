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
		SpringApplication.run(MsAccessApplication.class, args);
	}

}

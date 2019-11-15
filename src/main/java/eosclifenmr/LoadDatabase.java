package eosclifenmr;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@Slf4j
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(NmrDataRepository repository) {
		List<String> csv1 = new ArrayList<>();
		List<String> csv2 = new ArrayList<>();
		csv1.add(" ");
		csv2.add("");
		return args -> {
			log.info("Preloading " + repository.save(new NmrData("CHEMBL191334","Q00987",csv1)));
			log.info("Preloading " + repository.save(new NmrData("Frodo Baggins", "thief",csv2)));
		};
	}
}

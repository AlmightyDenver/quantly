package quantly.finance.simulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = "quantly.finance.simulator.entity")
public class QuantlySimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuantlySimulatorApplication.class, args);
	}

}

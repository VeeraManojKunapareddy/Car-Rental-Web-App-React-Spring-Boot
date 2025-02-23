package EAD2_CW.example.carRental_mcs_new;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = "EAD2_CW.example.carRental_mcs_new.data")
@EnableScheduling
public class CarRentalMcsNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalMcsNewApplication.class, args);
	}

}

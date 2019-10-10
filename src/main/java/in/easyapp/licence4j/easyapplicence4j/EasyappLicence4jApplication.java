package in.easyapp.licence4j.easyapplicence4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EasyappLicence4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyappLicence4jApplication.class, args);
	}

}

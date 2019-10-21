package in.easyapp.licence4j.easyapplicence4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "in.easyapp.licence4j.easyapplicence4j" })
@EnableJpaRepositories(basePackages = {"in.easyapp.licence4j.easyapplicence4j.repository"})
@EntityScan(basePackages = {"in.easyapp.licence4j.easyapplicence4j.model"})
public class EasyappLicence4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyappLicence4jApplication.class, args);
	}

}

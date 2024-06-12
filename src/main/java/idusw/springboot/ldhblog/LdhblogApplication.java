package idusw.springboot.ldhblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication //(exclude={DataSourceAutoConfiguration.class})
@EnableJpaAuditing
// Spring - Annotation : java, lombok, spring
//@Configuration
//@EnableAutoConfiguration
public class LdhblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(LdhblogApplication.class, args);
	}
	@Bean   //메소드를 호출하여 Bean 객체를 생성
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {    //put, delete 처리
		return new HiddenHttpMethodFilter();
	}
}

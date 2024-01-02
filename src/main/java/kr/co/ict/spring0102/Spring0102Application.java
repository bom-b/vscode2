package kr.co.ict.spring0102;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Spring0102Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring0102Application.class, args);
	}

	@Bean
	public WebMvcConfigurer crosConfigure() {

		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				System.out.println("Test==========");
				registry.addMapping("/**")
						.allowedOrigins("http://192.168.0.52:8081/", "http://localhost:8081/")
						.allowedHeaders("*")
						.allowedMethods("*").maxAge(3600);
			}

		};
	}
}

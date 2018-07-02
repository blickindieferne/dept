package fff.aaa.hhh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"fff.aaa.hhh"})
@ComponentScan("fff.aaa.hhh")
public class Deptfeign_app {
	public static void main(String[] args) {
		SpringApplication.run(Deptfeign_app.class, args);
	}
}

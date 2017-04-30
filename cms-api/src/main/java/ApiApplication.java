import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

// SpringBoot 应用标识
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.test")
public class ApiApplication extends SpringBootServletInitializer {

	/**
	 * 启动嵌入式的Tomcat并初始化Spring环境.
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ApiApplication.class, args);
		System.out.println("启动成功");
	}
}

package cn.binux;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableApolloConfig
@SpringBootApplication
public class XbinStoreWebSSOApplication  {

	public static void main(String[] args) {
		SpringApplication.run(XbinStoreWebSSOApplication.class, args);
	}
}

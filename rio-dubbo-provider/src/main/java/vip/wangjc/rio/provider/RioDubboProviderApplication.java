package vip.wangjc.rio.provider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class RioDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RioDubboProviderApplication.class, args);
	}

}

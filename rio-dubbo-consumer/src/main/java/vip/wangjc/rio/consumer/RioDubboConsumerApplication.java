package vip.wangjc.rio.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class RioDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RioDubboConsumerApplication.class, args);
	}

}

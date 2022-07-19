package vip.wangjc.rio.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vip.wangjc.rio.api.entity.RioUser;
import vip.wangjc.rio.api.service.RioDubboService;

/**
 * @ClassName RioDubboConsumerController
 * @Description dubbo服务消费者的controller
 * @Date 2021/11/24 3:10 下午
 * @Author ikejcwang
 * @Version 1.0.0
 **/
@RestController
public class RioDubboConsumerController {

    private static final Logger logger = LoggerFactory.getLogger("dubbo consumer test");

    @Reference(version = "1.0.0", group = "rio")
    private RioDubboService dubboService;

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public String test(){

        String name = dubboService.getUserName();
        logger.info("getUserName------->[{}]", name);

        RioUser user = dubboService.getUserByName("riven");
        logger.info("getUserByName-------->name[{}], age[{}], gender[{}], phone[{}]", user.getName(), user.getAge(), user.getGender(), user.getInfo().getPhone());

        RioUser u = dubboService.updateUser(user);
        logger.info("updateUser-------->name[{}], age[{}], gender[{}], phone[{}]", u.getName(), u.getAge(), u.getGender(), u.getInfo().getPhone());


        return "/";
    }
}

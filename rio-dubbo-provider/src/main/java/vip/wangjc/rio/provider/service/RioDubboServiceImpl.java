package vip.wangjc.rio.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import vip.wangjc.rio.api.entity.RioUser;
import vip.wangjc.rio.api.entity.RioUserInfo;
import vip.wangjc.rio.api.service.RioDubboService;

import java.io.Serializable;

/**
 * @ClassName RioDubboServiceImpl
 * @Description 实现RioDubboService接口，做服务提供者，Component注解一定要加，先将其注册到spring容器中
 * @Author ikejcwang
 * @Version 1.0.0
 **/
@Service(version = "1.0.0", group = "rio", token = "123456")
@Component
public class RioDubboServiceImpl implements RioDubboService, Serializable {

    private static final long serialVersionUID = -5567995682255824168L;
    private final static Logger logger = LoggerFactory.getLogger(RioDubboServiceImpl.class);

    private Integer requestCount = 0;

    @Override
    public String getUserName() {
        logger.info("getUserName-------->");

        return "masterYi";
    }

    @Override
    public RioUser getUserByName(String name) {
        logger.info("getUserByName-------->[{}]", name);

        RioUser rioUser = new RioUser();
        rioUser.setName(name);
        rioUser.setAge(30);
        rioUser.setGender(false);
        rioUser.setInfo(new RioUserInfo("13297030623"));

        return rioUser;
    }

    @Override
    public RioUser getUser(String name, Integer age) {
        logger.info("getUser-------->[{}, {}]", name, age);

        RioUser rioUser = new RioUser();
        rioUser.setName(name);
        rioUser.setAge(age);
        rioUser.setGender(false);
        rioUser.setInfo(new RioUserInfo("13297030623"));

        return rioUser;
    }

    @Override
    public RioUser updateUser(RioUser user) {
        requestCount++;
        logger.info("requestCount:[{}], updateUser--------->name[{}],age[{}],gender[{}]", requestCount, user.getName(), user.getAge(), user.getGender());

        // 修改
        user.setName("masterYi");
        user.setAge(30);
        user.setGender(false);

        // 模拟写数据库，休眠10ms
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return user;
    }
}

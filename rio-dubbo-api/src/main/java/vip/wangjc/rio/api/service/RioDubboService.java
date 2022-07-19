package vip.wangjc.rio.api.service;

import vip.wangjc.rio.api.entity.RioUser;

/**
 * @ClassName RioDubboService
 * @Description 基础的base service，测试各种类型的传参和返回值
 * @Date 2021/11/24 12:04 下午
 * @Author ikejcwang
 * @Version 1.0.0
 **/
public interface RioDubboService {

    /**
     * 无参测试
     * @return
     */
    String getUserName();

    /**
     * 基本数据类型测试
     * @param name
     * @return
     */
    RioUser getUserByName(String name);

    /**
     * 多参数测试
     * @param name
     * @param age
     * @return
     */
    RioUser getUser(String name, Integer age);

    /**
     * 引用数据类型测试
     * @param user
     * @return
     */
    RioUser updateUser(RioUser user);
}

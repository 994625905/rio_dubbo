package vip.wangjc.rio.api.entity;

import java.io.Serializable;

/**
 * @ClassName RioUser
 * @Description 分别测试泛化传参，遍布基本数据类型和引用数据类型，必须序列化
 * @Date 2021/11/24 11:50 上午
 * @Author ikejcwang
 * @Version 1.0.0
 **/
public class RioUser implements Serializable {

    private static final long serialVersionUID = -3656347720907681623L;

    /**
     * 姓名
     */
    String name;

    /**
     * 年龄
     */
    Integer age;

    /**
     * 性别：true/false
     */
    Boolean gender;

    /**
     * 基本信息
     */
    RioUserInfo info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public RioUserInfo getInfo() {
        return info;
    }

    public void setInfo(RioUserInfo info) {
        this.info = info;
    }
}

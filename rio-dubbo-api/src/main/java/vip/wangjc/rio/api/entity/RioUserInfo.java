package vip.wangjc.rio.api.entity;

import java.io.Serializable;

/**
 * @ClassName RioUserInfo
 * @Description 引用类型传参
 * @Date 2021/11/24 11:54 上午
 * @Author ikejcwang
 * @Version 1.0.0
 **/
public class RioUserInfo implements Serializable {

    private static final long serialVersionUID = 1213247756230024313L;

    String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RioUserInfo(String phone) {
        this.phone = phone;
    }
}

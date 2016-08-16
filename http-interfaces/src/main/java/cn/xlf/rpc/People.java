package cn.xlf.rpc;

import java.io.Serializable;

/**
 * Created by xiaoliufu on 6/10/16.
 */
public class People implements Serializable{
    private Integer age;
    private Integer sex;

    public People() {
    }

    public People(Integer age, Integer sex) {
        this.age = age;
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex =sex;
    }

}

package com.geekbyte.helloworld.Entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private Integer age;
    private String sex;
    Map<String,Object> maps;
    List<Object> interests;

    public Person(String name, Integer age, String sex, Map<String, Object> maps, List<Object> interests) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.maps = maps;
        this.interests = interests;
    }

    public Person() {
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getInterests() {
        return interests;
    }

    public void setInterests(List<Object> interests) {
        this.interests = interests;
    }

    /**
     * Object类在打印的时候默认调用toString方法，该方法的定义为
     * public String toString() {
     *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
     *     }
     * 输出类似于这样：com.geekbyte.helloworld.Entity.Person@fd09e43
     *
     * 为了以json格式打印，下面对toString方法进行了重写
     *
     * 打印结果：
     * Person{name='abc', age=22, sex='boy', maps={k1=ka, k2=kb}, interests=[A, B, C]}
     *
     * @return
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", maps=" + maps +
                ", interests=" + interests +
                '}';
    }
}

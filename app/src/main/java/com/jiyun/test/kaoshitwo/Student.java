package com.jiyun.test.kaoshitwo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 贾成昆 on 2017/6/22.
 */
@Entity
public class Student {
    @Id
    private Long id;
    @Property(nameInDb = "name")
    String name;
    @Generated(hash = 1097502469)
    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    @Generated(hash = 1556870573)
    public Student() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

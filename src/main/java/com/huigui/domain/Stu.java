package com.huigui.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
    private int id;
    private String name;
    private String sex;
    private int age;
    private float score;
    private String tel;
    private String classid;

    public Stu(String name, String sex, Integer age, Float score, String tel, String classid) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
        this.tel = tel;
        this.classid = classid;
    }
}
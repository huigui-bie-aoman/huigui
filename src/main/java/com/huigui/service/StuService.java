package com.huigui.service;

import com.huigui.domain.Stu;

import java.util.List;

public interface StuService {
    List<Stu> selectAll();

    void doAdd(Stu stu);

    void doUpdate(Stu stu);

    Stu selById(int id);

    void deleteByID(int id);
}

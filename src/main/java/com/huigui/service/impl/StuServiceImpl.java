package com.huigui.service.impl;

import com.huigui.domain.Stu;
import com.huigui.mapper.StuMapper;
import com.huigui.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StuServiceImpl implements StuService {
    @Resource
    private StuMapper stuMapper;


    @Override
    public List<Stu> selectAll() {
        return stuMapper.selectList(null);
    }

    @Override
    public void doAdd(Stu stu) {
        stuMapper.insert(stu);
    }

    @Override
    public void doUpdate(Stu stu) {
        stuMapper.updateById(stu);
    }

    @Override
    public Stu selById(int id) {
        return stuMapper.selectById(id);
    }

    @Override
    public void deleteByID(int id) {
        stuMapper.deleteById(id);
    }
}

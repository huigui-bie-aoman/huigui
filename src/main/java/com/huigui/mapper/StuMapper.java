package com.huigui.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huigui.domain.Stu;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StuMapper extends BaseMapper<Stu> {
//    @Select("select * from stu")
//    List<Stu> selAll();
}

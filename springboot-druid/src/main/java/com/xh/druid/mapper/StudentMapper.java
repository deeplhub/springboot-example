package com.xh.druid.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xh.druid.model.StudentEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author H.Yang
 * @since 2021-06-10
 */
@Mapper
public interface StudentMapper extends BaseMapper<StudentEntity> {

}

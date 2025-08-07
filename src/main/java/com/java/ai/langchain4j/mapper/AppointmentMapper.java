package com.java.ai.langchain4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.ai.langchain4j.entity.Appointment;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: AppointmentMapper
 * Package: com.java.ai.langchain4j.mapper
 * Description:
 *
 * @Author PML
 * @Create 2025/8/7 17:06
 * @Version 1.0
 */
@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {
}

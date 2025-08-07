package com.java.ai.langchain4j.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.ai.langchain4j.entity.Appointment;

/**
 * ClassName: AppointmentService
 * Package: com.java.ai.langchain4j.service
 * Description:
 *
 * @Author PML
 * @Create 2025/8/7 17:08
 * @Version 1.0
 */

public interface AppointmentService extends IService<Appointment> {
    Appointment getOne(Appointment appointment);
}

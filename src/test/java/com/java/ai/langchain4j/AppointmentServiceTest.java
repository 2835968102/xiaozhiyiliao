package com.java.ai.langchain4j;

import com.java.ai.langchain4j.entity.Appointment;
import com.java.ai.langchain4j.service.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: AppointmentServiceTest
 * Package: com.java.ai.langchain4j
 * Description:
 *
 * @Author PML
 * @Create 2025/8/7 17:17
 * @Version 1.0
 */
@SpringBootTest
public class AppointmentServiceTest {

    @Autowired
    AppointmentService appointmentService;

    @Test
    void testGetOne() {
        Appointment appointment = new Appointment();
        appointment.setUsername("张三");
        appointment.setIdCard("110101199001011234");
        appointment.setDepartment("心血管内科");
        appointment.setDate("2023-10-15");
        appointment.setTime("09:00");
        appointment.setDoctorName("王心怡");
        Appointment appointmentDB = appointmentService.getOne(appointment);
        System.out.println(appointmentDB);
    }

    @Test
    void testSave() {
        Appointment appointment = new Appointment();
        appointment.setUsername("张三");
        appointment.setIdCard("110101199001011234");
        appointment.setDepartment("心血管内科");
        appointment.setDate("2023-10-15");
        appointment.setTime("09:00");
        appointment.setDoctorName("王心怡");
        appointmentService.save(appointment);
    }

    @Test
    void testRemoveById() {
        appointmentService.removeById(1L);
    }

}

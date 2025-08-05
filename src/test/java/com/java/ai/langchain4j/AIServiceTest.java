package com.java.ai.langchain4j;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.java.ai.langchain4j.assistant.Assistant;

/**
 * ClassName: AIServiceTest
 * Package: com.java.ai.langchain4j
 * Description:
 *
 * @Author PML
 * @Create 2025/8/5 14:08
 * @Version 1.0
 */
@SpringBootTest
public class AIServiceTest {
    @Autowired
    private QwenChatModel qwenChatModel;
    @Test
    public void testChat() {
        //创建AIService
        Assistant assistant = AiServices.create(Assistant.class, qwenChatModel);
        //调用service的接口
        String answer = assistant.chat("Hello");
        System.out.println(answer);
    }

    @Autowired
    private Assistant assistant;
    @Test
    public void testAssistant() {
        String answer = assistant.chat("Hello");
        System.out.println(answer);
    }
}

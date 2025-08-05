package com.java.ai.langchain4j;

import com.java.ai.langchain4j.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: PromptTest
 * Package: com.java.ai.langchain4j
 * Description:
 *
 * @Author PML
 * @Create 2025/8/5 16:29
 * @Version 1.0
 */
@SpringBootTest
public class PromptTest {
    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    @Test
    public void testSystemMessage() {
        String answer = separateChatAssistant.chat(3,"今天几号");
        System.out.println(answer);
    }

    @Test
    public void testV() {
        String answer1 = separateChatAssistant.chat2(1, "我是环环");
        System.out.println(answer1);
        String answer2 = separateChatAssistant.chat2(1, "我是谁");
        System.out.println(answer2);
    }

    @Test
    public void testUserInfo() {
        String answer = separateChatAssistant.chat3(4, "我是谁， 我多大了", "翠花", 18);
        System.out.println(answer);
    }
}

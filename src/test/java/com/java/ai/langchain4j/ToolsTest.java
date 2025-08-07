package com.java.ai.langchain4j;

import com.java.ai.langchain4j.assistant.SeparateChatAssistant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: ToolsTest
 * Package: com.java.ai.langchain4j
 * Description:
 *
 * @Author PML
 * @Create 2025/8/7 16:32
 * @Version 1.0
 */
@SpringBootTest
public class ToolsTest {
    // 工具类测试

    @Autowired
    SeparateChatAssistant separateChatAssistant;

    @Test
    public void testCaculationTools(){
        String anwser = separateChatAssistant.chat(2,"1+1等于几,475695037565的平方根是多\n" +
                "少？");

        System.out.println(anwser);
    }
}

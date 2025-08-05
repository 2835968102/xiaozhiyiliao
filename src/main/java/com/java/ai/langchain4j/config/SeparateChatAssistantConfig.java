package com.java.ai.langchain4j.config;

import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: SeparateChatAssistantConfig
 * Package: com.java.ai.langchain4j.config
 * Description:
 *
 * @Author PML
 * @Create 2025/8/5 14:33
 * @Version 1.0
 */
@Configuration
public class SeparateChatAssistantConfig {
    @Bean
    ChatMemoryProvider chatMemoryProvider() {
        return memoryId -> MessageWindowChatMemory.builder()
                .id(memoryId)
                .maxMessages(10)
                .build();
    }
}


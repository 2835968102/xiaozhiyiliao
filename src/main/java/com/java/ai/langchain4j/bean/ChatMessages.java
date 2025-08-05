package com.java.ai.langchain4j.bean;

/**
 * ClassName: ChatMessages
 * Package: com.java.ai.langchain4j.bean
 * Description:
 *
 * @Author PML
 * @Create 2025/8/5 15:43
 * @Version 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("chat_messages")
public class ChatMessages {
    //唯一标识， 映射到 MongoDB 文档的 _id 字段
    @Id
    private ObjectId Id;

    private int messageId;

    //private Long messageId;
    private String content; //存储当前聊天记录列表的json字符串
}


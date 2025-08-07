package com.java.ai.langchain4j.tools;

import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.ToolMemoryId;
import org.springframework.stereotype.Component;

/**
 * ClassName: CalculatorTools
 * Package: com.java.ai.langchain4j.tools
 * Description:
 *
 * @Author PML
 * @Create 2025/8/7 16:28
 * @Version 1.0
 */
@Component
public class CalculatorTools {
    @Tool(name = "加法", value = "返回两个参数相加之和")
    double sum(
            @ToolMemoryId long memoryId,
            @P(value = "加数1", required = true) double a,
            @P(value = "加数2", required = true) double b){
        System.out.println("用户"+ memoryId + "调用加法tools");
        return a+b;
    }

    @Tool(name = "平方根", value = "返回一个数的平方根")
    double squareRoot(
            @ToolMemoryId long memoryId, double x){
        System.out.println("用户"+ memoryId + "调用平方根运算");
        return Math.sqrt(x);
    }
}

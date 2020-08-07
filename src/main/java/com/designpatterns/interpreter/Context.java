package com.designpatterns.interpreter;

import lombok.extern.slf4j.Slf4j;

import java.util.StringTokenizer;

/**
 * @author 龚秀峰
 * @version 1.0
 * @date 2020/8/7 15:39
 */
@Slf4j
public class Context {
    private String currentToken;
    private StringTokenizer stringTokenizer;
    public Context(String text){
        stringTokenizer = new StringTokenizer(text);
        nextToken();
    }

    /**
     * 获取下一个被解析的token
     */
    public void nextToken() {
        if(stringTokenizer.hasMoreTokens()){
            currentToken = stringTokenizer.nextToken();
        }else {
            currentToken = null;
        }
    }

    /**
     * 获取当前的命令或标识符或循环次数
     * @return 当前被解析的token
     */
    public String getCurrentToken(){
        return currentToken;
    }

    /**
     * 跳过一个命令，例如 END标记 会被跳过
     * @param token 某命令字符
     */
    public void skipToken(String token){
        if(!token.equals(currentToken)){
            log.error("需要跳过的命令与当前的命令不符，命令解释失败，当前失败的命令是:{}",currentToken);
        }
        nextToken();
    }

    /**
     * 获取Loop命令 循环的次数
     * 当命令是数字字符时，应该转成循环次数
     * @return 循环的次数
     */
    public int getLoopNumber(){
        return Integer.parseInt(currentToken);
    }
}

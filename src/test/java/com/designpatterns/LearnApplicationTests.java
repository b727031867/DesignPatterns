package com.designpatterns;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnApplicationTests {

    @Test
    void contextLoads() {
        new StringBuilder("");
        int num = balancedStringSplit("RLLLLRRRLR");
        System.out.println(num);
    }

    @Test
    void test(){
        String data = "aaaabbbbcccc";
        System.out.println(sortString(data));
    }

    public String sortString(String s) {
        StringBuilder res = new StringBuilder();
        //计数
        int[] bucket = this.initBucket(s);
        //奇数轮从小到大选取，偶数轮相反，直到桶为空
        int num = 1;//第N轮
        while(!isEmpty(bucket)){
            //奇数轮
            if(num%2 == 1){
                res.append(getResultPart(bucket,0,true));
            }else{//偶数轮
                res.append(getResultPart(bucket,25,false));
            }
            num++;
        }
        return res.toString();
    }

    public StringBuilder getResultPart(int[] bucket,int offset,boolean order){
        StringBuilder res = new StringBuilder();
        while(offset<26 && offset > -1){
            //顺序遍历，奇数，取值从小到大
            if(order){
                if(bucket[offset]>0){
                    res.append((char)(offset + 'a'));
                    bucket[offset]--;
                }
                offset++;
            }else{//逆序遍历，偶数，取值从大到小
                if(bucket[offset]>0){
                    res.append((char)(offset + 'a'));
                    bucket[offset]--;
                }
                offset--;
            }
        }
        return res;
    }

    public int[] initBucket(String data){
        int[] bucket = new int[26];
        for(int i=0;i<data.length();i++){
            bucket[data.charAt(i) - 'a']++;
        }
        return bucket;
    }

    public boolean isEmpty(int[] bucket){
        boolean isEmpty = true;
        for(int a : bucket){
            if(a > 0){
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    public static int balancedStringSplit(String s) {
        char[] stack = new char[500];
        int res = 0;
        int top = 0;
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(top == 0 || cur == stack[top-1]){
                stack[top] = cur;
                top++;
            }else{
                stack[top] = '0';
                top--;
            }
            if(top <= 0){
                res++;
            }
        }
        return res;
    }

}

package com.designpatterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@SpringBootTest
class LearnApplicationTests {

    @Test
    void contextLoads() {
        int num = balancedStringSplit("RLLLLRRRLR");
        Assertions.assertEquals(3,num);
    }

    @Test
    void test() {
        String data = "aaaabbbbcccc";
        Assertions.assertEquals("abccbaabccba",sortString(data));
    }

    public String sortString(String s) {
        StringBuilder res = new StringBuilder();
        //计数
        int[] bucket = this.initBucket(s);
        //奇数轮从小到大选取，偶数轮相反，直到桶为空
        int num = 1;//第N轮
        while (!isEmpty(bucket)) {
            //奇数轮
            if (num % 2 == 1) {
                res.append(getResultPart(bucket, 0, true));
            } else {//偶数轮
                res.append(getResultPart(bucket, 25, false));
            }
            num++;
        }
        return res.toString();
    }

    public StringBuilder getResultPart(int[] bucket, int offset, boolean order) {
        StringBuilder res = new StringBuilder();
        while (offset < 26 && offset > -1) {
            //顺序遍历，奇数，取值从小到大
            if (order) {
                if (bucket[offset] > 0) {
                    res.append((char) (offset + 'a'));
                    bucket[offset]--;
                }
                offset++;
            } else {//逆序遍历，偶数，取值从大到小
                if (bucket[offset] > 0) {
                    res.append((char) (offset + 'a'));
                    bucket[offset]--;
                }
                offset--;
            }
        }
        return res;
    }

    public int[] initBucket(String data) {
        int[] bucket = new int[26];
        for (int i = 0; i < data.length(); i++) {
            bucket[data.charAt(i) - 'a']++;
        }
        return bucket;
    }

    public boolean isEmpty(int[] bucket) {
        boolean isEmpty = true;
        for (int a : bucket) {
            if (a > 0) {
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
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (top == 0 || cur == stack[top - 1]) {
                stack[top] = cur;
                top++;
            } else {
                stack[top] = '0';
                top--;
            }
            if (top <= 0) {
                res++;
            }
        }
        return res;
    }

    @Test
    void testCopyFolder() {
        boolean res = folderCopy("D:\\Project\\DesignPatterns", "E:\\des");
        Assertions.assertTrue(res, "复制文件夹失败");
    }

    public static boolean fileCopy(String src, String des) {
        File srcFile = new File(src);
        File desFile = new File(des);
        byte[] p = new byte[1024];

        try {
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(desFile);
            while (fis.read(p) > -1) {//必须大于-1，不是大于0
                fos.write(p);//文件的复制
            }
            fos.close();
            fis.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public static boolean folderCopy(String src, String des) {

        File srcFile = new File(src);
        File desFile = new File(des);
        File[] files = srcFile.listFiles();
        boolean flag = false;
        if (!desFile.exists()) {
            boolean mkdirRes = desFile.mkdir();
            if (!mkdirRes) {
                return false;
            }
        }
        if (files == null) {
            return false;
        }
        for (File file : files) {
            String path = file.getAbsolutePath();
            if (file.isDirectory()) {
                File newFile = new File(path.replace(src, des));
                if (!newFile.exists()){
                    boolean mkdirRes = newFile.mkdir();
                    if (!mkdirRes) {
                        return false;
                    }
                }
                folderCopy(path, path.replace(src, des));//递归调用
            } else
                flag = fileCopy(path, path.replace(src, des));
        }
        return flag;
    }

}

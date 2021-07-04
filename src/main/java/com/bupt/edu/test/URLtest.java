package com.bupt.edu.test;

import java.io.File;

/**
 * @Author :pengkangjing
 * @Date : 2021-04-01 22:34
 * @Version : 1.0
 */

public class URLtest {
    public static void main(String[] args) throws Exception{

        File file = new File("/Users/pengkangjing/线上hdfs配置hdfs-site.xml");
        //file.toURI().toString();
        System.out.println(file.toURI().toString());
        System.out.println(file.toURI().toString());
        System.out.println(file.toPath());
        String s = "lengsh";


    }
}

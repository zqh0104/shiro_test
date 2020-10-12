package com.qihang;

import lombok.var;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: QiHangZhang
 * @Date: 2020/9/28 16:34
 * @Description:
 */
public class aaa {
    public static void main(String[] args) {
        Set<Map<String,Boolean>> optionsIDs1 = new HashSet<>();
        HashMap<String,Boolean> map1 = new HashMap<>();
        map1.put("aaa",false);
        HashMap<String,Boolean> map2 = new HashMap<>();
        map2.put("9f7373c4071f41a5a400a95dce6d3e66",true);
        HashMap<String,Boolean> map3 = new HashMap<>();
        map3.put("9f7373c4071f41a5a400a95dce6d3e66",true);
        optionsIDs1.add(map1);
        optionsIDs1.add(map2);
        optionsIDs1.add(map3);
        for (Map<String, Boolean> map : optionsIDs1) {
            System.out.println(map);
        }

        var map = new HashMap<Integer,Integer>();
        map.put(1,1);
        map.put(2,3);
        System.out.println(map);

        String s1 = "programming";
        String s2 = null;
        String s3 = "program"+"ming";
        System.out.println(s1.equals(s3));
//        System.out.println(s2.equals(s3));

        String s4 = "aa";
        String s5 = "bb";
        String s6 = s5+s4;
        String s7 = "aa"+"bb";
        String s8 = new String("aabb");
        String s9 = new String("aa")+"bb";
        System.out.println(s7.equals(s6));
        System.out.println(s7.equals(s8));
        System.out.println(s6.equals(s8));
    }
}


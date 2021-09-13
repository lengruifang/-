package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> www=new HashMap<>();
        List<String> aaa=new ArrayList<>();
        for(String key1 :object.keySet()){
            List<String> map2 =object.get(key1);
            for(String aa :map2){
                aaa.add(aa);
            }
        }
        for(String key2:collectionA.keySet()) {
            Integer map1 = collectionA.get(key2);
            for (String bb : aaa) {
                if (bb.equals(key2)) {
                    map1 = map1 - 1;
                }
                www.put(key2, map1);
            }
        }
        return  www;
    }
}
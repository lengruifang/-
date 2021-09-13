package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> www=new HashMap<>();
        for(String aa:collection1){
            Integer i=1;
            if(www.get(aa)!=null){
                i=www.get(aa)+1;
            }
           www.put(aa,i);
        }
        return www;
    }
}
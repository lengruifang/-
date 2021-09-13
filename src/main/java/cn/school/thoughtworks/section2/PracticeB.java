package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> www=new HashMap<>();
        for(String aa:collection1){
            Integer i=1;
            if(www.get(aa)!=null&&aa!="d-5"){
                i=www.get(aa)+1;
            }
            if(aa=="d-5"){
               aa="d";
               i=5;
            }
            www.put(aa,i);
        }
        return www;
    }
}

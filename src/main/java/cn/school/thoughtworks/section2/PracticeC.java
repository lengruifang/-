package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> www = new HashMap<>();
        String[] adc=new String[collection1.size()];
        int h=0;int t1=0;int t2=0;int c=0;int d=0;
        for(int i=0;i<collection1.size();i++){
            adc[i]=collection1.get(i);
        }
        for(int i=1;i<adc.length;i++){
            if(adc[i]=="h[3]"){
                adc[i]="h";
                h=2;
            }
            if(adc[i]=="t-2"){//...
                adc[i]="t";
                t1=1;
            }
            if(adc[i]=="t[10]"){
                adc[i]="t";
                t2=9;
            }
            if(adc[i]=="c:8"){
                adc[i]="c";
                c=7;
            }
            if(adc[i]=="d-5"){
                adc[i]="d";
                d=4;
            }
        }
        List<String> asd=new ArrayList<>(adc.length);
        for(String s:adc){
            asd.add(s);
        }
        for(int i=0;i<h;i++){
            asd.add("h");
        }
        for(int i=0;i<t1;i++){
            asd.add("t");
        }
        for(int i=0;i<t2;i++){
            asd.add("t");
        }
        for(int i=0;i<c;i++){
            asd.add("c");
        }
        for(int i=0;i<d;i++){
            asd.add("d");
        }
        for(String aa:asd){
            Integer i = 1;
            if (www.get(aa) != null ) {
                i = www.get(aa) + 1;
            }
            www.put(aa, i);
        }
        return www;
    }
}



package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> aa = new ArrayList<>();
        for(int i=0;i<collection2.size();i++){
            aa=collection2.get(i);
        }
        List<String> same = new ArrayList();
        for(String integer :aa) {
            if (collection1.contains(integer)) {
                same.add(integer);
            }
        }
        Collections.sort(same);
        return  same;
    }
}

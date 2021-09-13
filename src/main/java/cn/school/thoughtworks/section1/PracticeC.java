package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        List<String> bb = new ArrayList<>();
        bb=collection2.get("value");
        List<String> same = new ArrayList();
        for(String integer :bb) {
            if (collection1.contains(integer)) {
                same.add(integer);
            }
        }
        Collections.sort(same);
        return  same;
    }
}

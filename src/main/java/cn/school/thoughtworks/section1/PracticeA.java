package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> same = new ArrayList();
        for(String integer:collection2) {
            if (collection1.contains(integer)) {
                same.add(integer);
            }
        }
        Collections.sort(same);
        return  same;
    }
}

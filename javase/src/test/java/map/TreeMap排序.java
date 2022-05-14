package map;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * 使用比较器自定义排序规则
 */
public class TreeMap排序 {

    @Test
    public void test(){
        TreeMap<Student, Integer> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getScore() == o2.getScore()) {
                    return 0;
                }
                return o1.getScore() > o2.getScore() ? -1 : 1;  //o1大于o2不交换位置，因此降序
            }
        });
        treeMap.put(new Student("Tom", 77), 1);
        treeMap.put(new Student("Bob", 66), 2);
        treeMap.put(new Student("Lily", 99), 3);
        for (Student key : treeMap.keySet()) {
            System.out.println(key);    //{Lily: score=99}{Tom: score=77}{Bob: score=66}
        }
    }
}

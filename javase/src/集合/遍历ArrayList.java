package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 遍历ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hahaha");

        //方式一：普通for循环
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
        System.out.println("=============================");
        //方式二：增强for循环，底层也是采用迭代器
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("=============================");
        //方式三：迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }
    }
}

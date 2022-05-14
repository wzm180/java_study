package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class 遍历ArrayList {
    private List<String> list = new ArrayList<>();
    {
        list.add("hello");
        list.add("world");
        list.add("hahaha");
    }

    @Test
    //方式1：普通for循环
    public void test1(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    //方式2：增强for循环，底层也是采用迭代器
    public void test2(){
        for (String item : list) {
            System.out.println(item);
        }
    }

    @Test
    //方式3：迭代器遍历
    public void test3(){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            System.out.println(item);
        }
    }
}

package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//增强for循环遍历无法删除元素
public class 遍历ArrayList中删除元素 {
    private List<String> list = new ArrayList<>();
    {
        list.add("a");
        list.add("a");
        list.add("c");
    }

    @Test
    //方式1：普通for循环正序遍历并删除
    public void test1(){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("a")){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    @Test
    //方式2：普通for循环倒序遍历并删除
    public void test2(){
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals("a")){
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    @Test
    //方式3：迭代器循环遍历删除
    public void test3(){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("a")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    //方式4：jdk1.8开始使用removeIf()方法，底层使用迭代器。推荐
    public void test4(){
        list.removeIf(item -> "a".equals(item));
        System.out.println(list);
    }
}

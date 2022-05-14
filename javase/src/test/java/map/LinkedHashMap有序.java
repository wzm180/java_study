package map;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap底层是双向链表，因此有序
 * 有序分为添加顺序和访问顺序，顺序需要在构造方法中指定，accessOrder为false表示添加顺序，true表示访问顺序
 * 1添加顺序指元素添加的顺序和取出的顺序一致
 * 2访问顺序指被访问过的元素(get方法获取的元素)，在取出的时候排在最后
 */
public class LinkedHashMap有序 {

    @Test
    //添加顺序
    public void test1(){
        LinkedHashMap<Integer, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "a");
        linkedHashMap.put(3, "c");
        linkedHashMap.put(2, "b");
        linkedHashMap.put(4, "d");
        System.out.println(linkedHashMap);  //{1=a, 3=c, 2=b, 4=d}
    }

    @Test
    //访问顺序，只有如下构造可以自主选择元素排列顺序，其它构造都是添加顺序
    public void test2(){
        LinkedHashMap<Integer, Object> orderLinkedHashMap = new LinkedHashMap<Integer, Object>(16, 0.75f, true);
        orderLinkedHashMap.put(1, "a");
        orderLinkedHashMap.put(3, "c");
        orderLinkedHashMap.put(2, "b");
        orderLinkedHashMap.put(4, "d");
        orderLinkedHashMap.get(1);
        orderLinkedHashMap.get(3);
        System.out.println(orderLinkedHashMap); //{2=b, 4=d, 1=a, 3=c}
    }
}

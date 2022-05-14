package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 方式1：remove
 * 方式2：removeAll
 * 方式3：removeIf
 * 方式4：retailAll-取交集
 */
public class 删除集合中元素 {
    private List<Integer> numbers = new ArrayList<>();
    {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    @Test
    //方式3：removeIf
    public void test1(){
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                //删除所有偶数
                return integer % 2 == 0;
            }
        });
        System.out.println(numbers);    //[1, 3]
    }

    @Test
    //方式4：retailAll-取交集
    public void test2(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        numbers.retainAll(list);
        System.out.println(numbers);    //[1]
    }
}

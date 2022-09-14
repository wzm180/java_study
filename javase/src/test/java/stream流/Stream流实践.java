package stream流;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream流实践 {
    private List<Person> persons = new ArrayList<>();
    {
        persons.add(new Person("王", "男", 22));
        persons.add(new Person("王", "男", 11));
        persons.add(new Person("徐", "女", 33));
    }

    @Test
    //流的产生方式
    public void test1(){
        persons.stream();   //方式1
        Arrays.stream(new int[]{1, 2, 3});  //方式2
        Stream.of(1, 2, 3, 4);  //方式3
    }

    @Test
    //遍历
    //forEach
    // findFirst：寻找满足条件的第一个值，可与filter一起使用
    // findAny：寻找满足条件的任何一个值(一般返回第一个)，可与filter一起使用
    public void test2(){
        persons.stream().forEach(a -> System.out.println(a));
        System.out.println("======================================");
        Optional<Person> first = persons.stream().filter(a -> a.getName().equals("王")).findFirst();
        System.out.println(first.get());
        System.out.println("======================================");
        Optional<Person> any = persons.stream().filter(a -> a.getName().equals("王")).findAny();
        System.out.println(any.get());
    }

    @Test
    //求极值
    // max/min：自定义排序规则求极值
    // count：统计个数，可与filter一起使用
    public void test3(){
        //min同理
        Optional<Person> max = persons.stream().max((a, b) -> {
            if (a.getAge() > b.getAge()){
                return 1;
            }else {
                return -1;
            }
        });
        System.out.println(max.get());
        System.out.println("======================================");
        long count = persons.stream().filter(a -> a.getName().equals("王")).count();
        System.out.println(count);
    }

    @Test
    //映射
    // map：通过自定义规则将元素映射成其它元素；可改变属性值和类型
    public void test4(){
        //map改变对象的属性值
        List<Person> mapList1 = persons.stream().map(a -> {
            a.setAge(99);
            a.setSex("男男");
            return a;
        }).collect(Collectors.toList());
        System.out.println(mapList1);
        System.out.println("======================================");
        //map改变对象的类型
        List<String> nameList = persons.stream().map(a -> a.getName()).collect(Collectors.toList());
        System.out.println(nameList);
    }

    @Test
    //List<Obj>转List<key,Obj>
    public void test14(){
        Map<String, Person> map = persons.stream().collect(Collectors.toMap(Person::getName, a -> a, (v, u) -> v));
        for (String key : map.keySet()) {
            System.out.println("key：" + key + ",value：" + map.get(key));
        }
    }

    @Test
    //规约
    //reduce:将stream流归并为一个值，可以进行求和/最大值/最小值等操作
    public void test5(){
        List<Integer> integers = Arrays.asList(1, 3, 4, 32, 51, 2, 40);
        //求和
        Optional<Integer> sum1 = integers.stream().reduce((x, y) -> x + y);
        Optional<Integer> sum2 = integers.stream().reduce(Integer::sum);
        //求乘积
        Optional<Integer> mul = integers.stream().reduce((x, y) -> x * y);
        //求最大值
        Optional<Integer> max1 = integers.stream().reduce((x, y) -> x > y ? x : y);
        Optional<Integer> max2 = integers.stream().reduce(Integer::max);
        System.out.println("list和为：" + sum1.get() + "," + sum2.get());
        System.out.println("list乘积为：" + mul.get());
        System.out.println("list最大值为：" + max1.get() + "," + max2.get());
    }

    @Test
    //转List/set/map
    public void test6(){
        List<Person> collect = persons.stream().collect(Collectors.toList());
        Set<Person> collect1 = persons.stream().collect(Collectors.toSet());
        Map<Integer, Person> collect2 = persons.stream().collect(Collectors.toMap(a -> a.getAge(), b -> b));
    }

    @Test
    // 分成两个区：根据条件分为两个map，如根据员工年纪是否大于22分为两部分
    // 分成多个组：根据条件分为多个map，如根据员工年纪分组
    public void test7(){
        //分成两个区
        Map<Boolean, List<Person>> map1 = persons.stream().collect(Collectors.partitioningBy(a -> a.getAge() > 22));
        System.out.println(map1);
        System.out.println("======================================");
        //根据员工性别分多个组
        Map<String, List<Person>> map2 = persons.stream().collect(Collectors.groupingBy(a -> a.getSex()));
        System.out.println(map2);
        System.out.println("======================================");
        //根据员工性别加年纪分多个组
        Map<String, List<Person>> map3 = persons.stream().collect(Collectors.groupingBy(a -> a.getSex() + "-" + a.getAge()));
        System.out.println(map3);
    }

    @Test
    //统计
    // 计数：count
    // 平均值：averagingInt、averagingLong、averagingDouble
    // 最值：maxBy、minBy求和：summingInt、summingLong、summingDouble
    // 统计以上所有：summarizingInt、summarizingLong、summarizingDouble
    public void test8(){
        
    }

    @Test
    //join-根据指定条件对字符串进行操作
    public void test9(){

    }

    @Test
    //reducing
    //归约操作：前两个参数是要合并的值，第三个参数是要执行的操作（加减乘除等）
    public void test10(){

    }

    @Test
    //排序
    //sorted：可自定义排序规则，不提供排序规则的话，流中元素必须自己实现Comparable接口
    public void test11(){

    }

    @Test
    //合并/去重
    // concat:合并两个流
    // distinct:去重
    // limit:限制操作流中元素
    // skip:跳过操作流中元素
    public void test12(){

    }

    @Test
    //anyMatch:判断任意元素满足条件
    //allMatch:判断所有元素满足条件
    //noneMatch:判断所有元素都不满足条件
    public void test13(){

    }
}

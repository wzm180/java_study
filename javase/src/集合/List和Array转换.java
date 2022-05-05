package 集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List和Array转换 {
     public static void main(String[] args) {
          List<Integer> list = new ArrayList<>();
          list.add(1);
          list.add(2);
          list.add(3);
          //List转Array方式一
          Integer[] array = list.toArray(new Integer[list.size()]);
          //List转Array方式二
          Integer[] array1 = list.stream().toArray(Integer[]::new);

          //Array转List
          Integer[] integerArray = {1, 2, 3};
          List<Integer> list1 = Arrays.asList(integerArray);
//          list1.add(4); 返回的是一个只读list，不能修改
     }
}

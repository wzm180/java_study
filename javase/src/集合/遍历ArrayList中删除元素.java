package 集合;

import java.util.ArrayList;
import java.util.List;

//增强for循环遍历无法删除元素
public class 遍历ArrayList中删除元素 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("c");

        //方式一：普通for循环正序遍历并删除
//        for (int i = 0; i < list.size(); i++) {
//            String item = list.get(i);
//            if (item.equals("a")){
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println(list);
        //方式二：普通for循环倒序遍历并删除
//        for (int i = list.size() - 1; i >= 0; i--) {
//            String item = list.get(i);
//            if (item.equals("a")){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
        //方式三：迭代器循环遍历删除
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            if (s.equals("a")){
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
        //方式四：jdk1.8开始使用removeIf()方法，底层使用迭代器。推荐
        list.removeIf(item -> "a".equals(item));
        System.out.println(list);
    }
}

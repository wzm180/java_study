package collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class Collections类的sort方法对字母和数字排序 {

    @Test
    //Collections类的sort方法对字母进行排序，自然排序，a-z
    public void test1(){
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Taobao");
        sites.add("Wiki");
        sites.add("Runoob");
        Collections.sort(sites);
        System.out.println(sites);  //[Runoob, Taobao, Wiki]
    }

    @Test
    //Collections类的sort方法对数字进行排序，自然排序，递增
    public void test2(){
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        Collections.sort(myNumbers);
        System.out.println(myNumbers);  //[15, 20, 33]
    }
}

package 集合;

import java.util.ArrayList;
import java.util.Collections;

public class Collections类的sort方法对字母和数字排序 {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Taobao");
        sites.add("Wiki");
        sites.add("Runoob");
        Collections.sort(sites);    //对字母排序
        System.out.println(sites);

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        Collections.sort(myNumbers);    //对数字排序
        System.out.println(myNumbers);
    }
}

package 集合;

import java.util.HashMap;
import java.util.Map;

public class 遍历Map {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //方式一：通过map.keySet遍历key和value
        for (String key : map.keySet()) {
            System.out.println("key：" + key + "，value：" + map.get(key));
        }
        System.out.println("==========================");
        //方式二：通过map.entrySet遍历key和value
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key：" + entry.getKey() + "，value：" + entry.getValue());
        }
        System.out.println("==========================");
        //方式三：通过map.values遍历所有value，但是不能遍历key
        for (String value : map.values()) {
            System.out.println("value：" + value);
        }
    }
}

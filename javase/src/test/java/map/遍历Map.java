package map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class 遍历Map {
    private Map<String, String> map = new HashMap<String, String>();
    {
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");
    }

    @Test
    //方式1：通过map.keySet遍历key和value
    public void test1(){
        for (String key : map.keySet()) {
            System.out.println("key：" + key + "，value：" + map.get(key));
        }
    }

    @Test
    //方式2：通过map.entrySet遍历key和value
    public void test2(){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key：" + entry.getKey() + "，value：" + entry.getValue());
        }
    }

    @Test
    //方式3：通过map.values遍历所有value，但是不能遍历key
    public void test3(){
        for (String value : map.values()) {
            System.out.println("value：" + value);
        }
    }
}

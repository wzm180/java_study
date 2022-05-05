import java.util.Objects;

/**
 * 引用类型使用Objects.equals比较，基本类型使用==比较
 */
public class 重写equals方法 {

    class Person{
        public String name;
        public int age;

        @Override
        public boolean equals(Object o){
            if (o instanceof Person) {
                Person p = (Person) o;
                return Objects.equals(this.name, p.name) && this.age == p.age;
            }
            return false;
        }
    }
}

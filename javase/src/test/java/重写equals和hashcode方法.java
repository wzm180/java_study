import java.util.Objects;

/**
 * 引用类型使用Objects.equals比较，基本类型使用==比较
 * equals()用到的用于比较的每一个字段，都必须在hashCode()中用于计算；
 * equals()中没有使用到的字段，绝不可放在hashCode()中计算
 */
public class 重写equals和hashcode方法 {

    class Person {
        public String name;
        public int age;

        @Override
        public boolean equals(Object o) {
            if (this == o){  //同一个对象直接返回ture
                return true;
            }
            if (o instanceof Person) {
                Person p = (Person) o;
                return Objects.equals(this.name, p.name) && this.age == p.age;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(this.name, this.age);
        }
    }
}

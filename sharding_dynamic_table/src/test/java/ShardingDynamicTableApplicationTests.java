import com.example.ShardingDynamicTableApplication;
import com.example.mapper.CourseMapper;
import com.example.model.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShardingDynamicTableApplication.class)
public class ShardingDynamicTableApplicationTests {
    @Autowired
    private CourseMapper courseMapper;

    //添加课程
    @Test
    public void addCourse() {
        Course course = new Course();
        course.setCid(new Long(1));
        course.setCname("Java");
        course.setUserId(100L);
        course.setStatus("Normal");
        courseMapper.insert(course);

        course.setCid(new Long(2));
        course.setCname("Java");
        course.setUserId(100L);
        course.setStatus("Normal");
        courseMapper.insert(course);
    }
}

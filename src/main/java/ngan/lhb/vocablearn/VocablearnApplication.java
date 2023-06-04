package ngan.lhb.vocablearn;

import ngan.lhb.vocablearn.entity.Course;
import ngan.lhb.vocablearn.entity.Vocabulary;
import ngan.lhb.vocablearn.service.CourseService;
import ngan.lhb.vocablearn.service.VocabularyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class VocablearnApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VocablearnApplication.class, args);
//		CourseService service = context.getBean(CourseService.class);
//		List<Course> courses = service.getAll();
//		for (Course course : courses) {
//			System.out.println(course.toString());
//			List<Vocabulary> vocabList = course.getVocabularyList();
//			for (Vocabulary vocabulary : vocabList) {
//				System.out.println("\t  " + vocabulary.toString());
//			}
//		}

	}

}

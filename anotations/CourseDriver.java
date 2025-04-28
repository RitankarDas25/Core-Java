package anotations;

public class CourseDriver {
public static void main(String[] args) {
	Course course = new Course();
	course.display();
	
	Class<?> cls = course.getClass();
	Info info = cls.getAnnotation(Info.class);
	System.out.println(info.coursename());
	System.out.println(info.duration());
}
}

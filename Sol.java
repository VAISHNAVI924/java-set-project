package kavya;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Sol {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("kavya/NewFile.xml");
Student1 s2=(Student1) c1.getBean("ijk");
System.out.println(s2);
System.out.println(s2.getStudentid().getClass());
System.out.println(s2.getStudentname().getClass());
System.out.println(s2.getCollegeidname().getClass());
	}

}

package org.pktzj;
public class StudentTest extends junit.framework.TestCase{

	public void testCreate(){
		final String firstStudentName = "Jane Doe";
		Student student = new Student("Jane Doe");
		assertEquals(firstStudentName, student.getName());
		
		final String secondStudentName = "Jane Blow";
		Student secondStudent = new Student("Jane Blow");
		assertEquals(secondStudentName, secondStudent.getName());
		//assertEquals(firstStudentName, secondStudent.getName());
	}

}

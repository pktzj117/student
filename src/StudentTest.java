public class StudentTest extends junit.framework.TestCase{

	public void testCreate(){
		final String firstStudentName = "Jane Doe";
		Student firststudent = new Student("Jane Doe");
		assertEquals(firstStudentName, firststudent.getName());
		
		final String secondStudentName = "Jane Blow";
		Student secondStudent = new Student("Jane Blow");
		assertEquals(secondStudentName, secondStudent.getName());

	}

}

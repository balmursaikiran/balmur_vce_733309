import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation{

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try{
				if(students==null)
				{
					throw new IllegalArgumentException();
				}
				int i=0;
				for(i=0;i<students.length;i++)
				{
					this.students[i]=students[i];
				}
			}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try
		{
			if(index<0||index>students.length)
			{
				throw new IllegalArgumentException();
			}
			return students[index];
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
			if(students==null||index<0||index>students.length)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				this.students[index]=student;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int len=students.length;
		try{
			if(students==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				Student[] students1=new Student[len+1];
				students1[0]=student;
				for(int i=0;i<len;i++)
				{
					students1[i+1]=students[i];
				}
				students=null;
				setStudents(students1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int len=students.length;
		try{
			if(students==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				Student[] students1=new Student[len+1];
				for(int i=0;i<len;i++)
				{
					students1[i]=students[i];
				}
				students[len+1]=student;
				students=null;
				setStudents(students1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		
		int len=students.length;
		try{
			if(student==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				Student[] students1=new Student[len+1];
				for(int i=0;i<index;i++)
				{
					students1[i]=students[i];
				}
				students[index]=student;
				for(int i=index+1;i<len+1;i++)
				{
					students1[i]=students[i-1];
				}
				students=null;
				setStudents(students1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		int len=students.length;
		try{
			if(students==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				Student[] students1=new Student[len-1];
				for(int i=0;i<index;i++)
				{
					students1[i]=students[i];
				}
				for(int i=index;i<len+1;i++)
				{
					students1[i]=students[i+1];
				}
				students=null;
				setStudents(students1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int j=0;
		for(int i=0;i<students.length;i++){
			if(students[i]==student){
				j=i;
				break;
			}
		}
		int len=students.length;
		try{
			if(students==null)
			{
				throw new IllegalArgumentException();
			}
			else
			{
				Student[] students1=new Student[len-1];
				for(int i=0;i<j;i++)
				{
					students1[i]=students[i];
				}
				for(int i=j;i<len-1;i++)
				{
					students1[i]=students[i+1];
				}
				students=null;
				setStudents(students1);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		
			
	}

	@Override
	public void removeFromIndex(int index) {
		
		// Add your implementation here
		Student[] students1=new Student[index];
		for(int i=0;i<index;i++)
		{
			students1[i]=students[i];
		}
		students=null;
		setStudents(students1);
	}

	@Override
	public void removeFromElement(Student student) {
		
		// Add your implementation here
		int j=0;
		for(int i=0;i<students.length;i++){
			if(students[i]==student){
				j=i;
				break;
			}
		}
		Student[] students1=new Student[j];
		for(int i=0;i<j;i++)
		{
			students1[i]=students[i];
		}
		students=null;
		setStudents(students1);
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int l=students.length;int k=0;
		Student[] students1=new Student[l-index+1];
		for(int i=index;i<l;i++)
		{
			students1[k]=students[i];k++;
		}
		students=null;
		setStudents(students1);
		
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int j=0;
		for(int i=0;i<students.length;i++){
			if(students[i]==student){
				j=i;
				break;
			}
		}
		int l=students.length;int k=0;
		Student[] students1=new Student[l-j+1];
		for(int i=j;i<l;i++)
		{
			students1[k]=students[i];k++;
		}
		students=null;
		setStudents(students1);
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i =0,j=0;
		for(i=0;i<students.length;i++){
			for(j=0;j<students.length-i-1;j++){
				if((students[j].compareTo(students[j+1]))>0){
					Student s=students[j];
					students[j]=students[j+1];
					students[j+1]=s;
					
				}
			}
		}
			
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		if(date==null){
			throw new IllegalArgumentException();
			
		}
		int i=0;
		for(i=0;i<students.length;i++){
			if(students[i].getBirthDate()==date){
				al.add(students[i]);
				
			}
		}
		
		Student s[]=al.toArray(students);
		return s;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		ArrayList<Student> al=new ArrayList<Student>();
		if(firstDate==null || lastDate==null){
			throw new IllegalArgumentException();
			
		}
		int i=0;
		for(i=0;i<students.length;i++){
			if(students[i].getBirthDate().compareTo(firstDate)>0 && students[i].getBirthDate().compareTo(lastDate)<0 ){
				al.add(students[i]);
				
			}
		}
		
		Student s[]=al.toArray(students);
		return s;

	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		//Date d=new Date();
		//return Period.between(birthDate, currentDate).getYears(); (students[indexOfStudent].getBirthDate(),d);
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		int i=0;
		double sum=0;
		for(i=0;i<students.length;i++){
			sum=sum+students[i].getAvgMark();
		}
		sum=sum/students.length;
		ArrayList<Student> al=new ArrayList<Student>();
		for(i=0;i<students.length;i++){
			if(students[i].getAvgMark()==sum){
				al.add(students[i]);
			}
		}
		
		Student s[]=al.toArray(students);
		return s;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null){
			throw new IllegalArgumentException();
		}
		int j=0;
		for(int i=0;i<students.length;i++){
			if(students[i]==student){
				j=i;
				break;
			}
		}
		
		return students[j+1];
	}
}

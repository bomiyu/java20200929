package chap13.lecture;


import chap13.textbook.s130601.*;
public class GenericEx4Wildcard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<>("일반인",5);
		Course<Student> courserStudent = new Course<>("학생",5);
	}
}

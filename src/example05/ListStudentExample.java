package example05;

import java.util.ArrayList;

public class ListStudentExample {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		Student s1 = new Student(); //student �⺻������, example05.Student@3b6eb2ec
		s1.setHakbun("01"); //�̷��� �������༭ �ʵ忡 ���� �ִ´�
		s1.setName("박박박");
		s1.setYear(2000);
		
		list.add(s1); //s1�̶� �� ��ü�̰� 
		System.out.println(list);
		
		Student s2 = new Student("02", "박박박", 2001); //example05.Student@1e643faf
		list.add(s2);
		System.out.println(list);
		
		System.out.println(list.get(0).getHakbun());
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getYear());
		
		System.out.println(list.get(1).getHakbun());
		System.out.println(list.get(1).getName());
		System.out.println(list.get(1).getYear());

		for(int i=0; i<list.size(); i++) {
			String Hakbun = list.get(i).getHakbun();
			String Name = list.get(i).getName();
			int Year = list.get(i).getYear();
			
			System.out.println(Hakbun + Name + Year);
			
		}
	}

}

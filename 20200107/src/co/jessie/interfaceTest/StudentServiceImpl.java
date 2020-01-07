package co.jessie.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.jessie.scope.Student;

public class StudentServiceImpl implements Service {
	private Student student;
	private ArrayList<Student> list;  //LIST컬렉션 정의

	@Override
	public void insert() {
		Student student = new Student();
		list = new ArrayList<Student>(); // 리스트 초기화

		boolean b = true; // do-while의조건
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("학생을 추가하시겠습니까? (Y/N)");
			String yesNo = sc.nextLine();
			if (yesNo.equals("n")|| yesNo.equals("N")) {
				b = false;
				break;
			}
			student = new Student();
			System.out.println("학생 아이디를 입력하세요.");
			student.setId(sc.nextLine());
			System.out.println("학생 이름을 입력하세요.");
			student.setName(sc.nextLine());
			System.out.println("전공을 입력하세요.");
			student.setMajor(sc.nextLine());
			System.out.println("전화번호를 입력하세요.");
			student.setTel(sc.nextLine());
      
			list.add(student);

		} while (b);
		sc.close();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		for(Student student : list) {
		System.out.print(student.getId() + " "); // get으로 값불러오기
		System.out.print(student.getName() + " ");
		System.out.print(student.getMajor() + " ");
		System.out.println(student.getTel() + " ");
		}
	}

}

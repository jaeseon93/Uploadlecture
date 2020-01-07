package co.jessie.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.jessie.scope.Member;

public class MemberServiceImpl implements Service {
	private Member member; // 다른 패키지에 member클래스가 있으므로 사용하기 위해서 정의하고 import 시키기
	private ArrayList<Member> list; // <> : 리스트구조를 사용하기위한 타입

	@Override
	public void insert() {
		Member member;
		list = new ArrayList<Member>(); // 리스트 초기화
		member = new Member();
		boolean b = true; // do-while문 조건
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("멤버를 추가하겠습니까?(Y/N)");
			String yesNo = sc.nextLine();
			if (yesNo.equals("N")) {
				b = false;
				break;
			}
			member = new Member();
			System.out.println("아이디를 입력하세요");
			member.setId(sc.nextLine());
			System.out.println("패스워드를 입력하세요");
			member.setPw(sc.nextLine());
			System.out.println("이름을 입력하세요");
			member.setName(sc.nextLine());
			System.out.println("주소를 입력하세요");
			member.setAddr(sc.nextLine());
			System.out.println("전화번호를 입력하세요");
			member.setTel(sc.nextLine());
			System.out.println("등급을 입력하세요");
			member.setGrade(sc.nextInt());
			sc.nextLine();

			list.add(member); //list하나씩 쌓아주는거
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
		for (Member member : list) {    //for each구문 , 멤버타입의 변수로 list를 읽을거란 뜻.
			System.out.print(member.getId() + " ");
			System.out.print(member.getPw() + " ");
			System.out.print(member.getName() + " ");
			System.out.print(member.getAddr() + " ");
			System.out.print(member.getTel() + " ");
			System.out.println(member.getGrade() + " ");
		}
	}

}

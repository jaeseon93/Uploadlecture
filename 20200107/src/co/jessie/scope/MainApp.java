package co.jessie.scope;

import co.jessie.interfaceTest.MemberServiceImpl;
import co.jessie.interfaceTest.Service;
import co.jessie.interfaceTest.StudentServiceImpl;

public class MainApp {      
	public static void main(String[] args) {
//       Member member = new Member();  //default생성자 
//       member.setId("Hong");  //setter가 member클래스에서 정의한setter에  값을 대입하는 것.
//       member.setPw("1234");
//       member.setName("홍길동");
//       member.setAddr("대구광역시");
//       member.setTel("010-1111-1111");
//       member.setGrade(1);
//       
//       member.toString(); //member가 가지고 있는 toString을 해달라.
       
//       member = new Member("Park","2345","박펭수","서울광역시","010-2222-2222",2);   //값이있는 생성자로 만들기.
//		 member.insert("Park","2345","박펭수","서울광역시","010-2222-2222",2);
//		 member.toString();
//       System.out.println(member.getId()+" "+member.getPw());    //member클래스의 id와 pw만 나오도록 하고 싶으면 getter사용해서 적는다.
//       System.out.println(member.getAddr());
//       
       //       member.toString();
       
//		Service service = new MemberServiceImpl();
//		service.insert();
//		service.display();

		Service service2 = new StudentServiceImpl();
		service2.insert();
		service2.display();
	}

}

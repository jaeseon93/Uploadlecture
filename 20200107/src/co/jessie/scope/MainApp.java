package co.jessie.scope;

public class MainApp {      
	public static void main(String[] args) {
       Member member = new Member();  //default생성자 
       member.setId("Hong");  //setter가 member클래스에서 정의한setter에  값을 대입하는 것.
       member.setPw("1234");
       member.setName("홍길동");
       member.setAddr("대구광역시");
       member.setTel("010-1111-1111");
       member.setGrade(1);
       
       member.toString(); //member가 가지고 있는 toString을 해달라.
       
       member = new Member("Park","2345","박펭수","서울광역시","010-2222-2222",2);   //값이있는 생성자로 만들기.
       member.toString();
       
	}

}

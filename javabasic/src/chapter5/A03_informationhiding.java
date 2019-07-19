package chapter5;

public class A03_informationhiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student st1 = new Student(); // 객체생성완료
		st1.name = "김사탄";
		st1.showInfo();
		st1.id =1;
		st1.address = "청주시 청원구";
		System.out.println(st1.getname()); //이름 가져오는 함수인데 도대체이걸 왜하는지 모르곘다 잘
		st1.showInfo();
		System.out.println(st1.id);
		System.out.println(st1.address);
		
		InHiding info = new InHiding();
		info.setid(1);
		System.out.println(info.getId());  //162~167p)
	}

}

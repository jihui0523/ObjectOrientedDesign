
public class Practice37 {

	public static void main(String[] args) {
		Plane d =new Plane();
		Plane j =new Plane();
		Plane s =new Plane();
		
		d.id=0;
		d.model="모름";
		d.capacity=0;
		
		j.id=1030615;
		j.model="보잉 737";
		j.capacity=75;
		
		s.id=2464737;
		s.model="보잉 747";
		s.capacity=150;
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println("식별번호: "+d.id+"편");
		System.out.println("모델: "+d.model);
		System.out.println("승객수: "+d.capacity+"명");
		System.out.println();
		
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println("식별번호: "+j.id+"편");
		System.out.println("모델: "+j.model);
		System.out.println("승객수: "+j.capacity+"명");
		System.out.println();

		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println("식별번호: "+s.id+"편");
		System.out.println("모델: "+s.model);
		System.out.println("승객수: "+s.capacity+"명");
	}

}


public class TestCar {

	public static void main(String[] args) {
	
		Car c = new Car("Bus",1000,"블랙");
	    c.sample_print();	
		Car c2 = new Car();
		c2.sample_print();	
		//c2.name = "벤츠";
		//딜러 실수로 가격을 잘못 입력했음.
		//c2.price = -2000;
		//c2.color = "흰색";
		
		//System.out.printf("차명:%s, 가격:%d, 색상:%s",
			//	           c2.name, c2.price, c2.color);
    
	}

}

package esc;

public class Sample04 {
	public static void main(String[] args) {
		Product p1=new Product();
		p1.name="찹썰도너츠";
		//p1.price=-20000;
		p1.setPrice(-20000);
		p1.qty=20;
		int result=p1.getPrice();
		System.out.println(result);
	}//main 종료
}//class 종료


class Product {
	String name;	//상품명
	private int price;		//가격
	int qty;		//재고량

	//get : 데이터를 가져오다
	//set : 데이터를 입력하다
	
	int getPrice() {
		return price;
	}//getPrice 종료
	void setPrice(int a) {
		if(a<0) {
			System.out.println("가격입력이 잘못되었습니다.");
			price=10000;
		} else {
			price=a;
		}
	}//setPrice 종료
	
}//product 클래스 종료
3
package Choo;

public class CastExceptionTest {
	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		
		try{
			casting(r);
		}catch(ClassCastException e) {
			System.out.println("ĳ���� �� �� ���� ��ü�� �־����ϴ�.");
		}
		
	}
	
	static void casting(Shape s) throws ClassCastException {
		Circle c = (Circle)s;
	}
}

class Shape{}
class Rectangle extends Shape{}
class Circle extends Shape{}
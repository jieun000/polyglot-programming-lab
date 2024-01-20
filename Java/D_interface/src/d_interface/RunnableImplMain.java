package d_interface;

import java.util.ArrayList;
import java.util.List;

public class RunnableImplMain {

	public static void main(String[] args) {
		
		// 인터페이스라 객체 생성 불가능
		// Runnable run = new Runnable();
		
		// 데이터타입이 다른데 왜 될까? 답은 【다형성】때문.
		// 부모가 자식 객체를 가질 수 있다.
		Runnable run = new RunnableImpl();
		
		System.out.println(run.multiply()); // 문자열 + 11리턴
		
		List<Runnable> list = new ArrayList<>();
		for(int i=0; i<20; i++) {
			list.add(new RunnableImpl()); // 20번 생성되어 리스트에 추가됨
		}
		
		int sum = 0;
		for(Runnable i : list) sum += i.multiply(); 
		// 20번 문자열과  return된 11값들이 더해짐
		System.out.println(sum);
		
	}

}

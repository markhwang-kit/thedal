import java.util.ArrayList;
import java.util.Scanner;

/*
 * 메인 클래스
 */
public class MainClass {

	public static void main(String[] args) {
		System.out.println("메인 클래스");
		// 클래스 선언
		MyClass mc = new MyClass();
		System.out.println(mc);
		mc.bab();
		mc.food();
		mc.nono();
		
		
		
		MyClass2 mc2 = new MyClass2();
		mc2.m1();
		mc2.m2();
		mc2.m3();
		MyClass mc1 = null;
		mc2.m2();

		mc.bab();
		mc.food();
		mc.nono();
		mc2.m3();
		
		MyClass3 mc3 = new MyClass3();
		int i = mc3.r1();
		System.out.println("r1에서 받은 int 데이터: " + i);
		String s = mc3.r2();
		System.out.println(s + " 보권~");
		
		// 클래스 만들고 매소드를 만들기
		// 더달의 기능을 별도 만들어서
		// 더하기 출력 해주고
		// 더하기의 답을 전달 해주는 매소드
		// 메인에서 매소드만 이용해서 출력 또는 답을 비교
		//  
		TheDal td = new TheDal();
		
//		int[] aa = td.rnd2Num();
//		System.out.println(aa[0]);
//		System.out.println(aa[1]);
//		int hab = td.thehagi();
//		int user = td.userDab();
//		
//		while(!td.ox(hab, user)) {
//			user = td.userDab();
//			System.out.println("틀렸다");
//		}
//		System.out.println("맞습니다");
		
		
//		for (;;) {
//			int input = td.userDab();
//			if (hab == input) {
//				System.out.println("맞다");
//				break;
//			} else {
//				System.out.println("틀렸다");
//			}
//		}
		
//		번호 만드는 메소드 실행 (번호 두개 담고 있는 리스트 = rnd2NumList())
		ArrayList<Integer> list = td.rnd2NumList();
		System.out.println("랜덤의 수의 리스트 갯수: " + list.size());
		System.out.println("첫번째 수: " + list.get(0));
		System.out.println("두번째 수: " + list.get(1));
//		더하기 매소드에서 나온 변수 = 더하기 매소드(번호1, 번호2)
//		int dab = td.thehagi(list.get(0), list.get(1));
		td.thehagi(10, 20);
//		더하기 매소드에서 나온 수를 출력 ( 두수를 더한 결과값만 출력)
//		System.out.println(dab);
		
	}

}

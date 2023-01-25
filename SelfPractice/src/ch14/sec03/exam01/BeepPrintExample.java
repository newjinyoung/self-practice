package src.ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		for(int i=0; i<5; i++ ) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {} 
		}
	}
}
//메인스레드는 비프음을 모두 발생한 다음에야 프린팅을 시작함(비프음 → 프린팅) : 메인스레드 하나니까
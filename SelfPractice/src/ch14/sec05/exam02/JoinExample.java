package src.ch14.sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100합: " + sumThread.getSum());
	}
}

//SumThread가 계산 작업을 모두 마칠 때가지 메인 스레드가 일시정지 상태에 있다가
//SumThread가 최종 계산된 결과값을 산출하고 종료하면 메인스레드가 결과값을 받아 출력함

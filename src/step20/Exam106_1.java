/* 주제: 스레드 프로그래밍 - 사용후
 */
package step20;

public class Exam106_1 {
  // 독립적으로 실행하려면 Thread를 상속 받아야 한다.
  static class MyObject extends Thread {
    // 독립적으로 실행할 코드는 run() 메서드를 오버라이딩 하여 넣는다.
    @Override
    public void run() {
      for (int i = 0; i < 5000; i++) {
        System.out.printf("MyObject(%d)...\n", i);
      }
    }
  }
  public static void main(String[] args) throws Exception {
    MyObject obj = new MyObject();

    // 스레드에 작성한 run() 메서드는 직접 실행하면 안된다.
    // start()를 호출하여 간접적으로 실행해야 한다.
    obj.start();

    for (int i = 0; i < 5000; i++) {
      System.out.printf("main(%d)...\n", i);
    }
  } //main()
}

/*
 * 스레드 생명주기(lifecycle)
 * 
 *  new Thread() ---(start())---> Runnable 상태 ----(sleep(), wait())----> Not Runnable 상태
 *               <------ x ------   ^  |        <---(timeout, notify())---
 *                           \      |  |
 *                            x     x  | run() 호출이 종료
 *                             \    |  |
 *                              \-- Dead 상태
 * 
 * "소프트웨어(Software; S/W)"
 * - 일반적으로 컴퓨터 프로그램이라 부른다.
 * - 컴퓨터에게 작업을 시키는 명령어들의 집합
 * - 명령어들은 CPU가 이해하는 기계어 코드로 만들어지지만,
 *   그 기계어들의 구조와 구성은 OS에 최적화되기 때문에 운영체제에 종속된다.
 *   또 명령어를 작성할 때 OS에서 제공하는 API를 사용하기 때문에 운영체제에 종속될 수 밖에 없다.
 * - 즉 윈도용 소프트웨어는 리눅스에서 실행할 수 없다.
 * 
 * "소프트웨어의 종류"
 * 1) 시스템 소프트웨어(System Software)
 * - OS, VGA 카드 드라이버, 프린터 드라이버 등 H/W(Hardware)를 제어하는 소프트웨어.
 * 2) 응용 소프트웨어(Application Software)
 * - 메모장, 그림판, 포토샵, 이클립스, MS 오피스 등
 * - 보통 응용 프로그램이라 부른다. 더 줄여서 애플리케이션(응용)이라 부른다.
 * 
 * "프로세스"
 * => 실행 중인 프로그램.
 * 
 * "멀티 태스킹"
 * => CPU를 공유하면서 여러 개의 작업을 동시에 실행하는 것.
 * => 실제는 CPU를 돌려 사용하면서 작업을 실행한다.
 *    CPU의 작업 처리가 워낙 빠르기 때문에, 겉으로는 동시에 실행하는 것처럼 보인다. 
 * 
 * "서버에 멀티 태스킹 적용"
 * 1) 멀티 프로세스 방식
 * => 예전에는 여러 클라이언트 요청을 동시에 처리하기 위해
 *    프로세스를 복제(fork())방식을 사용하였다.
 * => 즉 클라이언트 요청을 받는 프로세스를 복제한 다음에 
 *    그 프로세스가 한 개의 클라이언트 요청을 처리하는 방식이다.
 * => 이 방식의 단점은, 복제 원본 프로세스의 모든 메모리를
 *    그대로 복제한다는 것이다. 
 *    동일한 메모리를 복제하기 때문에 코드가 중복되고,
 *    이에 따라서 메모리가 낭비되는 문제가 있다.
 * => 각각의 복제된 프로세스는 독립적이기 때문에 다른 프로세스의 영향을 받지 않는다.  
 *    
 *    
 * 2) 멀티 스레드 방식
 * => 원본 프로세스의 힙(heap) 메모리(자바는 Method Area 영역 포함)는 공유하고, 
 *    스택 메모리만 스레드 별로 관리하는 것이다.
 * => 따라서 멀티 프로세스 방식 보다 메모리가 절약된다.
 * => 스레드의 특성상 프로세스에 종속되기 때문에
 *    프로세스를 종료하면 그 프로세스에 종속된 모든 스레드도 같이 제거된다.
 *    
 * 
 * "Runnable 상태"
 * => OS로부터 CPU 사용을 허락받을 수 있는 상태
 * => Runnable 상태에 있는 여러 스레드 또는 프로세스들 중 하나가
 *    OS로부터 CPU 사용을 허락 받으면 자신의 코드를 실행한다.
 * => 자바 스레드의 경우, OS로부터 CPU 사용을 허락받으면 
 *    다시 CPU 사용을 뺏길 때까지 run() 메서드 안에 기록된 코드를 실행한다.
 * => "new Thread 상태"로 돌아갈 수 없다.
 *    
 * "Not Runnable 상태"
 * => sleep()을 호출하거나, wait()를 호출하면
 *    지정된 조건이 될 때까지 CPU를 받지 않는다.
 *    즉 OS는 이 상태의 스레드에게 CPU를 주지 않는다.
 * => 다시 "Runnable 상태"로 돌아가는 방법?
 *    sleep() ---> 타임아웃 되었을 때,
 *    wait()  ---> notify() 또는 notifyAll()을 호출했을 때,
 *    
 * "Dead 상태"
 * => run() 메서드 호출이 끝났을 때.
 * => 일단 스레드의 실행이 종료되면, 다시 시작시킬 수 없다.
 * 
 * "스레드" 캐주얼 설명
 * => 독립적으로 실행하는 코드 블록
 * 
 */

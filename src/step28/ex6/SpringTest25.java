/* 주제: 커스텀 프로퍼티 에디터를 사용하여 String 값을 java.util.Date객체로 바꾸기
 * => 직접 개발자가 문자열을 Date 객체로 변환해야 한다.
 */

package step28.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest25 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex6/application-context25.xml");
    
    System.out.println("------------------------");
    System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("obj3"));
    
  }
}
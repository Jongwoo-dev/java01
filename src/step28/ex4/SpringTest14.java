/* 주제: 의존 객체 주입하기
 */

package step28.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest14 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex4/application-context14.xml");
    
    System.out.println("------------------------");
    System.out.println(iocContainer.getBean("c1"));
    System.out.println(iocContainer.getBean("c2"));
    System.out.println(iocContainer.getBean("c3"));
    System.out.println(iocContainer.getBean("c4"));
    
    Car c1 = (Car)iocContainer.getBean("c1");
    Car c4 = (Car)iocContainer.getBean("c4");
    if (c1.getEngine() == c4.getEngine())
      System.out.println("c1.engine == c4.engine");
  }
}
/* 주제: @Autowired 애노테이션의 활용
 * => 의존 객체를 자동으로 주입하라는 표시
 */

package step28.ex9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest28 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex9/application-context28.xml");
    
    System.out.println("------------------------");
    System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("obj3"));
    
  }
}
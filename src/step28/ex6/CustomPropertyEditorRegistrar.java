/* 역할: 스프링 IoC 프레임워크에 개발자가 따로 정의한 프로퍼티 값 변화기를
 *       설치해주는 인스톨러 만들기
 * => 프로퍼티 값 변환기를 프로퍼티 에디터라 부른다.
 * => 프로퍼티 에디터 인스톨러를 "프로퍼티 에디터 레지스트라"라고 부른다.
 * => 프로퍼티 에디터 인스톨러를 만들기 위해서는 
 *    스프링에서 정의한 규칙에 따라 클래스를 만들어야 한다.
 *    규칙?
 *    PropertyEditorRegistrar
 * 
 */
package step28.ex6;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {
  SimpleDateFormat dateFormat;
  
  public CustomPropertyEditorRegistrar() {
    System.out.println("CustomPropertyEditorRegistrar()");
    dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  }
  @Override
  public void registerCustomEditors(PropertyEditorRegistry registry) {
    System.out.println("registerCustomEditors.registerCustomEditors()");
    
    // 이 메서드를 호출하는 자? 스피링 IoC 컨테이너이다.
    // 특히 스프링 IoC 컨테이너의 담당자 중에서 개발자가 만든 이 인스톨러를
    // 전문적으로 관리해주는 CustomEditorConfigurer 객체가 호출한다.
    
    // 저 파라미터(PropertyEditorRegistry)는 뭐하는 객체냐?
    // CustomEditorConfigurer가 변환기를 등록할 때 사용하라고 준 도구이다.
    // 따라서 이 도구를 사용해서 값 변환기를 등록해야 한다.
    
    // 1) 문자열을 java.util.Date 객체로 바꿔주는 변환기 등록
    // => 스프링에서 Date 객체로 바꿔주는 변환기를 기본으로 제공하고 있다.
    // 우리는 단지 그 객체를 생성하여 등록하면 된다.
    registry.registerCustomEditor(
        Date.class, // 문자열을 어떤 타입의 객체로 변환할 것인지 지정 
        new CustomDateEditor(dateFormat, false) // 날짜 변환기
        );
    
    // => 문자열을 step28.ex6.Engine 객체로 바꿔주는 변환기 등록
    registry.registerCustomEditor(
        Engine.class, 
        new EngineEditor()
        );
  }
}

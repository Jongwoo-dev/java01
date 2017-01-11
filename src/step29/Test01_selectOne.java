/* 주제 : Mybatis로 한 개 데이터 select 하기
 * 
 */
package step29;

import java.io.InputStream;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectOne {
  public static void main(String[] args) throws Exception {
    //1. SqlSessionFactory 객체 생성
    // => 클래스 경로에서 mybatis-config.xml을 찾으려면 Resource 객체의 도움을 받아야 한다.
    InputStream in = Resources.getResourceAsStream("step29/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

    //2. SQL을 실행할 SqlSession 객체를 생성한다.
    SqlSession sqlSession = sqlSessionFactory.openSession();

    //3. SELECT 문 실행
    // => selectList(SQL 맵퍼에 선언된 SQL문의 아이디)
    // => 리턴 값은 resultType 객체의 목록
    Map record = sqlSession.selectOne("selectOneContacts", "aaa@test.com");

    if (record != null) {
      System.out.printf("%s, %s, %s, %s\n", 
          record.get("name"),
          record.get("posi"), 
          record.get("tel"), 
          record.get("email"));
    }
    //4. SqlSession을 사용 후 닫는다.
    sqlSession.close();
    
  }
}

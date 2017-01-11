/* 주제 : Mybatis를 사용하여 delete 실행
 * 
 */
package step29.ex2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_delete {
  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex2/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    SqlSession sqlSession = sqlSessionFactory.openSession();

    int count = sqlSession.delete("deleteContacts", "lee2@test.com");
    sqlSession.commit(); // 기본이 수동 커밋이다. 따라서 데이터베이스에 적용하라고 명령해야 한다.
    if (count > 0) {
      System.out.println("삭제 성공!");
    } else {
      System.out.println("삭제 실패!");
    }
    //4. SqlSession을 사용 후 닫는다.
    sqlSession.close();

  }
}

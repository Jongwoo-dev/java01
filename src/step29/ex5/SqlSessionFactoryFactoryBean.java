package step29.ex5;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

public class SqlSessionFactoryFactoryBean implements FactoryBean<SqlSessionFactory> {
  String configLocation;

  public void setConfigLocation(String configLocation) {
    this.configLocation = configLocation;
  }

  @Override
  public boolean isSingleton() {
    return true;
  }
  
  @Override
  public Class<?> getObjectType() {
    return SqlSessionFactory.class;
  }
  
  @Override
  public SqlSessionFactory getObject() throws Exception {
    InputStream in = Resources.getResourceAsStream(configLocation);
    return new SqlSessionFactoryBuilder().build(in);
  }
  
}








package edu.ouc;


import edu.ouc.dao.AccountDao;
import edu.ouc.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Marson
 * @date 2024/6/17
 */
public class App {
    public static void main(String[] args) throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        Account ac = accountDao.findById(1);
        System.out.println(ac);

        sqlSession.close();
    }
}

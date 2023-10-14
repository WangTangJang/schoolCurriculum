package mybatis.mapper;

import mybatis.pojo.EasyBuyUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class EasyBuyUserMapperTest {

    EasyBuyUserMapper easyBuyUserMapper;
    SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("Mybatis-config.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);

        sqlSession = sqlSessionFactory.openSession();

        easyBuyUserMapper = sqlSession.getMapper(EasyBuyUserMapper.class);

    }

    @Test
    public void demo() throws Exception {
        List<Integer> ids = new ArrayList<>();
        ids.add(10);
        ids.add(11);
        ids.add(12);
        EasyBuyUser easyBuyUser = new EasyBuyUser();
        easyBuyUser.setIds(ids);
        List<String> usernames = new ArrayList<>();
        usernames.add("程广宁");
        usernames.add("沈白");
        usernames.add("尚泽忠");
        easyBuyUser.setUserNames(usernames);
        List<Object> result = sqlSession.selectList("foreachDemo",easyBuyUser);
        System.out.println("-------------------------------------查询结果----------------------------------------");
        for(Object o:result){
            System.out.println(o);
        }
    }

    @Test
    public void findAll() {
    }

    @Test
    public void findUserByLimit() {
        int page = 2;
        int rows = 3;

        int start = (page-1)*rows;
        List<EasyBuyUser> easyBuyUsers = new ArrayList<>();
        easyBuyUsers = easyBuyUserMapper.findUserByLimit(start,rows);
        for (EasyBuyUser e:easyBuyUsers){
            System.out.println(e);
        }
    }

    @Test
    public void findUserByWhere() {
        List<EasyBuyUser> easyBuyUsers = new ArrayList<>();
        EasyBuyUser easyBuyUser = new EasyBuyUser();
        easyBuyUser.setId(15);
        easyBuyUsers = easyBuyUserMapper.findUserByWhere(easyBuyUser);
        System.out.println(easyBuyUsers);
        sqlSession.close();
    }

    @Test
    public void findUserByLike() {
        List<EasyBuyUser> easyBuyUsers = new ArrayList<>();
        EasyBuyUser easyBuyUser = new EasyBuyUser();
        easyBuyUser.setUserName("白");
        easyBuyUsers = easyBuyUserMapper.findUserByLike(easyBuyUser);
        System.out.println(easyBuyUsers);
        sqlSession.close();
    }

    @Test
    public void modifyByTrim() {
        EasyBuyUser easyBuyUser = new EasyBuyUser();
        easyBuyUser.setId(14);
        easyBuyUser.setUserName("沈浪");
        easyBuyUser.setLoginName("sl");
        easyBuyUserMapper.modifyByTrim(easyBuyUser);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findUserById() {
    }

    @Test
    public void save() {
    }

    @Test
    public void modify() {
    }

    @Test
    public void delete() {
    }
}
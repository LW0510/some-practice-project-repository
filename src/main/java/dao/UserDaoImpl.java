package dao;

import entity.User;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository( "userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public void addUser(User user) {
        SqlSession session = super.getSqlSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        System.out.println("userDao:"+userDao);
        userDao.addUser(user);
        System.out.println("user保存成功！");

    }


    @Override
    public User getUser(int id) {
        SqlSession session = super.getSqlSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        return userDao.getUser(id);
    }

    @Override
    public void deleteUser(int id) {
        SqlSession session = super.getSqlSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        SqlSession session = super.getSqlSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        userDao.updateUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        SqlSession session = super.getSqlSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        return userDao.getAllUsers();

    }

    @Override
    public List<User> getUserByUsername(String username) {
        SqlSession session = super.getSqlSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        return userDao.getUserByUsername(username);
    }

    @Override
    public User getUserAndClass(int userid){
        SqlSession session = super.getSqlSession();
        UserMapper userDao = session.getMapper(UserMapper.class);
        return userDao.getUserAndClass(userid);

    }




}

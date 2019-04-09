package mapper;

import entity.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;


/**
 * @author lw
 * @classname UserDaoImpl
 * @description TODO
 * @date 2019/04/06 下午 4:55
 */
public interface UserMapper{
    void addUser(User user);
    User getUser(int id);

}

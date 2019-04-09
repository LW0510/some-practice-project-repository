package mapper;

import entity.User;


/**
 * @author lw
 * @classname UserDaoImpl
 * @description TODO
 * @date 2019/04/06 下午 4:55
 */
public interface UserMapper {
    void addUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    void updateUser(User user);
}

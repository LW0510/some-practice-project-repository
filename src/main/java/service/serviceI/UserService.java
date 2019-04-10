package service.serviceI;

import entity.Class_;
import entity.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);


    User queryUser(int i);

    void deleteUser(int id);

    void updateUser(User user);

    List<User> getAllUsers();

    List<User> getUserByUsername(String username);

    User getUserAndClass(int userid);

    //一对多
    List<Class_> getUserByCid(int cid);
}

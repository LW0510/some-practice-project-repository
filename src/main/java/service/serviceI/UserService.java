package service.serviceI;

import entity.User;
public interface UserService {

    public void addUser(User user);


    User queryUser(int i);

    void deleteUser(int id);

    void updateUser(User user);
}

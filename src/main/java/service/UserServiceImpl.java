package service;

import entity.Class_;
import entity.User;
import mapper.Class_Mapper;
import mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.serviceI.UserService;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * @classname UserServiceImpl
 * @author lw
 * @description TODO
 * @date 2019/04/04 下午 4:51
 */
@Service("userService")
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Qualifier(value = "userDao")
    @Resource(name = "userDao")
    private UserMapper userDao;

    @Resource(name = "classDao")
    private Class_Mapper classDao;

    @Transactional(readOnly = false,propagation = Propagation.REQUIRED,
    rollbackFor = {SQLException.class,ArithmeticException.class})
    @Override
    public void addUser(User user){
        System.out.println("进入addUser()");
        //if(该学生存在)
        userDao.addUser(user);

    }

    @Override
    public User queryUser(int i) {
        return userDao.getUser(i);
    }

    @Override
    public void deleteUser(int id){ userDao.deleteUser(id);}

    @Override
    public void updateUser(User user){
        userDao.updateUser(user);
    }

    @Override
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    @Override
    public List<User> getUserByUsername(String username){
        return userDao.getUserByUsername(username);
    }


    @Override
    public User getUserAndClass(int id){
        return userDao.getUserAndClass(id);
    }

    //一对多
    @Override
    public List<Class_> getUserByCid(int cid){
        return classDao.getUserByCid(cid);
    }



}

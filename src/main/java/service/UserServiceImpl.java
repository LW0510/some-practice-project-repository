package service;

import entity.User;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.serviceI.UserService;

import javax.annotation.Resource;
import java.sql.SQLException;

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

    @Transactional(readOnly = false,propagation = Propagation.REQUIRED,
    rollbackFor = {SQLException.class,ArithmeticException.class})
    @Override
    public void addUser(User user){
        System.out.println("进入addUser()");
        //if(该学生存在)
        userDao.addUser(user);



    }


}

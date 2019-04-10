package contrller;

import entity.Class_;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.serviceI.UserService;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author lw
 * @classname UserController
 * @description TODO
 * @date 2019/04/04 下午 4:39
 */
@Controller
public class UserController {

    @Resource(name = "userService")
    private UserService userService;


    //返回jsp视图展示
    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public ModelAndView getUser() {

        ModelAndView modelAndView = new ModelAndView();
        //调用service方法得到用户列表
        User user = new User();
        user.setId(1);
        user.setUsername("zs");
        user.setPasswd("123");
        userService.addUser(user);

        //将得到的用户列表内容添加到ModelAndView中
//        modelAndView.addObject("user", user);
        modelAndView.setViewName("getUser");
        //设置响应的jsp视图
        System.out.println("===============================成功查询用户列表！");
        return modelAndView;

    }

    @RequestMapping(value="/queryUser")
    public void testController(){
        User user = userService.queryUser(1);
        System.out.println(user);

    }

    @RequestMapping(value = "/updateUser")
    public void updateController(){
        User user = new User();
        user.setId(1);
        user.setUsername("liuwei");
        user.setPasswd("321");
        userService.updateUser(user);
    }

    @RequestMapping(value = "/deleteUser")
    public void deleteController(){
         userService.deleteUser(1);
    }

    @RequestMapping(value = "/getAllUsers")
    public void getAllUsers(){
        List<User> list = userService.getAllUsers();
        System.out.println("User集合为：");
        for(User user : list){
            System.out.println(user);

        }

    }


    @RequestMapping(value = "/getUserByUsername")
    public void getUserByUsername(){
        List<User> list = userService.getUserByUsername("%z%");
        System.out.println("模糊查询User集合为：");
        for(User user : list){
            System.out.println(user);
        }
    }


    @RequestMapping(value = "/getUserAndClass")
    public void getUserAndClass(){
        User user = userService.getUserAndClass(1);
        System.out.println(user);
    }

    @RequestMapping(value = "/getUserByCid")
    public void getUserByCid(){
        List<Class_> classs = userService.getUserByCid(1);
        for(Class_ cl : classs){
            System.out.println(cl);

        }

    }
}

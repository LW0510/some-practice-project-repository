package contrller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
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
    @RequestMapping(value = "/getUserModel", method = RequestMethod.GET)
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

    @RequestMapping(value="test")
    public void testController(User user){
        System.out.println(user.toString());
    }
}
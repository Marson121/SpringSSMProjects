package edu.ouc.controller;

import edu.ouc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marson
 * @date 2024/7/1
 */
@Controller
public class UserController {
    /**
     * 跳转页面（了解）
     * 1. 不能使用@ResponseBody注解，否则会将page.jsp当做字符串返回
     * 2. 方法返回String
     *
     * @return
     */
    @RequestMapping("/toJumpPage")
    public String toJumpPage() {
        System.out.println("页面跳转");
        return "page.jsp";
    }

    /**
     * 返回纯文本（了解）
     * 必须加ResponseBody，否则会将response text当做页面去查找
     * @return
     */
    @RequestMapping("/toText")
    @ResponseBody
    public String toText() {
        System.out.println("返回纯文本数据");
        return "response text";
    }

    //-------------------------------------------------------------------

    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("zhangsan");
        user.setAge(23);
        return user;
    }

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json集合数据");
        User user1 = new User();
        user1.setName("zhangsan");
        user1.setAge(22);

        User user2 = new User();
        user2.setName("lisi");
        user2.setAge(43);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }

}

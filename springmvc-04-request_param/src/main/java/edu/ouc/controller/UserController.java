package edu.ouc.controller;

import edu.ouc.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author Marson
 * @date 2024/6/25
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     * get发送单个参数
     *
     * @param name
     * @return
     */
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name) {
        System.out.println("普通参数传递 name ==>" + name);
        return "{'info':'springmvc common param'}";
    }

    /**
     * get发送多个参数
     *
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/commonParam2")
    @ResponseBody
    public String commonParam2(String name, int age) {
        System.out.println("普通参数传递 name ==>" + name);
        System.out.println("普通参数传递 age ==>" + age);
        return "{'info':'springmvc common param'}";
    }

    /**
     * GET中文乱码，高版本的tomcat已经解决
     *
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/commonParamChinese")
    @ResponseBody
    public String commonParamChinese(String name, int age) {
        System.out.println("普通参数传递 name ==>" + name);
        System.out.println("普通参数传递 age ==>" + age);
        return "{'info':'springmvc common param'}";
    }

    /**
     * Post请求
     *
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/commonParamPost")
    @ResponseBody
    public String commonParamPost(String name, int age) {
        System.out.println("普通参数传递 name ==>" + name);
        System.out.println("普通参数传递 age ==>" + age);
        return "{'info':'springmvc common param'}";
    }

    /**
     * post请求中文乱码，tomcat也已经解决
     *
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/commonParamPostChinese")
    @ResponseBody
    public String commonParamPostChinese(String name, int age) {
        System.out.println("普通参数传递 name ==>" + name);
        System.out.println("普通参数传递 age ==>" + age);
        return "{'info':'springmvc common param'}";
    }


    // -----------------------------------------------------------------------

    /**
     * 请求参数和接收参数名称不对应
     *
     * @param username
     * @param age
     * @return
     */
    @RequestMapping("/common")
    @ResponseBody
    public String common(@RequestParam("name") String username, int age) {
        System.out.println("普通参数传递 name ==>" + username);
        System.out.println("普通参数传递 age ==>" + age);
        return "{'info':'springmvc common param'}";
    }

    /**
     * pojo简单类型
     *
     * @param user
     * @return
     */
    @RequestMapping("/pojoSimple")
    @ResponseBody
    public String pojoSimple(User user) {
        System.out.println("user ==>" + user);
        return "{'info':'springmvc common param'}";
    }

    /**
     * pojo嵌套类型
     *
     * @param user
     * @return
     */
    @RequestMapping("/pojoComplex")
    @ResponseBody
    public String pojoComplex(User user) {
        System.out.println("user ==>" + user);
        return "{'info':'springmvc common param'}";
    }


    /**
     * 数组参数
     *
     * @param likes
     * @return
     */
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println("likes ==>" + Arrays.toString(likes));
        return "{'info':'springmvc common param'}";
    }

    /**
     * 集合参数
     *
     * @param likes
     * @return
     */
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes) {
        System.out.println("likes ==>" + likes);
        return "{'info':'springmvc common param'}";
    }

    // ---------------------------------------------------------

    /**
     * json普通数据
     * @param likes
     * @return
     */
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody List<String> likes) {
        System.out.println("likes ==>" + likes);
        return "{'info':'springmvc common param'}";
    }

    /**
     * json对象数据
     * @param user
     * @return
     */
    @RequestMapping("/pojoParamForJson")
    @ResponseBody
    public String pojoParamForJson(@RequestBody User user) {
        System.out.println("user ==>" + user);
        return "{'info':'springmvc common param'}";
    }

    /**
     * json对象数组
     * @param list
     * @return
     */
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list) {
        System.out.println("list ==>" + list);
        return "{'info':'springmvc common param'}";
    }

    // ---------------------------------------------------------

    /**
     * 日期参数
     * @param date
     * @return
     */
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date) {
        System.out.println("date ==>" + date);
        return "{'info':'springmvc common param'}";
    }

    /**
     * 其他日期格式
     * @param date
     * @return
     */
    @RequestMapping("/dateParam2")
    @ResponseBody
    public String dateParam2(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2) {
        System.out.println("date ==>" + date);
        System.out.println("date2 ==>" + date2);
        return "{'info':'springmvc common param'}";
    }

    /**
     * 时间格式
     * @param date
     * @param date2
     * @return
     */
    @RequestMapping("/dateParam3")
    @ResponseBody
    public String dateParam3(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date2, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date3) {
        System.out.println("date ==>" + date);
        System.out.println("date2 ==>" + date2);
        System.out.println("date3 ==>" + date3);
        return "{'info':'springmvc common param'}";
    }
}

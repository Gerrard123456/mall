package web.mall.controller;
//这个类主要作用是显示后台登陆页面以及后台登陆的请求的处理
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.mall.entity.Users;
import web.mall.service.IUsersService;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
@RequestMapping("/admin")
@Controller //控制器
public class AdminLoginController {
    //定义后台用户业务对象，可以帮助完成登陆业务的处理
    @Resource
    private IUsersService iUsersService;

    //后台登陆页面的显示
    @RequestMapping("login_show")
    public String login_show(){
        System.out.println("hello");
        return "/admin/login";
    }

    //登陆请求的提交
    @RequestMapping("/login_submit")

    public String login_submit(Users users, HttpSession session,Model model){
        //根据用户名和密码进行登陆查验
        Users users1=iUsersService.adminLogin(users);

        //如果账号不存在
        if(users1==null){
            model.addAttribute("err","用户名或者密码不正确");
            return "/admin/login";
        }

        //将登陆的账号对象自动存入session，用于会话跟踪管理
        session.setAttribute("adminUser",users1);
        return "/admin/index";//登陆成功就直接进入后台的主页面
    }
}

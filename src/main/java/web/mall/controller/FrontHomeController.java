package web.mall.controller;
//需要在controll中完成前台登陆页面
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FrontHomeController {
    //表明这个函数需要相应的URL
    @RequestMapping("/")

    //代表下面的这个测试只是作为一个字符串传入浏览器的内容，而非一个方法/类
    @ResponseBody
    //测试
    //直接拼写一个地址链接去访问后台
    public String index(){
        return "欢迎访问我的项目<br/><a href='/admin/login_show'>访问后台</a>";
    }
}
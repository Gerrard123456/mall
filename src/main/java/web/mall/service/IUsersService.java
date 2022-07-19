package web.mall.service;

import web.mall.entity.Users;

public interface IUsersService {
    //后台登陆
    Users adminLogin(Users users);
}

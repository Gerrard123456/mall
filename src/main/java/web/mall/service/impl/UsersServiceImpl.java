package web.mall.service.impl;

import org.springframework.stereotype.Service;
import web.mall.entity.Users;
import web.mall.mapper.UsersMapper;
import web.mall.service.IUsersService;

import javax.annotation.Resource;

//也外层的对象
@Service
public class UsersServiceImpl implements IUsersService {
    //定义mapper访问对象
    @Resource
    private UsersMapper usersMapper;

    @Override
    public Users adminLogin(Users users) {
        return usersMapper.find(users);
    }
}

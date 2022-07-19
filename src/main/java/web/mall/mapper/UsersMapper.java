package web.mall.mapper;

import org.apache.ibatis.annotations.Mapper;
import web.mall.entity.Users;

@Mapper
public interface UsersMapper {
    Users find(Users users);
}

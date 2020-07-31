package cn.jiyun.ssm.service;

import cn.jiyun.ssm.mapper.UserMapper;
import cn.jiyun.ssm.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper UserMapper;

    public User findbyId(long deptno){
        return this.UserMapper.selectByPrimaryKey(deptno);
    }

}

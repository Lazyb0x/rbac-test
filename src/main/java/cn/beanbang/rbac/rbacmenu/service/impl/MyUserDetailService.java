package cn.beanbang.rbac.rbacmenu.service.impl;

import cn.beanbang.rbac.rbacmenu.entity.User;
import cn.beanbang.rbac.rbacmenu.entity.domain.UserDo;
import cn.beanbang.rbac.rbacmenu.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.selectOne(new QueryWrapper<User>().lambda().eq(User::getName, username));
        if (user==null) {
            throw new UsernameNotFoundException("数据库中无此用户！");
        }
        UserDo userDo = new UserDo();
        BeanUtils.copyProperties(userDo, user);

        return userDo;
    }
}

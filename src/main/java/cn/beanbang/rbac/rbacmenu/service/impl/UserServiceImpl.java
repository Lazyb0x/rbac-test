package cn.beanbang.rbac.rbacmenu.service.impl;

import cn.beanbang.rbac.rbacmenu.domain.User;
import cn.beanbang.rbac.rbacmenu.mapper.UserMapper;
import cn.beanbang.rbac.rbacmenu.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mysql.cj.Session;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Lazyb0x
 * @since 2020-07-27
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    UserMapper userMapper;

    @Autowired
    HttpSession session;

    @Override
    public boolean login(User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();

        wrapper.lambda().eq(User::getName, user.getName())
                .eq(User::getPassword, user.getPassword());

        User dbuser = userMapper.selectOne(wrapper);
        if (dbuser!=null){
            log.info("登录：{}", dbuser.toString());
            session.setAttribute("user", user.getName());
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String info() {
        return (String)session.getAttribute("user");
    }

    @Override
    public boolean logout() {
        boolean res = false;
        String username = (String)session.getAttribute("user");
        if (username!=null){
            res = true;
            session.removeAttribute("user");
        }
        return res;
    }


}

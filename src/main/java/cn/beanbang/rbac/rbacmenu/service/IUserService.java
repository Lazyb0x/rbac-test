package cn.beanbang.rbac.rbacmenu.service;

import cn.beanbang.rbac.rbacmenu.domain.User;
import cn.beanbang.rbac.rbacmenu.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.annotation.Resource;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Lazyb0x
 * @since 2020-07-27
 */
public interface IUserService extends IService<User> {

    /**
     * 使用用户名和密码登录
     * @param user
     * @return 是否登录成功
     */
    boolean login(User user);

    /**
     * 从session获取登录用户信息
     * @return 登录的用户名
     */
    String info();

    /**
     * 登出
     * @return true: 从登录状态退出
     */
    boolean logout();
}

package cn.beanbang.rbac.rbacmenu.service;

import cn.beanbang.rbac.rbacmenu.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

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

    /**
     * 列出某个角色的所有用户
     * @param roleId 角色id
     * @return 用户列表
     */
    List<User> listByRoleId(int roleId);
}

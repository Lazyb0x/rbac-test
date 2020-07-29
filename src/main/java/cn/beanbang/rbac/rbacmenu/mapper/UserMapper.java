package cn.beanbang.rbac.rbacmenu.mapper;

import cn.beanbang.rbac.rbacmenu.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Lazyb0x
 * @since 2020-07-27
 */
public interface UserMapper extends BaseMapper<User> {

    List<User> selectByRoleId(int roleId);
}

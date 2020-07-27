package cn.beanbang.rbac.rbacmenu.controller;


import cn.beanbang.rbac.rbacmenu.domain.User;
import cn.beanbang.rbac.rbacmenu.domain.vo.Result;
import cn.beanbang.rbac.rbacmenu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Lazyb0x
 * @since 2020-07-27
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user){
        boolean res = userService.login(user);
        return Result.isSuccess(res);
    }

    @GetMapping("/info")
    public Result info(){
        return Result.success(userService.info());
    }

    @PostMapping("/logout")
    public Result logout(){
        boolean res = userService.logout();
        return Result.isSuccess(res);
    }
}


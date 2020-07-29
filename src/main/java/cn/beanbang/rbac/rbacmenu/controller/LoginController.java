package cn.beanbang.rbac.rbacmenu.controller;


import cn.beanbang.rbac.rbacmenu.domain.User;
import cn.beanbang.rbac.rbacmenu.util.RestResult;
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
public class LoginController {

    @Autowired
    IUserService userService;

    @PostMapping("/login")
    public RestResult login(@RequestBody User user){
        boolean res = userService.login(user);
        return RestResult.isSuccess(res);
    }

    @GetMapping("/info")
    public RestResult info(){
        return RestResult.success(userService.info());
    }

    @PostMapping("/logout")
    public RestResult logout(){
        boolean res = userService.logout();
        return RestResult.isSuccess(res);
    }
}


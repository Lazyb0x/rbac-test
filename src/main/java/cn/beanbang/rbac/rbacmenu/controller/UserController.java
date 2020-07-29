package cn.beanbang.rbac.rbacmenu.controller;

import cn.beanbang.rbac.rbacmenu.entity.User;
import cn.beanbang.rbac.rbacmenu.util.RestResult;
import cn.beanbang.rbac.rbacmenu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    IUserService userService;

    @GetMapping("/user/list")
    public RestResult listByRole(int roleId){
        List<User> users = userService.listByRoleId(roleId);
        return RestResult.success(users);
    }

    @PostMapping("/user/add")
    public RestResult addUser(@RequestBody User user){
        boolean res = userService.save(user);
        return RestResult.isSuccess(res);
    }

    @PostMapping("/user/update")
    public RestResult updateUser(@RequestBody User user){
        boolean res = userService.saveOrUpdate(user);
        return RestResult.isSuccess(res);
    }

    @DeleteMapping("/user/delete")
    public RestResult deleteUser(int userId){
        boolean res = userService.removeById(userId);
        return RestResult.isSuccess(res);
    }
}

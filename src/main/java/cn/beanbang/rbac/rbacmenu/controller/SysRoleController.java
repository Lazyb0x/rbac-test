package cn.beanbang.rbac.rbacmenu.controller;


import cn.beanbang.rbac.rbacmenu.domain.SysRole;
import cn.beanbang.rbac.rbacmenu.domain.vo.Result;
import cn.beanbang.rbac.rbacmenu.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Lazyb0x
 * @since 2020-07-27
 */
@Controller
@RequestMapping("/api/role")
public class SysRoleController {

    @Autowired
    ISysRoleService roleService;

    @PostMapping("/add")
    public Result add(SysRole role){
        boolean res = roleService.save(role);
        return Result.isSuccess(res);
    }

    @GetMapping("/list")
    public Result list(){
        List<SysRole> roles = roleService.list();
        return Result.success(roles);
    }

    @PostMapping("/update")
    public Result update(SysRole role){
        boolean res = roleService.save(role);
        return Result.isSuccess(res);
    }

    @DeleteMapping("/remove")
    public Result remove(int id){
        boolean res = roleService.removeById(id);
        return Result.isSuccess(res);
    }
}


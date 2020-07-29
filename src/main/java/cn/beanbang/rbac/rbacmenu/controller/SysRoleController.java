package cn.beanbang.rbac.rbacmenu.controller;


import cn.beanbang.rbac.rbacmenu.domain.SysRole;
import cn.beanbang.rbac.rbacmenu.util.RestResult;
import cn.beanbang.rbac.rbacmenu.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public RestResult add(@RequestBody SysRole role){
        boolean res = roleService.save(role);
        return RestResult.isSuccess(res);
    }

    @GetMapping("/list")
    public RestResult list(){
        List<SysRole> roles = roleService.list();
        return RestResult.success(roles);
    }

    @PostMapping("/update")
    public RestResult update(@RequestBody SysRole role){
        boolean res = roleService.saveOrUpdate(role);
        return RestResult.isSuccess(res);
    }

    @DeleteMapping("/remove")
    public RestResult remove(int id){
        boolean res = roleService.removeById(id);
        return RestResult.isSuccess(res);
    }
}


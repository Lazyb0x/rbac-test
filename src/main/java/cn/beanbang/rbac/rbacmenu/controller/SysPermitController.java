package cn.beanbang.rbac.rbacmenu.controller;


import cn.beanbang.rbac.rbacmenu.entity.SysPermit;
import cn.beanbang.rbac.rbacmenu.service.ISysPermitService;
import cn.beanbang.rbac.rbacmenu.util.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Lazyb0x
 * @since 2020-07-27
 */
@Controller
@RequestMapping("/api/permit")
public class SysPermitController {

    @Autowired
    ISysPermitService permitService;

    @PostMapping("/add")
    public RestResult add(SysPermit permit){
        boolean res = permitService.save(permit);
        return RestResult.isSuccess(res);
    }

    @PostMapping("/update")
    public RestResult update(SysPermit permit){
        boolean res = permitService.saveOrUpdate(permit);
        return RestResult.isSuccess(res);
    }

    @DeleteMapping("/delete")
    public RestResult delete(int permitId){
        boolean res = permitService.removeById(permitId);
        return RestResult.isSuccess(res);
    }
}


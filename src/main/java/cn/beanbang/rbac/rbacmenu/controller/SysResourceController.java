package cn.beanbang.rbac.rbacmenu.controller;


import cn.beanbang.rbac.rbacmenu.entity.SysResource;
import cn.beanbang.rbac.rbacmenu.service.ISysResourceService;
import cn.beanbang.rbac.rbacmenu.util.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/api/resource")
public class SysResourceController {

    @Autowired
    ISysResourceService resourceService;

    @PostMapping("/add")
    public RestResult add(@RequestBody SysResource resource){
        boolean res = resourceService.save(resource);
        return RestResult.isSuccess(res);
    }

    @PutMapping("/update")
    public RestResult update(@RequestBody SysResource resource){
        boolean res = resourceService.saveOrUpdate(resource);
        return RestResult.isSuccess(res);
    }

    @DeleteMapping("/delete")
    public RestResult delete(int resourceId){
        boolean res = resourceService.removeById(resourceId);
        return RestResult.isSuccess(res);
    }
}


package cn.beanbang.rbac.rbacmenu.service;

import cn.beanbang.rbac.rbacmenu.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IUserServiceTest {

    @Autowired
    IUserService userService;

    @Test
    public void testSelect(){
        List<User> users = userService.list();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    void login(){
        User user = new User();
        user.setName("xiaoming");
        user.setPassword("1234526");
        System.out.println(userService.login(user));
    }
}
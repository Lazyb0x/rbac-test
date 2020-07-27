package cn.beanbang.rbac.rbacmenu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.beanbang.rbac.rbacmenu.mapper")
public class RbacMenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbacMenuApplication.class, args);
    }

}

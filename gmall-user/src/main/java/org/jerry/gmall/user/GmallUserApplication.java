package org.jerry.gmall.user;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 用户模块启动类
 *
 * @author jerry
 * @create 2019-10-30 19:57
 */
@SpringBootApplication
@MapperScan("org.jerry.gmall.user.mapper")
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}

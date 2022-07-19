package web.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springBoot启动类
@SpringBootApplication
@MapperScan(basePackages = "web.mall.mapper")
public class Project {
    public static void main(String[] args) {
        SpringApplication.run(Project.class,args);
    }
}

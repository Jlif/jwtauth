package tech.jiangchen.jwtauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class JwtauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtauthApplication.class, args);
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

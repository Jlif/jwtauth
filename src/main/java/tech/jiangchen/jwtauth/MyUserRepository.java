package tech.jiangchen.jwtauth;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jiangchen
 * @description TODO
 * @date 2017年08月22日
 */
public interface MyUserRepository extends JpaRepository<MyUser, Long> {
    MyUser findByUsername(String username);
}

package com.zt.repo;

import com.zt.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang tong
 * date: 2018/8/6 13:10
 * description:
 */
public interface UserRepository extends CrudRepository<User, Long> {
}

package com.zt.taks;

import com.zt.entity.User;
import com.zt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang tong
 * date: 2018/8/6 14:53
 * description:
 */
@Component
public class UserTask {
    @Autowired
    private UserService userService;

    @Scheduled(cron = "0 0/1 * * * ?")
    public void execute() {
        User user = new User();
        user.setUsername("xiaoming");
        user.setDateTime(LocalDateTime.now());
        userService.save(user);
        System.out.println("保存成功了");
    }
}

package com.zt.entity;

import com.zt.base.IdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang tong
 * date: 2018/8/6 11:48
 * description:
 */
@Entity
@Table(name = "t_user")
public class User extends IdEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "time")
    private LocalDateTime dateTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}

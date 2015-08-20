package org.springboot.webapp.model.user.empty;

import java.io.Serializable;

/**
 * Created with IDEA.
 * User: zhoudianyou
 */
public class UserInfo implements Serializable{

    private static final long serialVersionUID = 1218764245738994059L;

    private Long userId;
    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}

package cn.bm.testGithub.domain.dto;

import cn.bm.testGithub.domain.constant.UserType;

/**
 * Created by baimeng on 19/1/8.
 * 用户信息DTO
 */
public class UserDTO {
    private Long userId;
    private UserType userType;

    public UserDTO(){
    }

    public UserDTO(Long userId,  UserType userType) {
        this.userId = userId;
        this.userType = userType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "userId=" + userId + ",  accountType=" + userType + '}';
    }
}

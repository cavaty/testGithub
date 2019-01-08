package cn.bm.testGithub.domain.constant;

/**
 * Created by baimeng on 19/1/8.
 * 用户类型
 */
public enum  UserType {
    ADMIN(0, "管理员"),
    EXAMINER(1, "考官"),
    EXAMINEE(2,"考生"),
    ;

    private int type;
    private String desc;

    UserType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static UserType getByCode(int code) {
        for (UserType userType : UserType.values()) {
            if (code == userType.getType()) {
                return userType;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "UserType{" + "type=" + type + ", desc='" + desc + '\'' + "} " + super.toString();
    }
}

package pojo;

/**
 * 用户类
 */
public class User {
    //用户姓名
    private String userName;
    //用户级别（0：新用户  1：一级用户  2：二级用户）
    private Integer userLevel;

    public User(String userName,Integer userLevel){
        this.userName = userName;
        this.userLevel = userLevel;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getUserLevel() {
        return userLevel;
    }
}

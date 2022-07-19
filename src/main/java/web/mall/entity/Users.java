package web.mall.entity;
//实体类作为数据的承载，主要用于从前到后传递数据
//根据数据库内容编写用户登陆
public class Users {
    private Integer userID;
    private String userName;
    private String password;
    private int phoneNumbeer;
    private String address;
    private String registrationTime;
    private String photo;
    //status是对账号的标记，分为可用和禁用两种
    private Integer status;

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumbeer=" + phoneNumbeer +
                ", address='" + address + '\'' +
                ", registrationTime='" + registrationTime + '\'' +
                ", photo='" + photo + '\'' +
                ", status=" + status +
                '}';
    }

    public int getPhoneNumbeer() {
        return phoneNumbeer;
    }

    public void setPhoneNumbeer(int phoneNumbeer) {
        this.phoneNumbeer = phoneNumbeer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

package api.model;

/*Не удалять геттеры и конструктор*/
public class LoginRequestBody {
    private String armType;
    private String login;
    private String password;
    private String uid;

    public LoginRequestBody() {
    }

    public LoginRequestBody setArmType(String armType) {
        this.armType = armType;
        return this;
    }

    public LoginRequestBody setLogin(String login) {
        this.login = login;
        return this;
    }

    public LoginRequestBody setPassword(String password) {
        this.password = password;
        return this;
    }

    public LoginRequestBody setUid(String uid) {
        this.uid = uid;
        return this;
    }

    public String getArmType() {
        return armType;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getUid() {
        return uid;
    }
}

package api.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
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
}

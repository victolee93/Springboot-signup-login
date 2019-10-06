package com.victolee.signuplogin.domain;

        import lombok.AllArgsConstructor;
        import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Role {
    ADMIN("ROLE_ADMIN"),
    MEMBER("ROLE_MEMBER");

    private String value;
}
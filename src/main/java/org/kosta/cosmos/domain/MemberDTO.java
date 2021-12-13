package org.kosta.cosmos.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class MemberDTO {

    private String email;
    private String name;
    private String picture;
    private Role role;

    @Builder
    public MemberDTO(String email, String name, String picture, Role role) {
        this.email = email;
        this.name = name;
        this.picture = picture;
        this.role = role;
    }

    public MemberDTO update(String name, String picture) {
        this.name = name;
        this.picture = picture;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }
}

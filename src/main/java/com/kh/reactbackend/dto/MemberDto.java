package com.kh.reactbackend.dto;

import com.kh.reactbackend.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class MemberDto {

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Create{

        private String user_id;
        private String user_pwd;
        private String user_name;
        private Member.Gender gender;
        private Integer age;

    public Member toEntity() {
        return Member.builder()
                .userId(this.user_id)
                .userPwd(this.user_pwd)
                .userName(this.user_name)
                .gender(this.gender)
                .age(this.age)
                .build();
    }

    }
}

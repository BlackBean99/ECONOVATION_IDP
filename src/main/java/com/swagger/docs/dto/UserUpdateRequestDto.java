package com.swagger.docs.dto;

import com.swagger.docs.domain.user.Account;
import lombok.Data;
import lombok.Getter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Getter
public class UserUpdateRequestDto {
    @NotBlank
    private String userEmail;

    @NotNull
    @Range(min =1, max = 50)
    private Long year;

    @NotNull
    private String userName;

    @NotNull
    private String role;


    public UserUpdateRequestDto(String userEmail, Long year, String userName,String role) {
        this.userEmail = userEmail;
        this.year = year;
        this.userName = userName;
        this.role = role;
    }

    public Account toEntity(){
        return Account.builder()
                .userEmail(userEmail)
                .year(year)
                .userName(userName)
                .role(role)
                .build();
    }
}
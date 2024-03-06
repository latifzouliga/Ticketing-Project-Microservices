package com.cydeo.dto;

import com.cydeo.enums.Gender;
import com.fasterxml.jackson.annotation.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class UserDTO {

    private Long id;

    private String firstName;
    private String lastName;
    private String userName;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String passWord;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String confirmPassword;
    private boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;
}

//  localhost:8762/cydeo/user/api/v1/user
/*
{
    "firstName": "lat",
    "lastName": "zoulig",
    "userName": "lat",
    "passWord": "Abc1",
    "confirmPassword": "Abc1",
    "phone": "1231231231",
   "gender": "MALE",
   "role": {
       "id":2,
       "description":"manager"
   }
}

 */
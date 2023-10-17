package com.send.retrofit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    private String userId = UUID.randomUUID().toString();
    private String email;
    private String first_name;
    private String last_name;
    private String avatar;
    private List<Support> supportList = new ArrayList<>();
}

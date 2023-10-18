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
    String email;
    String first_name;
    String last_name;
    String avatar;
    List<Support> supportList = new ArrayList<>();
}

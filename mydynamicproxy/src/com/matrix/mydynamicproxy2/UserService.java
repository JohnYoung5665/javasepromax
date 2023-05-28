package com.matrix.mydynamicproxy2;

public interface UserService {
    String login(String loginName, String passWord);

    void deleteUsers();

    String selectUsers();
}

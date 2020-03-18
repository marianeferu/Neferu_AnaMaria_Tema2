package com.example.neferu_anamaria_tema2;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyDao {


    @Insert
    public void addUser(User user);

    @Query("select * from users")
    public List<User> getUsers();

    @Delete
    public void deleteUser(User user);



}
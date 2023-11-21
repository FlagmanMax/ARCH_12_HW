package org.example;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void getId() {
        User user = new User(1,"Name");
        assertEquals(user.getId(), 1);
    }

    @org.junit.jupiter.api.Test
    void setId() {
        User user = new User(1, "Name");
        assertEquals(user.getId(), 1);

        user.setId(2);
        assertEquals(user.getId(), 2);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        User user = new User(1, "Name");
        assertEquals(user.getName(), "Name");
    }

    @org.junit.jupiter.api.Test
    void setName() {
        User user = new User(1, "Name");
        assertEquals(user.getName(), "Name");
        user.setName("NameTest");
        assertEquals(user.getName(), "NameTest");
    }
}
package com.darshan.java8;

import java.util.ArrayList;
import java.util.List;

public class StaticReference {

    record User() {
        public static boolean isRealUser(User user) {
            return true;
        }

    }

    List<User> user = new ArrayList<>();

    public void referenceToStaticMethod(List<User> list) {
        boolean isReal = list.stream().anyMatch(u -> User.isRealUser(u));

        boolean isReal2 = list.stream().anyMatch(User::isRealUser);
    }
}

package com.johu.java.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by yewen on 2017/5/16.
 */
public class AtomicDemo3 {
    public static AtomicReference<User> atomicUserRef = new AtomicReference<User>();
    public static void main(String[] args) {
        User user = new User("conan", 15);
        atomicUserRef.set(user);
        User updateUser = new User("Shinichi", 17);
        atomicUserRef.compareAndSet(user, updateUser);
        System.out.println(atomicUserRef.get().getName());
        System.out.println(atomicUserRef.get().getOld());
    }
    static class User {
        private String name;
        private int old;
        public User(String name, int old) {
            this.name = name;
            this.old = old;
        }

        public String getName() {
            return name;
        }
        public int getOld() {
            return old;
        }
    }
}

package ru.hacker.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Profile> profiles = new ArrayList<>();

        profiles.add(new Profile("test", "123@com"));
        profiles.add(new Profile("test2", "321@com"));
        profiles.add(new Profile("test3", "231@com"));

        Facebook facebook = new Facebook(profiles);

        Iterator<Profile> itr = facebook.createFriendsIterator();

        itr.forEachRemaining(System.out::println);
    }
}

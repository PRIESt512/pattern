package ru.hacker.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Facebook {

    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public Iterator<Profile> createFriendsIterator() {
        return new FacebookIterator(this);
    }
}

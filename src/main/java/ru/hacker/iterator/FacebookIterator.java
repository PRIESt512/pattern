package ru.hacker.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FacebookIterator implements Iterator<Profile> {

    private int currentPosition = 0;
    private final List<Profile> profiles;

    public FacebookIterator(Facebook facebook) {
        this.profiles = Collections.unmodifiableList(facebook.getProfiles());
    }

    @Override
    public boolean hasNext() {
        return currentPosition < profiles.size();
    }

    @Override
    public Profile next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return profiles.get(currentPosition++);
    }
}

package com.websocket.poc.service;

import java.util.LinkedList;
import java.util.List;

import com.websocket.poc.model.User;
import org.springframework.stereotype.Service;


@Service
public class MemberStore {

    private static List<User> store = new LinkedList<>();

    public List<User> getMembers() {
        return store;
    }

    public void addMember(User member) {
        store.add(member);
    }

    public void removeMember(User member) {
        store.remove(member);
    }
}
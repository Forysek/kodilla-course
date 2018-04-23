package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;


public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum(){
        usersList.add( new ForumUser( 10001, "Attyla", 'M',
                1991, 8, 8, 54 ));
        usersList.add( new ForumUser( 10002, "Mata Hari", 'F',
                1998, 1, 5, 12 ));
        usersList.add( new ForumUser( 10003, "Mieszko", 'M',
                1997, 5, 16, 0 ));
        usersList.add( new ForumUser( 10004, "Kleopatra", 'F',
                1952, 10, 10, 65 ));
        usersList.add( new ForumUser( 10005, "Cezar", 'M',
                1978, 4, 30, 62 ));
        }
    public List<ForumUser> getUsersList(){
        return new ArrayList<>( usersList );
    }

}

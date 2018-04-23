package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfUsers = forum.getUsersList().stream()
                .filter( sex -> sex.getSex() == 'M' )
                .filter( birthDate -> LocalDate.now().getYear() - birthDate.getBirthDate().getYear() >= 20 )
                .filter( postsCount -> postsCount.getPostsCount() >= 1)
                .collect( Collectors.toMap(ForumUser::getIdentificator, forumUser -> forumUser));


        System.out.println("# of elements: " + mapOfUsers.size());
        mapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        int[] intNumbers = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    }
}
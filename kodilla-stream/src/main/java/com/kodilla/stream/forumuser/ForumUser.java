package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {
    private final int identificator;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsCount;

    public ForumUser(final int identificator, final String username, final char sex,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth,
                     final int postsCount) {
        this.identificator = identificator;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of( yearOfBirth, monthOfBirth, dayOfBirth );
        this.postsCount = postsCount;
    }

    public int getIdentificator() {
        return identificator;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return identificator == forumUser.identificator &&
                sex == forumUser.sex &&
                postsCount == forumUser.postsCount &&
                Objects.equals( username, forumUser.username ) &&
                Objects.equals( birthDate, forumUser.birthDate );
    }

    @Override
    public int hashCode() {

        return Objects.hash( identificator, username, sex, birthDate, postsCount );
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identificator=" + identificator +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsCount=" + postsCount +
                '}';
    }
}

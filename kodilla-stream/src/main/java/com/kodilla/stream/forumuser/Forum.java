package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(753, "user01", 'M', 1992,9,19, 0 ));
        usersList.add(new ForumUser(512, "theBestUser", 'M', 1985,5,1, 335 ));
        usersList.add(new ForumUser(742, "Amir", 'M', 1977,10,17, 13 ));
        usersList.add(new ForumUser(335, "RysiekCebula", 'M', 1998,11,21, 76 ));
        usersList.add(new ForumUser(472, "Krzysztof Wozniak", 'M', 1980,8,11, 99 ));
        usersList.add(new ForumUser(891, "Diobel97", 'F', 2006,2,9, 0 ));
        usersList.add(new ForumUser(518, "Andzii06", 'F', 1999,7,18, 756 ));
        usersList.add(new ForumUser(914, "Heyter", 'M', 2001,12,26, 55 ));
        usersList.add(new ForumUser(273, "Musielak1", 'M', 1991,6,29, 0 ));
        usersList.add(new ForumUser(621, "Sweetglory", 'F', 1997,3,31, 123 ));
        usersList.add(new ForumUser(911, "NoName", 'F', 1989,3,5, 673 ));
    }

    public List<ForumUser> getList() {
        return  new ArrayList<>(usersList);
    }


}

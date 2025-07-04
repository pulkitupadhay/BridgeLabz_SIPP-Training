package DSA.LINKED_LISTS;

import java.util.*;
public class SocialMediaSystem {
    static class UserNode {
        int userId, age;
        String name;
        List<Integer> friendIds;
        UserNode next;

        UserNode(int id, String name, int age) {
            this.userId = id;
            this.name = name;
            this.age = age;
            this.friendIds = new ArrayList<>();
        }
    }

    UserNode head = null;

    void addUser(int id, String name, int age) {
        UserNode node = new UserNode(id, name, age);
        node.next = head;
        head = node;
    }

    UserNode findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriendConnection(int id1, int id2) {
        UserNode user1 = findUser(id1);
        UserNode user2 = findUser(id2);
        if (user1 != null && user2 != null) {
            if (!user1.friendIds.contains(id2)) user1.friendIds.add(id2);
            if (!user2.friendIds.contains(id1)) user2.friendIds.add(id1);
        }
    }

    void removeFriendConnection(int id1, int id2) {
        UserNode user1 = findUser(id1);
        UserNode user2 = findUser(id2);
        if (user1 != null && user2 != null) {
            user1.friendIds.remove(Integer.valueOf(id2));
            user2.friendIds.remove(Integer.valueOf(id1));
        }
    }

    void findMutualFriends(int id1, int id2) {
        UserNode user1 = findUser(id1);
        UserNode user2 = findUser(id2);
        if (user1 == null || user2 == null) {
            System.out.println("User(s) not found.");
            return;
        }
        Set<Integer> mutual = new HashSet<>(user1.friendIds);
        mutual.retainAll(user2.friendIds);
        System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ": " + mutual);
    }

    void displayFriends(int id) {
        UserNode user = findUser(id);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }
        System.out.println("Friends of " + user.name + ": " + user.friendIds);
    }

    void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Found user: ID=" + temp.userId);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }

    void searchById(int id) {
        UserNode user = findUser(id);
        if (user != null)
            System.out.println("Found user: " + user.name);
        else
            System.out.println("User not found.");
    }

    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friendIds.size() + " friends.");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaSystem sm = new SocialMediaSystem();
        sm.addUser(1, "Alice", 25);
        sm.addUser(2, "Bob", 30);
        sm.addUser(3, "Charlie", 28);
        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.displayFriends(1);
        sm.displayFriends(2);
        sm.findMutualFriends(2, 3);
        sm.searchByName("Alice");
        sm.countFriends();
    }
}


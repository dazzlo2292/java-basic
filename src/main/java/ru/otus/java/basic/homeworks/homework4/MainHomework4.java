package ru.otus.java.basic.homeworks.homework4;

import java.time.Year;

public class MainHomework4 {
    public static void main(String[] args) {
        User[] users = new User[] {
                new User("Surname1","User1","FatherName1",1980,"user1@mail.com"),
                new User("Surname2","User2","FatherName2",1981,"user2@mail.com"),
                new User("Surname3","User3","FatherName3",1982,"user3@mail.com"),
                new User("Surname4","User4","FatherName4",1983,"user4@mail.com"),
                new User("Surname5","User5","FatherName5",1984,"user5@mail.com"),
                new User("Surname6","User6","FatherName6",1985,"user6@mail.com"),
                new User("Surname7","User7","FatherName7",1986,"user7@mail.com"),
                new User("Surname8","User8","FatherName8",1987,"user8@mail.com"),
                new User("Surname9","User9","FatherName9",1988,"user9@mail.com"),
                new User("Surname10","User10","FatherName10",1989,"user10@mail.com")
        };

        int currentYear = Year.now().getValue();

        for (User user : users) {
            if (currentYear - user.getYearOfBirth() >= 40) {
                user.printInfo();
                System.out.println();
            }
        }

        Box box = new Box(40,"Black");
        box.printInfo();
        box.setColor("White");
        box.printInfo();
        box.putItem("Notebook");
        box.open();
        box.putItem("Notebook");
        box.printInfo();
        System.out.println(box.getItem() + " get out of the box\n");
        box.close();
        box.printInfo();
    }
}

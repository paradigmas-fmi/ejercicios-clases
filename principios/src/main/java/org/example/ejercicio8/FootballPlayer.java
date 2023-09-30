package org.example.ejercicio8;

public class FootballPlayer {

    private String name;
    private Integer age;
    private String role;

    public FootballPlayer(String name, Integer age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void showFootballerRole() {
        switch (this.role) {
            case "goalkeeper":
                System.out.println("The footballer, " + this.name + " is a goalkeeper");
                break;
            case "defender":
                System.out.println("The footballer, " + this.name + " is a defender");
                break;
            case "midfielder":
                System.out.println("The footballer, " + this.name + " is a midfielder");
                break;
            case "forward":
                System.out.println("The footballer, " + this.name + " is a forward");
                break;
            default:
                throw new Error("Unsupported role");
        };
    }
}


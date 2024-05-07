package ru.otus.java.basic.homeworks.homework5;

public abstract class Animal {
    String name;
    float runSpeed;
    float swimSpeed;
    float stamina;
    boolean isTired = false;

    public Animal(String name, int runSpeed, int swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public float run(int distance) {
        System.out.println(name + " started to run...");
        if (distance <= stamina) {
            stamina -= distance;
            System.out.println("..." + name + " finished!");
            return distance / runSpeed;
        } else {
            System.out.println("..." + name + " is tired.");
            stamina = 0;
            isTired = true;
            return -1;
        }
    }

    public abstract float swim(int distance);

    public void info() {
        System.out.printf(
                "Name: %s\n" + "Run speed (m/s): %.2f\n" + "Swim speed (m/s): %.2f\n" + "Stamina: %.2f\n" + "Is tired: %b\n\n",
                name , runSpeed, swimSpeed, stamina, isTired
        );
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public float getRunSpeed() { return runSpeed; }

    public void setRunSpeed(int runSpeed) { this.runSpeed = runSpeed; }

    public float getSwimSpeed() { return swimSpeed; }

    public void setSwimSpeed(int swimSpeed) { this.swimSpeed = swimSpeed; }

    public float getStamina() { return stamina; }

    public void setStamina(int stamina) {
        if (stamina >= 0) {
            this.stamina = stamina;
        }
        if (this.stamina > 0 && isTired) {
            this.isTired = false;
        }
    }

    public boolean isTired() { return isTired; }

    public void setTired(boolean tired) { isTired = tired; }
}

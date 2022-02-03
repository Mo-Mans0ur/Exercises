package Exam;

public abstract class Enemy {
    private int health;
    private String name;


    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", name='" + name + '\'' +
                '}';
    }
/*
    public int getAttacked() {
        for (int i = 0; i < getHealth() ; i++) {
            if (getHealth() >= 0) {
                int newHealth = getHealth() - 1;
                return newHealth;
            }

        }

    }

 */
}

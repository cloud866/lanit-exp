package animals;

public class Kotik {
    private static final int METHODS = 5;
    private static int count;
    private String name;
    private String voice;
    private int satiety;
    private int weight;

    public Kotik() {
        count++;
    }

    public Kotik(String name, String voice, int satiety, int weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean play() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик " + name + " играет");
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик " + name + " спит");
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик " + name + " умывается");
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик " + name + " гуляет");
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            satiety--;
            System.out.println("Котик " + name + " охотится");
            return true;
        } else {
            System.out.println("Котик " + name + " хочет есть");
            return false;
        }
    }

    public void eat(int satietyIncrease) {
        satiety += satietyIncrease;
        System.out.println("Котик " + name + " ест");
    }

    public void eat(int satietyIncrease, String foodName) {
        satiety += satietyIncrease;
        System.out.println("Котик " + name + " ест " + foodName);
    }

    public void eat() {
        eat(5, "рыбу");
    }

    public String[] liveAnotherDay() {
        String[] results = new String[24];
        for (int hour = 0; hour < 24; hour++) {
            int action = (int) (Math.random() * METHODS) + 1;
            switch (action) {
                case 1:
                    if (play()) {
                        results[hour] = hour + " - играл";
                    } else {
                        eat();
                        results[hour] = hour + " - ел";
                    }
                    break;
                case 2:
                    if (sleep()) {
                        results[hour] = hour + " - спал";
                    } else {
                        eat();
                        results[hour] = hour + " - ел";
                    }
                    break;
                case 3:
                    if (wash()) {
                        results[hour] = hour + " - умывался";
                    } else {
                        eat();
                        results[hour] = hour + " - ел";
                    }
                    break;
                case 4:
                    if (walk()) {
                        results[hour] = hour + " - гулял";
                    } else {
                        eat();
                        results[hour] = hour + " - ел";
                    }
                    break;
                case 5:
                    if (hunt()) {
                        results[hour] = hour + " - охотился";
                    } else {
                        eat();
                        results[hour] = hour + " - ел";
                    }
                    break;
                default:
                    break;
            }
        }
        return results;
    }
}
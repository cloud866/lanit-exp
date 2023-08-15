import animals.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik("Мурзик", "Мяу-мяу", 7, 3.5);
        Kotik kotik2 = new Kotik();
        kotik2.setName("Барсик");
        kotik2.setVoice("Мяу");
        kotik2.setSatiety(5);
        kotik2.setWeight(4.2);

        String[] kotik1Activities = kotik1.liveAnotherDay();
        for (String activity : kotik1Activities) {
            System.out.println(activity);
        }

        System.out.println("Имя котика: " + kotik2.getName());
        System.out.println("Вес котика: " + kotik2.getWeight());

        boolean sameVoice = compareVoice(kotik1, kotik2);
        System.out.println("Котики разговаривают одинаково: " + sameVoice);

        System.out.println("Количество созданных котиков: " + Kotik.getCount());
    }

    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());
    }
}
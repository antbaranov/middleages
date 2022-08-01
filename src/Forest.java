import java.util.List;

public class Forest {
    public List<MountainHare> hares;

    // объявите недостающие переменные и добавьте конструктор
    private static String season;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public static void setSeason(String season) {
        Forest.season = season;

        if (season.equals("зима")) {
            MountainHare.setColor("белый");
        } else{
            MountainHare.setColor("серо-рыжий");
        }
    }

    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare : hares) {
    System.out.println(hare);
        }
    }

}
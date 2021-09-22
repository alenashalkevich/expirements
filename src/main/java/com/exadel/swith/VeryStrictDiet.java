package com.exadel.swith;

public class VeryStrictDiet {
    public void takeLunch(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SUNDAY:
                System.out.println("Воскресный обед! Сегодня можно даже немного сладкого");
                return;
            case MONDAY:
                System.out.println("Обед для понедельника: куриная лапша!");
                return;
            case TUESDAY:
                System.out.println("Вторник, сегодня суп из сельдерея :(");
                return;
            //...и так далее до конца
        }
    }

    public static void main(String[] args) {
        VeryStrictDiet v = new VeryStrictDiet();
        v.takeLunch(DayOfWeek.SUNDAY);
        v.takeLunch(DayOfWeek.MONDAY);
    }
}

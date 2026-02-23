void main() {
    System.out.println("Задание 1");
    int firstFriday = 5;
    int i = 1;
    for (; i < 31; i++) {
        if (i >= firstFriday && (i - firstFriday) % 7 == 0)
            System.out.println("Сегодня пятница " + i + "-e число. Необходимо подготовить отчёт");
    }
    {
        System.out.println("Задание 2(do/while)");
        int total = 42195;
        int step = 500;
        int distance = 0;
        do {
            distance += step;
            if (distance <= total) {
                int i2 = total - distance;
                System.out.println("Держись! осталось " + i2 + " метров");
            }
        } while (distance < total);
    }
    {
        System.out.println("Задани 2(for)");
        int distance1 = 42195;
        for (; distance1 > 0; distance1 = distance1 - 500)
            if (distance1 > 0) {
                System.out.println("Держитесь! Осталось " + distance1 + " меторв.");
            }
    }
    {
        System.out.println("Задание 3(while)");
        int day = 0;
        int money = 700;
        while (money > 0) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            money -= 100;
            System.out.println("На счету " + money + " рублей. Вы можете оставить автомобиль на " + day + " дней.");
        }
    }
    {
        System.out.println("Задание 3 (For)");
        int budget = 700;
        int day1 = 0;
        for (; budget > 0; day1++) {
            if (day1 % 5 == 0) {
                continue;
            }
            budget -= 100;
            System.out.println("На счету " + budget + " рублей. Вы можете оставить автомобиль на " + day1 + " дней.");
        }
    }
    {
        System.out.println("Задание 4");
        int target = 12000000;
        int mountContribution = 15000;
        double percent = 0.07;
        int month = 0;
        int total = 0;
        while (true) {
            month++;
            total += mountContribution;
            if (month % 6 == 0) {
                total += (total * percent);
            }
            System.out.println("Месяц " + month + " накоплено " + total + " рублей");
            if (total >= target) {
                System.out.println("Цель достигнута через " + month + " месяцев");
                break;
            }
        }
    }
    {
        System.out.println("Задание 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        int skip = 0;
        while (true) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев " + overheats + " на " + minute + " минуте");
                skip = 2;
                if (overheats >= 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд " + charge + " %");
                    break;
                }
                continue;
            }
            if (skip > 0) {
                skip--;
                continue;
            }
            charge += 2;
            if (charge >= 100) {
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}

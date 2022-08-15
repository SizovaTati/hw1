public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte cherry = -127;
        short bread = 32564;
        int cake = 123456;
        long beer = 1245L;
        float meat = 12.56f;
        double fish = 45.56;
        boolean b = true;
        char c = '$';

        // Задание 2
        System.out.println();

        float firstWeight = 78.2f;
        float secondWeight = 82.7f;
        float totalWeight = firstWeight + secondWeight;
        System.out.println("Общий вес бойцов " + totalWeight + " кг.");
        float differenceWeight = Math.abs(firstWeight - secondWeight);
        System.out.println("Разница в весе " + differenceWeight + " кг.");

        // Задание 3
        System.out.println();

        short banana = 5;
        short weightBanana = 80;
        short milk = 200 / 100;
        short weightMilk = 105;
        short iceCream = 2;
        short weightIceCream = 100;
        short egg = 4;
        short weightEgg = 70;
        float weightCocktail = (float) (weightBanana * banana) + (weightMilk * milk) + (
                weightIceCream * iceCream) + (weightEgg * egg);
        float kgCocktail = weightCocktail / 1000;

        System.out.println("Общий вес коктеля " + weightCocktail + " грамм, это " + kgCocktail + " килограмм.");

        //Задание 4
        System.out.println();

        int extraKg = 7;
        int diet250 = extraKg * 1000 / 250;
        int diet500 = extraKg * 1000 / 500;
        System.out.println("Если сбрасывать каждый день по 250 грамм, то можно похудеть за " + diet250 + " дней");
        System.out.println("Если сбрасывать каждый день по 500 грамм, то можно похудеть за " + diet500 + " дней");
        float dayDiet = (float) ((diet250 + diet500) / 2);
        System.out.println("В среднем за " + dayDiet + " дней");

        //Задание 5
        System.out.println();

        int percent = 10;
        float multiplier = (float) (percent / (100 * 1.0));

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int krisSalary = 76230;
        float mashaNewSalary = mashaSalary + (mashaSalary*multiplier);
        float denisNewSalary = denisSalary + (denisSalary*multiplier);
        float krisNewSalary = krisSalary + (krisSalary*multiplier);
        float marginMasha = (mashaNewSalary-mashaSalary) * 12;
        float marginDenis = (denisNewSalary-denisSalary)* 12;
        float marginKris = (krisNewSalary-krisSalary) * 12;

        System.out.println("В прошлом году Маша получала " + mashaSalary + " рублей, " +
                "а после повышения заработной платы оклад вырос до " + mashaNewSalary
                + " в месяц. За год прибыль выросла на " + marginMasha + " рублей.");
        System.out.println("В прошлом году Денис получал " + denisSalary + " рублей, " +
                "а после повышения заработной платы оклад вырос до " + denisNewSalary
                + " в месяц. За год прибыль выросла на " + marginDenis + " рублей.");
        System.out.println("В прошлом году Кристина получал " + krisSalary + " рублей, " +
                "а после повышения заработной платы оклад вырос до " + krisNewSalary
                + " в месяц. За год прибыль выросла на " + marginKris + " рублей.");
    }
}
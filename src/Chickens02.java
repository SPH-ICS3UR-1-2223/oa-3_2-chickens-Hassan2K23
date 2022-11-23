public class Chickens02 {
    public static void main(String[] args) {
        
        int eggsPerChicken = 4;
        int totalEggs = 0;
        int chickenCount = 8;
        // Monday
        totalEggs = eggsPerChicken * chickenCount;
        // Tuesday
        totalEggs += eggsPerChicken * chickenCount;
        // Wednesday
        chickenCount /= 2;
        totalEggs += eggsPerChicken * chickenCount;
        double dailyAverage = 0;
        double monthlyProfit = 0;
        double monthlyAverage = dailyAverage * 30;
        double eggCount = 100;
        // MONDAY
        eggCount += 100;
        // TUESDAY
        eggCount += 121;
        // WEDNESDAY
        eggCount =+ 117;
        dailyAverage = eggCount / 3;
        monthlyAverage = dailyAverage * 30;
        monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
        }
        }

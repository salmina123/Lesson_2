public class Main {
    public static void main(String[] args) {
        System.out.println(weather(20, 40));
        System.out.println(weather(34, 56));
        System.out.println(weather(23, 67));
        System.out.println(weather(13, 12));
        System.out.println(weather(76, 98));
    }

    public static String weather(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 &&
                temperature <= 30) {
            return "Можно идти гулять";
        } else if (age >= 20 && temperature >= 0 && temperature <=
                28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature <=
                25) {
            return "Можно идти гулять";
        } else {
            return "оставайтесь дома";
        }
    }
}
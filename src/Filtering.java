import java.util.Scanner;

public class Filtering {
    public void startFiltering() {
        boolean validation = false;
        while (!validation) {
            Scanner str = new Scanner(System.in);
            int numb;
            String number = str.next();
            if (!isValidNumber(number)) {
                System.out.println("Пожалуйста, введите только числа (100 - легковой, 200 - грузовой, 300 - пассажирский, 400 - тяжелая техника)");
            } else {
                numb = Integer.parseInt(number);
                if (number.length() == 3 && (numb == 100 || numb == 200 || numb == 300 || numb == 400)) {
                    checkNumber(numb);
                    validation = true;
                } else {
                    System.out.println("Введенное число не соответствует ни одному номеру, попробуйте еще раз (100 - легковой, 200 - грузовой, 300 - пассажирский, 400 - тяжелая техника) ");
                    validation = false;
                }
            }
            System.out.println(validation);
        }
    }

    public void checkNumber(int number) {
        switch (number) {
            case 100:
                info100();
            case 200:
                info200();
            case 300:
                info300();
            case 400:
                info400();
        }

    }

    public void info100() {
        int[] code = Parsing.getCodeData();
        int[] number = Parsing.getNumber();
        int[] mileage = Parsing.getMileage();
        String[] optional = Parsing.getOptional();
        for (int i = 0; i < code.length; i++) {
            if (code[i] == 100) {
                System.out.println("Легковые авто:");
                System.out.println("Номер автомобиля:" + number[i] + "   Пробег: " + mileage[i] + "   Дополнительно: " + optional[i]);
            }
        }
        startFiltering();
    }

    public void info200() {
        int[] code = Parsing.getCodeData();
        int[] number = Parsing.getNumber();
        int[] mileage = Parsing.getMileage();
        String[] optional = Parsing.getOptional();
        for (int i = 0; i < code.length; i++) {
            if (code[i] == 200) {
                System.out.println("Грузовые авто:");
                System.out.println("Номер автомобиля:" + number[i] + "   Пробег: " + mileage[i] + "   Дополнительно: " + optional[i]);
            }
        }
        startFiltering();
    }

    public void info300() {
        int[] code = Parsing.getCodeData();
        int[] number = Parsing.getNumber();
        int[] mileage = Parsing.getMileage();
        String[] optional = Parsing.getOptional();
        for (int i = 0; i < code.length; i++) {
            if (code[i] == 300) {
                System.out.println("Пассажирский транспорт:");
                System.out.println("Номер автомобиля:" + number[i] + "   Пробег: " + mileage[i] + "   Дополнительно: " + optional[i]);
            }
        }
        startFiltering();
    }

    public void info400() {
        int[] code = Parsing.getCodeData();
        int[] number = Parsing.getNumber();
        int[] mileage = Parsing.getMileage();
        String[] optional = Parsing.getOptional();
        for (int i = 0; i < code.length; i++) {
            if (code[i] == 400) {
                System.out.println("Тяжелая техника:");
                System.out.println("Номер автомобиля:" + number[i] + "   Пробег: " + mileage[i] + "   Дополнительно: " + optional[i]);
            }
        }
        startFiltering();
    }

    public static boolean isValidNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}

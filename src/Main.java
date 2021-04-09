public class Main {
    public static void main(String[] args) {
        String[] data = new String[]{"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
        Parsing.Start(data);
        Calculation calculation = new Calculation();
        calculation.fullCostForClass(data);
        System.out.println("Общая стоимость ГМС: " + calculation.fullCostToALLClasses() + " руб.");
        System.out.println("Стоимость для легковых авто: " + calculation.getTotal_cost100() + " руб.");
        System.out.println("Стоимость для грузовых авто: " + calculation.getTotal_cost200() + " руб.");
        System.out.println("Стоимость для пассажирского транспорта: " + calculation.getTotal_cost300() + " руб.");
        System.out.println("Стоимость для тяжелой техники: " + calculation.getTotal_cost400() + " руб.");
        System.out.println("Минимальная стоимость расходов у машин типа: " + calculation.minCost());
        System.out.println("Максимальная стоимость расходов у машин типа: " + calculation.maxCost());
        System.out.println("Введите номер типа авто, который хотите посмотреть подробнее (100 - легковой, 200 - грузовой, 300 - пассажирский, 400 - тяжелая техника: ");
        Filtering filtering = new Filtering();
        filtering.startFiltering();
    }

}

import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;
    Converter converter = new Converter();

    StepTracker(Scanner scan){
        scanner = scan;
        // Обьявление списка месяцев для фиксирования количества шагов по дням
        for(int i = 0; i < monthToData.length; i++){
            monthToData[i] = new MonthData();
        }
    }
    // Метод присвоения кол-ва шагов за опрделенный день, опредленному месяцу
    public  void addNewNumberStepsPerDay(){
        int numMonth;
        int numDay;
        int countStep;


        System.out.print("Введите номер месяца: ");
        numMonth = scanner.nextInt();

        if(numMonth < 1 || numMonth > 12){
            System.out.println("Номер месяца должен быть в диапозоне от 1 до 12 включительно");
            return;
        }
        System.out.print("Введите номер дня: ");
        numDay = scanner.nextInt();

        if(numDay < 1 || numDay > 30){
            System.out.println("Номер дня должен быть в диапозоне от 1 до 30 включительно");
            return;
        }
        System.out.print("Введите количество шагов: ");
        countStep = scanner.nextInt();

        if(countStep < 0){
            System.out.println("Количество шагов должно быть больше или равно 0");
            return;
        }

        monthToData[numMonth - 1].days[numDay - 1] = countStep;
    }
    // Метод изменения цели шагов за день
    public void changeStepGoal(){
        System.out.print("Укажите цель (кол-во шагов в день): ");
        int goalCheck = scanner.nextInt();

        if (goalCheck <= 0){
            System.out.print("Количество шагов должно быть больше 0");
            return;
        } else {
            goalByStepsPerDay = goalCheck;
        }
    }

    public void printStatistic(){
        int numMonth;


        System.out.println("Введите номер месяца, для которого хотите увидеть статистику: ");
        numMonth = scanner.nextInt();

        if(numMonth < 1 || numMonth > 12){
            System.out.println("Номер месяца должен быть в диапозоне от 1 до 12 включительно");
            return;
        }
        // Блок опредления переменных статистики
        int sumStep = monthToData[numMonth - 1].sumStepsFromMonth();
        int maxStep = monthToData[numMonth - 1].maxSteps();
        int bestSer = monthToData[numMonth - 1].bestSeries(goalByStepsPerDay);
        int convertStepKm = converter.convertToKm(sumStep);
        int convertStepKilo = converter.convertStepsToKilocalories(sumStep);

        System.out.println("Количество пройденных шагов по дням:");
        monthToData[numMonth - 1].printDaysAndStepsFromMonth();


        System.out.println("Общее количество шагов за месяц: " + sumStep);
        System.out.println("Максимальное пройденное количество шагов в месяце: " + maxStep);
        System.out.println("Cреднее количество шагов: " + ((sumStep * 1.0) / 30));
        System.out.println("Пройденная дистанция (в километрах): " + convertStepKm);
        System.out.println("Количество сожжённых килокалорий: " + convertStepKilo);
        System.out.println("Лучшая серия: " + bestSer );

    }
}

public class MonthData {
    int[] days;
    MonthData(){
        days = new int[30];
    }
    // Метод отображения количества шагов за день, в месяц
    public void printDaysAndStepsFromMonth(){
        for (int i = 0; i < days.length; i++){
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }
    // Метод подсчёта суммы шагов за месяц
    public int sumStepsFromMonth(){
        int sumStep = 0;

        for (int i = 0; i < days.length; i++){
            sumStep += days[i];
        }
        return sumStep;
    }
    // Метод показывающий максимальное количество шагов за месяц
    public int maxSteps(){
        int maxStep = 0;

        for (int i = 0; i < days.length; i++){
            if (maxStep < days[i]){
                maxStep = days[i];
            }
        }
        return maxStep;
    }
    /* Метод возвращающий максимальное количество подряд идущих дней, в течение которых количество шагов за день
       было равно или выше целевого (goalByStepsPerDay)
     */
    int bestSeries(int goalByStepsPerDay){
        int bestPart = 0;
        int checkPart = 0;

        for (int i = 0; i < days.length; i++){
           if (days[i] >= goalByStepsPerDay){
               checkPart += 1;
               // Проверка: текущая серия больше или равно лучшей
               if(bestPart <= checkPart){
                   bestPart = checkPart;
               }
           } else{
               checkPart = 0;
           }
        }
        return bestPart;
    }

}

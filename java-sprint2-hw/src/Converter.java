public class Converter {
    // Метод преобразования шагов в километры
    public int convertToKm(int steps){
        int kilometers = (steps * 75) / 100000;

        return kilometers;
    }
    // Метод преобразования шагов в килокалории
    public int convertStepsToKilocalories(int steps){
        int kilocalories = (steps * 50) / 1000;

        return kilocalories;
    }
}

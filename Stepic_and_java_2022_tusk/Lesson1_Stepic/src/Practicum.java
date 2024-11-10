import java.util.Scanner;
/*
Помогите Старой Жабе 🐸 перейти дорогу. Она незнакома с человеческими правилами дорожного движения, но понимает код на Java (потому что это Джа-а-ава).
Вот пять основных правил дорожного движения для пешехода:

Переходите дорогу только на пешеходных переходах или в местах, где это разрешено. Никогда не переходите дорогу на красный свет светофора.

При переходе дороги не по переходам обращайте внимание на движение транспортных средств. Смотрите в обе стороны и убедитесь, что автомобили не приближаются к месту перехода.

При переходе нескольких полос на первой половине дороги смотрите налево, а потом направо.

Никогда не перебегайте дорогу вблизи поворотов, перекрёстков или остановок общественного транспорта. В этих местах водители не всегда видят пешеходов и могут не успеть затормозить в случае необходимости.

Составьте программу, в которой по заданным условиям на дороге Жаба примет решение, можно ли сейчас перейти дорогу. По возможности поясняйте правила движения на каждом шаге алгоритма.
*/

public class Practicum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isTrafficLightGreen = false;

        boolean isVehicleApproaching = false;

        System.out.println("Вы находитесь около пешеходного перехода (да/нет)?");
        String onCrosswalk = scanner.nextLine();
        boolean isOnCrosswalk = onCrosswalk.equals("да"); // проверьте, ответил ли пользователь утвердительно

        if (isOnCrosswalk) {
            // Если пешеход находится на пешеходном переходе:
            System.out.println("Горит ли зелёный сигнал светофора (да/нет)?");
            String trafficLightGreen = scanner.nextLine();
            isTrafficLightGreen = trafficLightGreen.equals("да");
            if (!(isTrafficLightGreen)) {
                // Если светофор красный:
                System.out.println("Не переходите дорогу на красный свет светофора!");
            }
        } else {
            // Если к пешеходу приближается транспортное средство:
            System.out.println("Видите ли вы приближающиеся автомобили (да/нет)?");
            String vehicleApproaching = scanner.nextLine();
            isVehicleApproaching = vehicleApproaching.equals("да");
            if (isVehicleApproaching) {
                System.out.println("Дождитесь, пока проедет транспортное средство!");
            }
        }

        boolean isSafePlace = false;

        if(!(isSafePlace)) {
            // Проверка на перебежку дороги в небезопасном месте:
            System.out.println("Находится ли вблизи вас поворот (П), остановка (А), перекрёсток (Х) или нет?");
            String unsafePlaceType = scanner.nextLine();
            switch (unsafePlaceType) {
                case ("П"):
                    System.out.println("Не перебегайте дорогу вблизи поворотов!");
                    break;

                case ("Х"):
                    System.out.println("Не перебегайте дорогу вблизи перекрестков!");
                    break;
                case ("А"):
                    System.out.println("Не перебегайте дорогу вблизи остановок общественного транспорта!");
                    break;
                default:
                    isSafePlace = true;

            }
        }

        if(isTrafficLightGreen && (!isOnCrosswalk && !isVehicleApproaching && isSafePlace)) {
            System.out.println("Вы можете перейти дорогу!");
            System.out.println("Сколько полос движения на дороге?");
            int linesCount = scanner.nextInt();
            if(linesCount == 1){
                System.out.println("Посмотрите в обе стороны и переходите.");
            } else {
                int halfWay = linesCount / 2;
                for(int line = 1; line <= linesCount; line++){
                    if(halfWay >= line){
                        System.out.println("Посмотрите налево и переходите.");

                    } else {
                        System.out.println("Посмотрите направо и переходите.");
                    }

                }
            }
        } else {
            System.out.println("Вы не можете перейти дорогу в этом месте!");
        }
    }
}
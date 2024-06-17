import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    Работа с шаблоном Singleton (Одиночка).



     */

    public static void main(String[] args) {
	// write your code here
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу и выводим приветствие");
        System.out.println("Здравствуй");
        logger.log("Приветствие выдано");
        Scanner scanner = new Scanner(System.in);
        logger.log("Создан объект типа Scanner");
        String stringN;// размер списка в текстовом формате
        logger.log("Создана строковая переменная для приема размерности списка");
        Integer intN; //размер списка в целочисленном формате
        logger.log("Создана целочисленная переменная для приема размерности списка");
        System.out.println("Для создания списка размером N введи число N:");
        logger.log("сейчас будет введено число для размерности списка");
        stringN = scanner.nextLine();
        logger.log("Число получено");
        intN=Integer.parseInt(stringN);
        logger.log("Число переведено в целочисленный формат из текстового");
        System.out.println("Введите верхнюю границу для значений: ");
        logger.log("сейчас будет введено число для определения верхней границы списка");
        String stringLim=scanner.nextLine();
        logger.log("Число получено");
        Integer intLim = Integer.parseInt(stringLim);
        logger.log("Число переведено в целочисленный формат из текстового");
        System.out.println("Введите порог для фильтра");
        logger.log("Программа выполняется");
        String stringFilter=scanner.nextLine();
        logger.log("Порог введен");
        Integer intFilter = Integer.parseInt(stringFilter);
        logger.log("Порог переведен в целочисленный формат");
        scanner.close();
        logger.log("Объект типа Scanner закрыт");
        List<Integer> list = new ArrayList<>();
        logger.log("Создан список для наполнения");
        for (int i = 0; i<intN; i++){
            logger.log("Создаем новый элемент списка");
            list.add(new Random().nextInt(intLim));
            logger.log("Новый элемент создан");
        }
        logger.log("Список наполнен элементами. Переходим к созданию фильтра");
        Filter filter = new Filter(intFilter);
        logger.log("фильтр создан, приступаем к запуску фильтра и выводу результатов");
        System.out.println(filter.filterOut(list));
        logger.log("Результаты выведены");
        System.out.println("Всего хорошего");
        logger.log("Программа завершена");



    }
}

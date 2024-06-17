import java.util.ArrayList;
import java.util.List;

public class Filter {
    /*
    Создайте класс Filter с конструктором, принимающим параметр f, и методом List<Integer> filterOut(List<Integer> list) для фильтрации списка.
    Используйте внутри него логгирование (можно как в примере вывода выше),
    но не передавайте логгер объекту фильтра через параметры, а сделайте Logger logger = Logger.getInstance() прямо там в коде,
    где он нужен.
     */

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Приступаем к фильтрации данных");
        List<Integer> result = new ArrayList<>();
        logger.log("Создали список для занесения результатов");
        //..
        for (Integer element :
                source) {
            logger.log("Перешли к новому элементу: " + element);
            if (element >= treshold) {
                result.add(element);
                logger.log("Этот элемент соответствует условию и добавляется в список для занесения результатов");
            }else{
                logger.log("Этот элемент не соответствует условию");
            }
            logger.log("Проверка элемента выполнена, переходим к следующему");
        }
        logger.log("Цикл проверки и отбора элементов завершен");

        return result;
    }


}

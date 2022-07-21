public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1. Инициализация переменной int i = 1.
        Object o = new Object();        // 2 Создаем ссылку на новый объект
        Integer ii = 2;                 // 3 Присваиваем значение объекту типа Integer ii = 2.
        printAll(o, i, ii);             // 4 Вызоваем метод printAll(), который содержит в себе значения(o, i, ii)
        System.out.println("finished"); // 7  Выводим строку на экран.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5.Присваиваем значение объекта uselessVar. Объект uselessVar не использован. Сборщик мусора удаляет его из памяти
        System.out.println(o.toString() + i + ii);  // 6.Создаем новый фрейм в стеке с ссылками на переменные и объекты.Метод toString() помогает нам получить представление объекта в виде строки.
    }
}
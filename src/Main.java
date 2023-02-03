public class Main {

    public static void main(String[] args) {

        MagicBox<String> box1 = new MagicBox(3); // Создаем Коробку с тремя элементами.

        System.out.println(box1.add("num1")); // Возвращает true
        System.out.println(box1.add("num2")); // Возвращает true
        System.out.println(box1.add("num3")); // Возвращает true
        System.out.println(box1.add("num4")); // Возвращает false так как привышено количество ячеек.

        System.out.println(box1.pick()); // Возвращает элемент массива с рандомным индексом.


        MagicBox<Integer> box2 = new MagicBox(6); // Создаем Коробку с десятью элементами.

        System.out.println(box2.add(42111)); // Возвращает true
        System.out.println(box2.add(12231)); // Возвращает true
        System.out.println(box2.add(34433)); // Возвращает true
        System.out.println(box2.add(23546)); // Возвращает true
        //System.out.println(box2.add(67344)); // Возвращает true
        //System.out.println(box2.add(58655)); // Возвращает true

        System.out.println(box2.pick()); // Ошибка

    }
}

public class BoxFillingException extends RuntimeException {

    public BoxFillingException(int num){
        super("Коробка ещё не заполнена, осталось заполнить: " + num);
    }

}

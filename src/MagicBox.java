import java.util.Random;

public class MagicBox<T> {

    protected int objCount;
    protected int startNum = 0;
    protected T[] boxContent;

    public MagicBox(int objCount) {
        this.objCount = objCount;
        this.boxContent = (T[]) new Object[objCount];
    }

    public boolean add(T item) {
        if (startNum < objCount && boxContent[startNum] == null) {
            boxContent[startNum] = item;
            startNum++;
            return true;
        } else {
            System.out.println("Коробка заполнена.");
            return false;
        }
    }

    public T pick() {
        for (int i = 0; i < boxContent.length; i++) {
            if (boxContent[i] == null) {
                int num = objCount - startNum;
                throw new BoxFillingException(num);
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(objCount);
        return boxContent[randomInt];
    }
}

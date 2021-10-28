package Service.Utils;

public class Exception {
    public void throwException(short[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException();
        }
    }
}

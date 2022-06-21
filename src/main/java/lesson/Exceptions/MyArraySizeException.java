package lesson.Exceptions;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    public MyArraySizeException() {
    }

    public MyArraySizeException(String s) {
        super(s);
    }

    public MyArraySizeException(int index) {
        super(index);
    }
}

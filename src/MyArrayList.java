public class MyArrayList <T>{
    private final int SIZE = 16;
    private Object[] array = new Object[SIZE];
    private int currentSize = 0;

    public void add(T obj){
        if(currentSize == array.length-1){
            resize(array.length * 2);
        }
        array[currentSize] = obj;
        currentSize++;
    }
    public T get(int index){
        return (T) array[index];
    }

    public int size(){
        return currentSize;
    }
    public void remove(int index){
        if(index>=currentSize){
            System.out.println("Вы пытались удалить элемент под индексом: " + index);
            System.out.println("Значение превышает размер массива");
            return;
        }
        for(int i = index; i < currentSize; i++){
            array[i] = array[i+1];
        }
        array[currentSize] = null;
        currentSize--;
        System.out.println("Элемент под индексом " + index + " удален");
    }

    private void resize(int newSize){
        Object[] newArray = new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, currentSize);
        array = newArray;
    }


}

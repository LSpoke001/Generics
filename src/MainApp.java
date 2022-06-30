public class MainApp {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(10);
        list.add(1);

        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println("Размер массива: " + list.size());
        System.out.println();
        list.remove(3);

        for(int i = 0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println("Размер массива: " + list.size());
    }
}

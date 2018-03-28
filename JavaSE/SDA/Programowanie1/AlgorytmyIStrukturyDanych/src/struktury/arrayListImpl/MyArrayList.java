package struktury.arrayListImpl;

class MyArrayList {
    private static final int CAPACITY = 10000;
    private int[] numbers = new int[CAPACITY];
    private int index = 0;
    public int get(int i) {
        return numbers[i];
    }
    public void add(int number) {
        if (index >= numbers.length) {
            copy(2 * numbers.length);
        }
        numbers[index++] = number;
    }

    private void copy(int newSize) {
        int[] temp = new int[newSize];
        for (int i = 0; i < size() - 1; i++) {
            temp[i] = get(i);
        }
        numbers = temp;
    }
    public int size() {
        return index + 1;
    }

    public boolean contains(Integer m){
        for(Integer i: numbers){
            if(i == m){
                return true;
            }
        }
        return false;
    }

    public boolean contains(MyArrayList otherList){
        if(numbers.length != otherList.size()) return false;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != otherList.get(i)) return false;
        }
        return true;
    }


}

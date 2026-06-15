class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.size == this.capacity){
            this.resize();
        } 
        this.arr[size] = n;
        this.size++;
    }

    public int popback() {
        int last_ele = this.arr[this.size-1];
        this.size--;
        return last_ele;
    }

    private void resize() {
        this.capacity = this.capacity*2;
        int[] temp = new int[this.capacity];
        for(int i = 0; i<this.size; i++){
            temp[i] = this.arr[i];
        }
        this.arr = temp;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}

package by.epam.unit03.class_and_obj.third_task;

public class MyСounter {
    private int min;
    private int max;
    private int presentIndex;
    private int presentValue;
    private int[] mas;

    protected MyСounter(int max, int min){
        if(max<min){
            int tmp = max;
            max = min;
            min = tmp;
        }
        if(min<10&&max>99){
            return;
        }
        mas = new int[max-min];
        this.min = min;
        this.max = max;
        presentIndex = min;
        for(int i = 0;i<max-min;i++){
             mas[i] = i;
        }
    }

    public int getMax() {
        return max;
    }
    public int getMin() {
        return min;
    }
    public void initialization(int n, int presentIndex){
        mas[presentIndex-min] = n;
    }
    public void growth(){
        if(presentIndex < max){
            presentIndex++;
            presentValue = mas[presentIndex-min];
        }
        else return;
    }
    public void reduction(){
        if(presentIndex>min){
            presentIndex--;
            presentValue = mas[presentIndex-min];
        }
        else return;
    }
    public int getPresentValue() {
        return presentValue;
    }

    public int[] getMas() {
        return mas;
    }
}

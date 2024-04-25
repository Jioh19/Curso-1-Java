package sort;

public class Container implements Comparable{
    public int num;

    public Container(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Container{" +
                "num=" + num +
                '}';
    }

    public int getNum() {
        return num;
    }


    @Override
    public int compareTo(Object o) {

        if(this.num ==((Container) o).num) {
            return 0;
        } else if(this.num < ((Container)o).num) {
            return -1;
        } else {
            return 1;
        }


    }
}

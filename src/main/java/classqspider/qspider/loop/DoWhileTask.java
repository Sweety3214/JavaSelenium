package classqspider.qspider.loop;

public class DoWhileTask {  //Finding odd or even
    public static void main(String[] args) {
        int e = 20; //19
        int o = 27;
        do {
            System.out.println(e % 2); // 0
            e++;
        }
        while ((e % 2) == 1); //false

    }


}


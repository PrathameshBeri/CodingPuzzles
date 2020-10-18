import java.util.*;


class Rand7{

    static Random r = new Random();

    public static void main(String args[]){

        for(int i = 0; i < 10; i++){
            System.out.println(rand5() + rand5()/2);
        }

    }

    static int rand5(){

        return r.nextInt(5) +1;
    }
}
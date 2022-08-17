package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(-3,2,12));
    }
        public static boolean canPack(int bigCount, int smallCount, int goal){
            int big = 5;
            int small = 1;
            big*=bigCount;
            small*=smallCount;

            if ((boolean)(big+small<goal && (bigCount<0 || smallCount<0))){
                return false;
            }
                return true;
            }
        }

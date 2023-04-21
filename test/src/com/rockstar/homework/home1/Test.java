package com.rockstar.homework.home1;

public class Test {
    public static void main(String[] args) {
        OldPhone op = new OldPhone();
        Test.playPhone(op);

        NewPhone np = new NewPhone();
        Test.playPhone(np);
    }

    public static void playPhone(Phone p){
        if (p instanceof OldPhone op){
            op.call();
            op.message();
        }else if (p instanceof NewPhone np){
            np.call();
            np.message();
            np.playGame();
        }
    }
}

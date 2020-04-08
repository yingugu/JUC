package com.yinping.study.thread.Thread2;/**
 * @package_name com.yinping.study.thread.Thread2
 * @version 0.1.0
 * @Description
 * @author yinping
 * @create 2020-04-08 13:24
 * @since 0.1.0
 **/

import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * <h3>study</h3>
 * <p>Phaser</p>
 * 模拟婚礼过程
 * @author : yinping
 * @date : 2020-04-08 13:24
 **/
public class T08_TestPhaser {
    static Random r = new Random();
    static MarriagePhaser phaser = new MarriagePhaser();
    static void milliSleep(int milli){
        try {
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        phaser.bulkRegister(7);
        for (int i = 0; i < 5; i++) {
            final int nameIndex = i;
            new Thread(new Person("p"+i)).start();
        }
        new Thread(new Person("XX")).start();
        new Thread(new Person("OO")).start();

    }

    static class MarriagePhaser extends Phaser{
        @Override
        protected boolean onAdvance(int phase, int registeredParties) {
            switch (phase){
                case 0:
                    System.out.println("all arrive"+registeredParties);
                    System.out.println();
                    return false;
                case 1:
                    System.out.println("all eat"+registeredParties);
                    System.out.println();
                    return false;
                case 2:
                    System.out.println("all leave"+registeredParties);
                    System.out.println();
                    return false;
                case 3:
                    System.out.println("XXOO"+registeredParties);
                    return true;
                default:
                    return true;
            }
        }
    }
    static class Person implements Runnable{

        String name;
        public Person(String name){this.name = name;}
        public void arrive(){

            milliSleep(r.nextInt(1000));
            System.out.printf("%s arrive! \n",name);
            phaser.arriveAndAwaitAdvance();
        }
        public void eat(){
            milliSleep(r.nextInt(1000));
            System.out.printf("%s eat! \n",name);
            phaser.arriveAndAwaitAdvance();
        }
        public void leave(){
            milliSleep(r.nextInt(1000));
            System.out.printf("%s leave! \n",name);
            phaser.arriveAndAwaitAdvance();
        }
        private void hug(){
            if (name.equals("XX")||name.equals("OO")){
                milliSleep(r.nextInt(1000));
                System.out.printf("%s XXOO! \n",name);
                phaser.arriveAndAwaitAdvance();
            }else{
                phaser.arriveAndDeregister();
            }
        }
        @Override
        public void run() {

            arrive();

            eat();

            leave();

            hug();
        }
    }
}

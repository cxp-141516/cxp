/*public class Test1 extends Thread{
    @Override
    public void run() {
        System.out.println("你好，我是用来测试的");
    }
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.start();
    }
}*/

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
public class Test1 implements Runnable{

    public static void main(String[] args) {
        new Thread(new Test1()).start();
    }

    @Override
    public void run() {
        System.out.println("Hello");
    }
}*/
/*
public class Test1{
    public static void main(String[] args) {
//      执行callable是，需要通过FutureTask实现，用于接受运算结果
        FutureTask<Integer> integerFutureTask = new FutureTask<>(new myThread());
        new Thread(integerFutureTask).start();
        try {
//          通过get()方法获取线程的返回值
            Integer integer = integerFutureTask.get();
            System.out.println("你好"+integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
class myThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int i;
        for(i=0;i<10;i++){
            System.out.println(i);
        }
        return i;
    }
}*/

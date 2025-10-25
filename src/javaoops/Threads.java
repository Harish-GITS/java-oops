package javaoops;

import java.io.*;
import java.util.*;

class MyThread extends Thread{
    public void run(){
      	String str = "Thread are started";
        System.out.println(str);
    }
}
public class Threads{
    
  	public static void main(String args[]){
  	    
      	MyThread t1 = new MyThread();
      	t1.start();
    }
}
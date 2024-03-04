package ru.zubkoff.sber.hw15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    
  }

  public static void gcTask() throws InterruptedException {
    int objects = 100_000;
    var objectList = new ArrayList<byte[]>();
    for (int i = 0; i < objects; i++) {
      objectList.add(new byte[1024]);
      TimeUnit.NANOSECONDS.sleep(1);
    }
  } 

  public static void jitTask() {
    System.out.println("////////////////////////////jit task begin////////////////////////////");
    int iterations = 1_000_000;
    var map = new HashMap<Integer, String>();
    for (int i = 0; i < iterations; i++) {
      map.put(i, "value" + i);
    }
    System.out.println("////////////////////////////jit task end////////////////////////////");
  }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bw.co.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultithreadThing implements Runnable {

    public int threadNumber;

    public MultithreadThing(int threadnumber) {
        this.threadNumber = threadnumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {

            System.out.println(threadNumber + ": " + i);           

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultithreadThing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

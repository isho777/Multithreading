/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bw.co.multithreading;

/**
 *
 * @author Ishmael
 */
public class MultithreadMain {
    public static void main(String args[]){
        for(int i = 1; i<=5; i++){
           MultithreadThing m = new MultithreadThing(i); 
           Thread t = new Thread(m);
           t.start();   
           //t.join  //join means let threat t wait for the other threads before it to complete before running
           //t.isalive  // returns true is the thread is still running else return false
        }            
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Heino
 */
public class cpuCounter {
    public static void main(String[] args) {
        int cpuCount = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newFixedThreadPool(cpuCount);
        System.out.println(cpuCount);
    }
}

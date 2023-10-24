/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ManageLoginTBBank;


/**
 *
 * @author This PC
 */
public class Main {
    public static void main(String[] args) {        
        String title= "Login Program TB Bank";
        String[] s= new String[] {"Vietnamese","English","Exit"};
        new ManageLoginTBBank(title, s).run();       
    }
}

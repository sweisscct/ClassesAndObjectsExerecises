/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjectsexerecises;

/**
 *
 * @author sam
 */
public class ClassesAndObjectsExerecises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello class!");
        

        Car car1 = new Car("Ford", "Focus", 4, "Silver");
        car1.drive("forward");

        Car car2 = new Car("Honda", "Civic", 4, "yellow");
        car2.drive(90);

    }
    
}

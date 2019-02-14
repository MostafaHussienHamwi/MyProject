/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.util.Scanner;

public class ConeArea {
    public static void main(String[] args){
int s, r;
double area;
Scanner input = new Scanner(System.in);
System.out.print("Enter the length of the slant of a right circular cone: ");
s = input.nextInt();
System.out.print("Enter the radius of its circular base: ");
r = input.nextInt();
if (s <= 0 || r <= 0) {
System.out.print("Error: One or both of the entered values are not greater than 0.");
} else {
area = (Math.PI * r * s) + (Math.PI * Math.pow(r, 2.0));
System.out.printf("Area = %.2f%n", area);
}
}
}



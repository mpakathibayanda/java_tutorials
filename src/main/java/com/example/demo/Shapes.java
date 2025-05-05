package com.example.demo;

public class Shapes {
    public Shapes(){
        setName("Sqew");
    }
   public String name;
   public double area;

   public String getName() {
       return this.name;
   }

   public void setName(String name) {
        if(name != ""){
            this.name = name;            
        }else{
            System.out.println("Invalid shape name"); 
        } 
   }

   public double getArea() {
       return this.area;
   }

   public void setArea(double area) {
        try {
            this.area = area;

        } catch (Exception error) {
            System.out.println(error.toString());
        }
   }
   
}

class Square extends Shapes{
    public void calculateArea(double height){
        
        try {

            area = height*height;
            System.out.println("Area of a square with a height of " + height + " is " + area);

        } catch (Exception error) {
            String message = error.getMessage();
            System.out.println("Error with a message: "+ message + "Accured.");
        }
        
    }    
}

class Circle {
 Shapes shapes = new Shapes(); 

 void setting(){
    shapes.setName("Circle");
 }
 String name = shapes.getName();
 
    
}

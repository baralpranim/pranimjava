package student;


import java.util.Scanner;

class student{
        String ss;
        String name;
        public student(String ss){
            name = ss;
        }
        public student()
        {
            name = "unknown";
        }
    }
    public class Pranim {
        public static void main(String[] args) {

            student obj = new student();
            obj.ss = "ram";
            System.out.println(obj.ss);
            System.out.println(obj.name);
        }
    }


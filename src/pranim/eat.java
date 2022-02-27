package pranim;

class Animal {
    public void eat()
    {   System.out.println("I am eating");
    }

    public static void main(String[] args)
    {   System.out.println("1");
        Animal tommy =new Animal();
        tommy.eat();
        tommy.run();
        Birds ss=new Birds();
        ss.fly();

    }public void run(){
        System.out.println(("I am running"));
    }
    static class Birds{
         void fly(){

            System.out.println("I am flying");


        }
    }
}

package inheritance;

public class Animal {
    void walk(){
        System.out.println("I am walking");

    }class Bird extends Animal{
        void fly(){
            System.out.println("I am flying");

        }
        public class  Solution{
            public  void main(String[] args) {
                Bird bird=new Bird();
                bird.fly();
                bird.walk();


            }




            }
        }

    }

}

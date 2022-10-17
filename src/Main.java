public class Main {
    public static void main(String[] args) {
        Shark[] sharks = {new Shark(),new Shark()};
        Turtle[] turtles = {new Turtle(), new Turtle()};
        Eagle[] eagles = {new Eagle(),new Eagle()};
        Animal[] animals = {new Shark(), new Turtle(),new Eagle()};
        for(Animal a:animals){
           if(a instanceof Shark){
               ((Shark)a).attack();
           }else if((a.getClass().getName().equals("Turtle"))){
               ((Turtle)a).swim();
           }else
               ((Eagle)a).fly();

            }
        }
}
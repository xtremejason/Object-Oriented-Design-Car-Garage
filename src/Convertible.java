//This class looks bare, however it is much more capable due to use of
//Polymorphism. It has methods and qualities that exist and have been
//implemented in superclasses.
//Benefits include code reuse, Ease of management and expandability, faster execution.

public class Convertible extends Car{
    public Convertible(){
        generatePlate("CNV");
    }

    //overload runs method
    public void runs(){
        System.out.println(plate + " skrrrrrt");
    }
}

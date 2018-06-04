 

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet{
    String name;
    int age;
    
    public Dog(String name, Integer age) {
    super(name, age);
    
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
     super(age);   
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
    super(name);
    
    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.name = "DogName";
        
    }
    
    public String speak(){
    String output = "Bark";
    return output;
    }
}

 

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    String name;
    int age;
    
    public Cat(String name, Integer age) {
     super(name, age);
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        super(age);
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
     super(name);
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        name += "Cat Name";
        age = 0;
    }
    
    
    public String speak(){
    String output = "Meow";
    return output;
    }
}

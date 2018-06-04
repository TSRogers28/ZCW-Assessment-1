 

/**
 * Created by leon on 2/16/18.
 */
import java.util.*;
public class PetOwner {
    String name;
    Pet pet;
    int numberOfPets;
    Pet [] petCollection = new Pet[10];
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pet = pet;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        for(Pet s : petCollection){
        if (s == null){
        s = pet;
        break;
        }
        }
    }
    

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        Pet [] petCollection;
        //for(Pet s : petCollection){
        
        }
    

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        Boolean answer = false;
        for (int x = 0; x < petCollection.length; x++){
        answer = (pet == petCollection[x]) ? true : false;
        }
        return answer;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        return null;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        return null;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return null;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return pet.getName();
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        
        Pet [] pets = new Pet [getNumberOfPets()];
        return pets;
    }
    
    }


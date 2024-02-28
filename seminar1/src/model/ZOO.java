package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZOO {
    private String name;
    private ZOOKeeper zooKeeper;

    private Map<Animal,String> animalStringMap;

    public ZOO(String name, ZOOKeeper zooKeeper, Map<Animal, String> animalStringMap) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animalStringMap = animalStringMap;
    }

    //pentru a da mancare diferita animalului
    public void feedAnimals(){
      for(var animal : animalStringMap.entrySet()){
          zooKeeper.feedAnimal(animal.getKey(),animal.getValue());
      }
    }


    public void addAnimal(Animal animal, String food){
          if(animalStringMap ==null){
              animalStringMap=new HashMap<>();
          }
          animalStringMap.put(animal,food);
    }
}

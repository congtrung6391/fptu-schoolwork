package repository;

import java.util.ArrayList;
import entity.Animal;

public class AnimalRepository {
  private ArrayList<Animal> list = new ArrayList<Animal>();

  public AnimalRepository () {}
  
  public AnimalRepository (ArrayList<Animal> list) {
    this.list = new ArrayList<Animal>(list);
  }

  public ArrayList<Animal> getList() { return this.list; }
  public void setList(ArrayList<Animal> list) {
    this.list = new ArrayList<Animal>(list);
  }

  public int create (Animal ani) {
    try {
      this.list.add(ani);
      return 1;
    } catch (Exception e) {
      return 0;
    }
  } 

  public ArrayList<Animal> read () {
    return this.list;
  } 

  public Animal detail (String id) {
    for (Animal ani : this.list) {
      if(ani.getId().equals(id)) {
        return ani;
      }
    }

    return null;
  }

  public int delete (String id) {
    try {
      this.list.remove(this.detail(id));
      return 1;
    } catch (Exception e) {
      return 0;
    }
  }

  public int update (Animal ani) {
    try {
      for (int i = 0; i < this.list.size(); ++i) {
        if(this.list.get(i).getId().equals(ani.getId())) {
          this.list.set(i, ani);
          break;
        }
      }
      return 1;
    } catch (Exception e) {
      return 0;
    }
  }
}

package entity;

public class Animal {
  String id;
  String name;
  double weight;
  int leg;

  public Animal () {}

  public Animal (String id, String name, double weight, int leg) {
    this.id = id;
    this.name = name;
    this.weight = weight;
    this.leg = leg;
  }

  public String getId () { return this.id; }
  public String getName () { return this.name; }
  public double getWeight() { return this.weight; }
  public int getLeg () { return this.leg; }
  
  public void setId (String id) { this.id = id; }
  public void setName (String name) { this.name = name; }
  public void setWeight(double weight) { this.weight = weight; }
  public void setLeg (int leg) { this.leg = leg; }
  
  public String toString() {
    return "(Animal)[" + id + ", " + name + ", " + weight + ", " + leg + "]";
  }
}

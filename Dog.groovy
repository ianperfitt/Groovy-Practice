class Dog extends Animal {
  def owner;

  def Dog(name, sound, owner) {
    super(name, sound);
    this.owner = owner;
  }

  def makeSound() {
    println("$king.name says $king.sound");
  }
}
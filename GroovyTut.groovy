class GroovyTut {
  static void main(String[] args) {

    println("Hello World");

    //variables are dynamically typed
    def age = "Dog";
    age = 40;

    // operators
    println("5 + 4 = " + (5 + 4));
    println("5 - 4 = " + (5 - 4));
    println("5 * 4 = " + (5 * 4));
    println("5 / 4 = " + (5.intdiv(4)));
    println("5 % 4 = " + (5 % 4));

    // floating point operators
    println("5.2 + 4.4 = " + (5.plus(4.4)));
    println("5.2 - 4.4 = " + (5.2.minus(4.4)));
    println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
    println("5.2 / 4.4 = " + (5.2 / 4.4));

    // order of operations
    println("3 + 2 * 5 = " + (3 + 2 * 5));
    println("(3 + 2) * 5 = " + ((3 + 2) * 5));

    // shortcut increment & decrement
    println("age++ = " + (age++));
    println("++age= " + (++age));
    println("age-- = " + (age--));
    println("--age = " + (--age));

    def randNum = 2.0;

    // absolute values
    println("Math.abs(-2.45) + " + Math.abs(-2.45));

    // logs
    println("Math.log(2) = " + (Math.log(2))); 

    // convert to degrees
    println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI)))

    // Generate random value from 1 to 100
    println("Math.abs(new Random().nextInt() % 100) + 1 = " + (Math.abs(new Random().nextInt() % 100) + 1));

    // Strings
    def name = "Ian Christian Perfitt";
    println('I am $name\n');
    println("I am $name\n");

    // multi line string
    def multString = '''
    I am a string
    and that is all that needs to be said
    ''';
    println(multString);

    // access elements of a string
    println("3rd Index of Name " + name[3]);
    println("Index of r " + name.indexOf('r'));

    // access a substring
    println("1st 3 Chars " + name[0..2])
    println("Substring at 1 " + name.substring(1));
    println("Substring at 1 " + name.substring(1, 4));

    // concatinate
    name = "Alliso Denniso";
    println("My name: " + name);
    println("My name: ".concat(name));

    // check for equality
    println("Ian == Ian " + 'Ian'.equals('Ian'));
    println("Ian == Ian " + 'Ian'.equalsIgnoreCase('ian'));
 
    // string input and output
    def randString = "Random";
    println("A $randString string");
    printf("A %s string \n", randString);
    print("Whats your name");
    def fName = "";
    //fName = System.console().readLine();
    println("Hello " + fName);

    // lists
    def primes = [2,3,5,7,11,13];
    println("2nd Prime " + primes[1]);
    println("2nd Prime " + primes.get(2));

    def employee = ['Derek', 40, 6.25, [1,2,3]];

    println("2nd Number " + employee[3][1]);
    println(primes);
    println("Matches " + primes.intersect([4,3,7]));
    println("Sort " + primes.sort());
    println("Last " + primes.pop());

    // map
    def paulMap = [
      'name' : 'Paul',
      'age' : 35,
      'address' : '123 Main St',
      'list' : [1, 2, 3]
    ];
    println("Name " + paulMap['name']);
    println("List Item " + paulMap['list'][1]);

    paulMap.put('city', 'Pittsburgh');
    println("Has City " + paulMap.containsKey('city'));

    //range
    def oneTo10 = 1..10;
    def aToZ = 'a'..'z';
    println(aToZ);
    println("Get First " + oneTo10.getFrom());

    // looping

    def i = 0;

    while(i < 10) {
      if(i % 2) {
        i++;
        continue;
      }
    }



  }
}
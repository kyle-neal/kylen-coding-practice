# Java

**Building**

`make build`

**Running**

`make run`. If you want to build a clean release, and then run `make clean-run`



**Creating New Problems**

All problems are classes that inherit from the Problem class with a `public void solve()` function. 

1. Create a class in `main.java.problems` naming convention should be Problem#.class
2. Add an object of the problem to the list in `main.java.Driver.class`
 
  ```
Problem problems[] = {
        null, // Using index of 1-n
        new Problem1()
};
  ```
3. Add it as an option in the menu
 
  ```
private static void print_menu() {
    System.out.println("---------------MENU---------------");
    System.out.println("| 1) Max Profit Stock Solver     |");
    System.out.println("|                                |");
    System.out.println("| q || quit) To Quit             |");
    System.out.println("----------------------------------");
}
  ```

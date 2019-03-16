package com.infoshare.zawadzkib;


import com.devskiller.jfairy.Fairy;
import com.devskiller.jfairy.producer.person.Person;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Fairy fairy = Fairy.create();
    Person person = fairy.person();

    System.out.println("Hello " + person.getFullName());
  }


}

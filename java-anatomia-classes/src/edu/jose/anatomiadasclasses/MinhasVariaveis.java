package edu.jose.anatomiadasclasses;

public class MinhasVariaveis {

  public static void main(String[] args) {
    // String myName = "José";
    // int anoFabricacao = 2022;
    // boolean isTrue = false;
    // anoFabricacao = 2018;
    String firstName = "José";
    String lastName = "Rodrigues";

    String fullName = fullName(firstName, lastName);

    System.out.println(fullName);
  }

  public static String fullName(String firstName, String lastName) {
    return "The result of the method is: " + firstName.concat(" ").concat(lastName);
  }

}

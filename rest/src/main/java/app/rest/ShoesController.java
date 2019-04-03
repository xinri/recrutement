package app.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Damn !!! no unit tests done, perhaps it should be good to do the unit tests ?
@RestController
public class ShoesController {

  private ShoesShop shoesShop = new ShoesShop();


  @GetMapping("/shoes")
  public String getShoes() {
    return "To Implement the rest call for getting the shoes by criteria";
  }

  private String transformListIntoToString(List<Shoes> listOfShoes) {
    return listOfShoes.stream()
        .map(shoes -> shoes.toString())
        .collect(Collectors.joining("\n"));
  }
}

class ShoesShop {

  private final List<Shoes> listOfShoes = new ArrayList<>();

  public ShoesShop() {
    listOfShoes.add(new Shoes("Nike", "XS", "Blue", "100"));
    listOfShoes.add(new Shoes("Nike", "S", "Blue", "50"));
    listOfShoes.add(new Shoes("Nike", "L", "Red", "150"));
    listOfShoes.add(new Shoes("Nike", "L", "Blue", "120"));
    listOfShoes.add(new Shoes("Nike", "XL", "Green", "200"));

    listOfShoes.add(new Shoes("Rebook", "XS", "Blue", "100"));
    listOfShoes.add(new Shoes("Rebook", "S", "Blue", "50"));
    listOfShoes.add(new Shoes("Rebook", "L", "Red", "150"));
    listOfShoes.add(new Shoes("Rebook", "L", "Blue", "120"));
    listOfShoes.add(new Shoes("Rebook", "XL", "Green", "200"));

    listOfShoes.add(new Shoes("Puma", "XS", "Blue", "100"));
    listOfShoes.add(new Shoes("Puma", "S", "Blue", "50"));
    listOfShoes.add(new Shoes("Puma", "L", "Red", "150"));
    listOfShoes.add(new Shoes("Puma", "L", "Blue", "120"));
    listOfShoes.add(new Shoes("Puma", "XL", "Green", "200"));
  }

  public List<Shoes> getListOfShoes() {
    return listOfShoes;
  }

  // FIXME : to implement as fast as possible.
  public List<Shoes> findShoesByCritera(String marque, String taille, String color, String prix) {
    return Collections.emptyList();
  }

  // FIXME: i didn't do the unit tests, my friend says that it might be a good idea
  public List<Shoes> findShoesBySize(String taille) {

    List<Shoes> newShoesList = new ArrayList<>();

    for (Shoes shoes : listOfShoes) {
      if (shoes.getTaille() == taille) {
        return newShoesList;
      }
    }

    return newShoesList;
  }
}

class Shoes {

  private String marque;
  private String taille;
  private String color;
  private String prix;

  Shoes(String marque, String taille, String color, String prix) {
    this.marque = marque;
    this.taille = taille;
    this.color = color;
    this.prix = prix;
  }

  public String getPrix() {
    return prix;
  }

  public String getMarque() {
    return marque;
  }

  public String getTaille() {
    return taille;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "marque : " + marque + ", taille : " + taille + ", color : " + color + ", prix : "
        + prix;
  }
}

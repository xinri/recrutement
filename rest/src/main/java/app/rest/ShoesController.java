package app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoesController {

  @GetMapping("/shoes")
  public String getMarque() {
    return "hello world";
  }
}

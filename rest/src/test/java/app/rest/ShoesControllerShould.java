package app.rest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(MockitoJUnitRunner.class)
public class ShoesControllerShould {

  private MockMvc mockMvc;

  @InjectMocks
  private ShoesController controller;

  @Before
  public void setup() {
    this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
  }
}

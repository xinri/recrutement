public interface C {
}

public class MyTask {
  
  @Autowire
  private A a;
  @Autowire
  private B b;
}

@Service
public class A implements C {
}

@Service
public class B implements C {
}

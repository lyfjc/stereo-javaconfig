package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {

  //默认情况下和方法名一致
  @Bean(name="compactDisc")
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }

  /*
  带有@Bean注解的方法可以采用任何必要的Java功能产生bean实例。
  构造器和Setter方法只是@Bean方法的两个简单样例
   */
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}

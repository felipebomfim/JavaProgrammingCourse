package businesscalculationservice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class BusinessCalculationLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (var context  = new AnnotationConfigApplicationContext(BusinessCalculationLauncher.class)){
			int max = context.getBean(BusinessCalculationService.class).findMax();
			System.out.println("Maximum found: %d".formatted(max));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

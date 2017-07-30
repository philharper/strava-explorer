package uk.co.philharper;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBootWebApplicationTest {
	
	SpringBootWebApplication springBootWebApplication = new SpringBootWebApplication();
	
	@Mock
	SpringApplicationBuilder springApplicationBuilder;
	
	@Test
	public void testSpringBoot() {
		springBootWebApplication.configure(springApplicationBuilder);
		verify(springApplicationBuilder).sources(SpringBootWebApplication.class);
	}

}

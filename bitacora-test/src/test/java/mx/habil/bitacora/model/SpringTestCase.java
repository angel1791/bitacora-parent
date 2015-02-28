package mx.habil.bitacora.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:mx/habil/bitacora/commons/xml/commons.application.context.xml",
		"classpath:mx/habil/bitacora/model/xml/model.application.context.xml"
})
public class SpringTestCase {

	@Before
	public void init(){
		log.debug("Inicio");
		log.debug("Fin");
	}
	
	@Test
	public void testSpring(){
		log.debug("Inicio");
		log.debug("Fin");
	}
}

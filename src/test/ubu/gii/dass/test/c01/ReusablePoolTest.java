/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ubu.gii.dass.c01.*;

/**
 * @author Jorge Fernandez Moreno
 * @author Alvaro Mendez Alonso
 *
 */
public class ReusablePoolTest {

	private ReusablePool pool;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
			pool=ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		try{
			while(true){
				pool.acquireReusable();
			}
		}catch(Exception ex){}
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		assertNotNull(pool);
		ReusablePool pool2 = ReusablePool.getInstance();
		assertNotNull(pool2);
		assertEquals(pool, pool2);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		Vector<Reusable> obtenidos = new Vector<>();
		try{
			while(true){
				Reusable reus = pool.acquireReusable();
				assertNotNull(reus);
				obtenidos.add(reus);
			}
		}catch (NotFreeInstanceException e){
			assertTrue(obtenidos.size()<=2);
		}
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		fail("Not yet implemented");
	}

}
package practico4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.easymock.EasyMock.*;


public class IPBlacklistTest {

	@Before
	public void setUp() throws Exception {
	}

	

	@Test
	public void testLogin() {
		IPBlacklist listaNegra = new IPBlacklist();
		LoginService service = createMock(LoginService.class);
		listaNegra.setService(service);
		
		//defino comportamiento del mock
		expect(service.login("10.11.12.12", "Juan", Utils.getPasswordHashMD5("contraseña") )).andReturn(false).times(3);
		replay(service);
		
		listaNegra.login("10.11.12.12", "Juan", "contraseña");
		listaNegra.login("10.11.12.12", "Juan", "contraseña");
		listaNegra.login("10.11.12.12", "Juan", "contraseña");
		
		verify(service); // verifico que se cumplio bien el comportamiento del mock
		assertTrue(listaNegra.blacklisted("10.11.12.12"));
		
	}
	
	
	@Test
	public void testLogin2() {
		IPBlacklist listaNegra = new IPBlacklist();
		LoginService service = createMock(LoginService.class);
		listaNegra.setService(service);
		
		//defino comportamiento del mock
		expect(service.login("10.11.12.12", "Juan", Utils.getPasswordHashMD5("contraseña") )).andReturn(false).times(2);
		replay(service);
		
		listaNegra.login("10.11.12.12", "Juan", "contraseña");
		listaNegra.login("10.11.12.12", "Juan", "contraseña");
		
		verify(service); // verifico que se cumplio bien el comportamiento del mock
		assertTrue(!listaNegra.blacklisted("10.11.12.12"));
		
	}
	
	@Test
	public void testLogin3() {
		IPBlacklist listaNegra = new IPBlacklist();
		LoginService service = createMock(LoginService.class);
		listaNegra.setService(service);
		
		//defino comportamiento del mock
		expect(service.login("10.11.12.12", "Juan", Utils.getPasswordHashMD5("contraseña") )).andReturn(false).times(1);
		replay(service);
		
		listaNegra.login("10.11.12.12", "Juan", "contraseña");
		
		verify(service); // verifico que se cumplio bien el comportamiento del mock
		assertTrue(listaNegra.lastip=="10.11.12.12");
		
	}
	//completamos la cobertura de ramas
	
	@Test
	public void testLogin4() {
		IPBlacklist listaNegra = new IPBlacklist();
		LoginService service = createMock(LoginService.class);
		listaNegra.setService(service);
		
		//defino comportamiento del mock
		expect(service.login("10.11.12.12", "Juan", Utils.getPasswordHashMD5("contraseña") )).andReturn(false).times(3);
		replay(service);
		
		listaNegra.login("10.11.12.12", "Juan", "contraseña");
		listaNegra.login("10.11.12.12", "Juan", "contraseña");
		listaNegra.login("10.11.12.12", "Juan", "contraseña");
		
		
		verify(service); // verifico que se cumplio bien el comportamiento del mock
		assertFalse(listaNegra.login("10.11.12.12", "Juan", "contraseña"));
		
	}
	@Test
	public void testLogin5() {
		IPBlacklist listaNegra = new IPBlacklist();
		LoginService service = createMock(LoginService.class);
		listaNegra.setService(service);
		
		//defino comportamiento del mock
		expect(service.login("10.11.12.12", "Juan", Utils.getPasswordHashMD5("contraseña") )).andReturn(true).times(1);
		replay(service);
		
		boolean res =listaNegra.login("10.11.12.12", "Juan", "contraseña"); 
		
		
		verify(service); // verifico que se cumplio bien el comportamiento del mock
		assertTrue(res);
		
	}
}	
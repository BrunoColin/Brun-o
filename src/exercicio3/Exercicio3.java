package exercicio3;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.junit.Test;

public class Exercicio3 {

	@Test
	public void testName() throws Exception {
		assertEquals(1, 2);
	}
	
	@Test
	public void dataHoje() throws Exception {
		
		LocalDate hoje = new LocalDate(2017, 4, 1);
		assertEquals(1, hoje.getDayOfMonth());
		assertEquals(4, hoje.getMonthOfYear());
		assertEquals(2017, hoje.getYear());
		
	}
	
	@Test
	public void dataNascimento() throws Exception {
		
		LocalDate dataNascimento = new LocalDate(1993, 1, 8);
		
		assertEquals(1993, dataNascimento.getYear());
		assertEquals(1, dataNascimento.getMonthOfYear());
		assertEquals(8, dataNascimento.getDayOfMonth());	
		
	}
	
	@Test
	public void horario() throws Exception {
		
		LocalTime horario = new LocalTime(8, 59);
		
		assertEquals(8, horario.getHourOfDay());
		assertEquals(59, horario.getMinuteOfHour());	
	}
	
	@Test (expected = Exception.class)
	public void mesInvalido() throws Exception {
		
		LocalDate data = new LocalDate(1993, 100, 8);		
		
	}
	
	@Test (expected = Exception.class)
	public void mesInvalidoNegativo() throws Exception {
		
		LocalDate data = new LocalDate(1993, -10, 8);		
		
	}
	
	@Test (expected = Exception.class)
	public void diaInvalido() throws Exception {
		LocalDate data = new LocalDate(1993, 10, 32);		
	}
	
	@Test (expected = Exception.class)
	public void diaInvalidoNegativo() throws Exception {
		LocalDate data = new LocalDate(1993, 10, -3);		
	}
	
	@Test (expected = Exception.class)
	public void horaInvalida() throws Exception {
		
		LocalTime horario = new LocalTime(25, 59);
		
	}
	
	@Test (expected = Exception.class)
	public void horaInvalidaMegativa() throws Exception {
		
		LocalTime horario = new LocalTime(-20, 59);
		
	}
	
	@Test (expected = Exception.class)
	public void minutoInvalido() throws Exception {
		
		LocalTime horario = new LocalTime(20, 62);
		
	}
	
	@Test (expected = Exception.class)
	public void minutoInvalidoMegativo() throws Exception {
		
		LocalTime horario = new LocalTime(20, -59);
		
	}
	
	@Test
	public void somarData() throws Exception {
		
		LocalDate data = new LocalDate(2017, 2, 28);
		//data = data.plusDays(1);
		
		//System.out.println(data);
		
		assertEquals(3,  data.plusDays(1).getMonthOfYear());
		assertEquals(1,  data.plusDays(1).getDayOfMonth());
	}
	
}

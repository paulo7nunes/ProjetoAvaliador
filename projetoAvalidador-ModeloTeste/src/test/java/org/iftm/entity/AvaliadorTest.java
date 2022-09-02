package org.iftm.entity;

import org.iftm.entities.Avaliador;
import org.iftm.entities.Leilao;
import org.iftm.entities.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AvaliadorTest {
	private Usuario usuario1;
	private Usuario usuario2;
	private Usuario usuario3;
	private Usuario usuario4;
	private Leilao leilao;
	private Avaliador avaliador;
	
	@BeforeEach
	public void instanciarObjetos() {
		
	}
	
	@Test
	public void meuPrimeiroTeste() {
		usuario1 = new Usuario("Shirley");
		usuario1 = new Usuario("Edna");
		usuario1 = new Usuario("Cristina");
		usuario1 = new Usuario("Laiane");
	}
	

}

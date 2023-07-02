package testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.ProdutoDao;
import modelo.Categoria;
import modelo.Produto;
import util.JPAUtil;

public class CadastroDeProduto {
	public static void main(String[] args) {
		Produto celular = new Produto("xiaomi redmi", "muito legal", new BigDecimal("800"), Categoria.CELULARES);
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);
		
		em.getTransaction().begin();
		dao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();

	} 

}

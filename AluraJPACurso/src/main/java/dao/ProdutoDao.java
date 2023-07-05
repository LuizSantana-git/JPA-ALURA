package dao;

import java.util.List;

import javax.persistence.EntityManager;

import modelo.Produto;

public class ProdutoDao {
	
	// DAO = Data Access Object;

	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		super();
		this.em = em;
	}

	public void cadastrar(Produto produto) {
		this.em.persist(produto);
	}
	
	public Produto buscarPorId(Long Id) {
		return em.find(Produto.class, Id);
	}
	
	public List<Produto> buscarTodos(){
		String JPQL = "select p from Produto p";
		return em.createQuery(JPQL, Produto.class).getResultList();
	}
}

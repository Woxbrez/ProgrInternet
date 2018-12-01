package br.com.ProgrInternet;

import br.com.model.util.HibernateUtil;

public class GeraTabela {
	public static void main(String[] args) {
		try {
			HibernateUtil.getSessionFactory();
			HibernateUtil.getSessionFactory().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

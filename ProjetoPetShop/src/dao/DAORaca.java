package dao;

import java.util.List;
import com.db4o.query.Query;
import modelo.Raca;

public class DAORaca extends DAO<Raca>{
	//Leitura POR nome 
	public Raca read (Object chave) {
		String nome = (String) chave;
		Query q = manager.query();
		q.constrain(Raca.class);
		q.descend("nome").constrain(nome);
		List<Raca> resultados = q.execute();
		if (resultados.size()>0)
			return resultados.get(0);
		else
			return null;
	}
}


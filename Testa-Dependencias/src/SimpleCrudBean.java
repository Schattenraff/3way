import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.LivroDao;
import model.Livro;

@ManagedBean
@SessionScoped
public class SimpleCrudBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Livro> list;

	LivroDao dao = new LivroDao();

	@PostConstruct
	public void init() {
		list = dao.consultar("");
	}

	public List<Livro> getList() {
		return list;
	}

	public void setList(List<Livro> list) {
		this.list = list;
	}

}

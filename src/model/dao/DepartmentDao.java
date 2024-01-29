package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	/*responsavel por inserir no banco de dados,
	este objeto a ser enviado como parametro de entrada 
	 */
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	/*operação responsavel por pegar o id e consultar
	 * no banco de dados o objeto com este id, se existir vai retornar 
	 * se nao existir vai retornar nulo
	 */
	Department findById(Integer id);
	//lista para retornar todos os departamentos 
	List<Department> findAll();
}
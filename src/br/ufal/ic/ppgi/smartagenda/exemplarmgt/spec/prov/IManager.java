package br.ufal.ic.ppgi.smartagenda.exemplarmgt.spec.prov;

import java.util.List;

public interface IManager {
	/**
	 * Lista as interfaces providas pelo componente
	 * 
	 * @return
	 */
	public List<String> getProvidedInterfaces();

	/**
	 * Lista as interaces requeridas pelo componente
	 * 
	 * @return
	 */
	public List<String> getRequiredInterfaces();

	/**
	 * Retorna a interface provida pelo componente informada no parametro
	 * 
	 * @param interfaceName
	 * @return
	 */
	public Object getProvideInterface(String interfaceName);

	/**
	 * Retorna uma interface requerida pelo componente informada no parametro
	 * 
	 * @param interfaceName
	 * @return
	 */
	public Object getRequiredInterface(String interfaceName);

	/**
	 * Associa uma interface requerida a um dado objeto facade, provido por outro
	 * componente.
	 * 
	 * @param interfaceName
	 * @param facade
	 */
	public void setRequiredInterface(String interfaceName, Object facade);

}

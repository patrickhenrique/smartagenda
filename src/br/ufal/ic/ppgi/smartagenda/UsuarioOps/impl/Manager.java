package br.ufal.ic.ppgi.smartagenda.UsuarioOps.impl;

import java.util.HashMap;
import java.util.Set;

import br.ufal.ic.ppgi.smartagenda.Usuariomgt.spec.prov.IManager;

/**
 * realiza a interface IManager, utilizada para integrar instâncias de
 * componentes dentro de uma composição de software
 * 
 * @author Glevson
 *
 */
class Manager implements IManager {
	private HashMap<String, Object> providedInterfaces;
	private HashMap<String, Object> requiredInterfaces;

	// No construtor faz a adição da listagem de interfaces providas e requeridas
	Manager() {
		this.providedInterfaces = new HashMap<>();
		this.requiredInterfaces = new HashMap<>();
		// add interfaces
		this.providedInterfaces.put("IUsuario", new FacadeUsuarioController(this));
		this.requiredInterfaces.put("IItemMgt", null);
		this.requiredInterfaces.put("IPersistenceReq", null);
		this.requiredInterfaces.put("IUsuarioMgt", null);
	}

	/**
	 * Lista as interfaces providas pelo componente
	 * 
	 * @return
	 */
	@Override
	public Set<String> getProvidedInterfaces() {
		return this.providedInterfaces.keySet();
	}

	/**
	 * Lista as interaces requeridas pelo componente
	 * 
	 * @return
	 */
	@Override
	public Set<String> getRequiredInterfaces() {
		return this.requiredInterfaces.keySet();
	}

	/**
	 * Retorna a interface provida pelo componente informada no parametro
	 * 
	 * @param interfaceName
	 * @return
	 */
	@Override
	public Object getProvidedInterface(String interfaceName) {
		return this.providedInterfaces.get(interfaceName);
	}

	/**
	 * Associa uma interface requerida a um dado objeto facade, provido por outro
	 * componente.
	 * 
	 * @param interfaceName
	 * @param facade
	 */

	@Override
	public void setRequiredInterface(String interfaceName, Object interfaceObject) {
		this.requiredInterfaces.put(interfaceName, interfaceObject);
	}

	/**
	 * Retorna uma interface requerida pelo componente informada no parametro
	 * 
	 * @param interfaceName
	 * @return
	 */
	@Override
	public Object getRequiredInterface(String interfaceName) {
		return this.requiredInterfaces.get(interfaceName);
	}
}

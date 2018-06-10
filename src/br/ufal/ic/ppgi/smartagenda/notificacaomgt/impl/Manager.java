package br.ufal.ic.ppgi.smartagenda.notificacaomgt.impl;

import java.util.HashMap;
import java.util.Set;

import br.ufal.ic.ppgi.smartagenda.notificacaomgt.spec.prov.IManager;

class Manager implements IManager {

	private HashMap<String, Object> providedInterfaces;
	private HashMap<String, Object> requiredInterfaces;
	
	//CONSTRUCTOR
	Manager() {
		this.providedInterfaces = new HashMap<String, Object>();
		this.requiredInterfaces = new HashMap<String, Object>();

		//atribuição de interfaces providas
		this.providedInterfaces.put("INotificacaoMgt", new FacadeNotificacaoMgt(this));
					
	}
	

	public Set<String> getProvidedInterfaces() {
		return this.providedInterfaces.keySet();
	}

	public Set<String> getRequiredInterfaces() {
		return this.requiredInterfaces.keySet();
	}

	
	public Object getProvidedInterface(String interfaceName) {
		return this.providedInterfaces.get(interfaceName);
	}

	public void setRequiredInterface(String interfaceName, Object interfaceObject) {
		this.requiredInterfaces.put(interfaceName, interfaceObject);
	}
	
	public Object getRequiredInterface(String interfaceName) {
		return this.requiredInterfaces.get(interfaceName);
	}
	
	
}

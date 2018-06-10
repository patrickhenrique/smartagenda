package br.ufal.notificacoesops.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import br.ufal.notificacoesops.spec.prov.IManager;

class Manager implements IManager {

	private HashMap<String, Object> providedInterfaces;
	private HashMap<String, Object> requiredInterfaces;
	
	//CONSTRUCTOR
	Manager() {
		this.providedInterfaces = new HashMap();
		this.requiredInterfaces = new HashMap();

		//atribuição de interfaces providas
		this.providedInterfaces.put("INotificacaoOps", new FacadeNotificacao(this));
		
		//TODO
		//atribuição de interfaces requeridas
		this.requiredInterfaces.put("ILimiteOps", null);
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

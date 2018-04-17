package br.ufal.ic.ppgi.smartagenda.reservamgt.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IManager;
import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IManager.Interfaces.*;

class Manager implements IManager {
	
	private Map<String, Object> requiredInterface;
	private Map<String, Object> provideInterface;

	public Manager() {
		//REQUIRED INTERFACES
		this.requiredInterface = new HashMap<>();		
		this.requiredInterface.put(Interfaces.Required.IExemplarReq.name(), null);
		this.requiredInterface.put(Interfaces.Required.IOperacoesDAOReq.name(), null);
		
		//PROVIDED INTERFACES
		this.provideInterface = new HashMap<>();
		this.provideInterface.put(Interfaces.Provided.IReservaMgt.name(), new FacadeReservaMgt(this));
		
	}
	
	public Set<String> getProvidedInterfaces() {
		return this.provideInterface.keySet();
	}

	public Set<String> getRequiredInterfaces() {
		return this.requiredInterface.keySet();
	}

	public Object getProvidedInterface(String interfaceName) {
		return this.provideInterface.get(interfaceName);
	}
	
	public Object getProvidedInterface(Provided interfaces){
		return this.provideInterface.get(interfaces.name());
	}

	public Object getRequiredInterface(String interfaceName) {
		return this.requiredInterface.get(interfaceName);
	}
	
	public Object getRequiredInterface(Required interfaces) {
		return this.requiredInterface.get(interfaces.name());
	}

	public void setRequiredInterface(String interfaceName, Object objeto) {
		this.requiredInterface.put(interfaceName, objeto);
	}
	
	public void setRequiredInterface(Required interfaces, Object objeto) {
		this.requiredInterface.put(interfaces.name(), objeto);
	}
	
}

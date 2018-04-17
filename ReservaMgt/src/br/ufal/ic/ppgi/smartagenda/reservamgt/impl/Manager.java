package br.ufal.ic.ppgi.smartagenda.reservamgt.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IManager;

class Manager implements IManager {
	
	private Map<String, Object> requiredInterface;
	private Map<String, Object> provideInterface;

	public Manager() {
		//REQUIRED INTERFACES
		this.requiredInterface = new HashMap<>();		
		this.requiredInterface.put(Interfaces.Required.IExemplarReq.name(), null);
		
		//PROVIDED INTERFACES
		this.provideInterface = new HashMap<>();
		this.provideInterface.put(Interfaces.Provided.IReservaMgtProv.name(), new FacadeReservaMgt(this));
		
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

	public Object getRequiredInterface(String interfaceName) {
		return this.requiredInterface.get(interfaceName);
	}

	public void setRequiredInterface(String interfaceName, Object objeto) {
		this.requiredInterface.put(interfaceName, objeto);
	}
	
}

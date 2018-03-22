package br.ic.ufal.ppgi.smartagenda.itemOps.spec.prov;

import java.util.List;

public interface IManager {

	
	public List<String> getRequiredInterfaces();
	public List<String> getProvidedInterfaces();
	public Object getRequiredInterface(String name);
	public Object getProvidedInterface(String name);
	public void setRequiredInterface(String name, Object object);
	
}

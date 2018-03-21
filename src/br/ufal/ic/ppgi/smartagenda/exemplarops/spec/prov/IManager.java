package br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov;

import java.util.List;

public interface IManager {
	
	public List<String> getProvidedInterfaces();
	public List<String> getRequiredInterfaces();
	public Object getProvideInterface(String interfaceName);
	public Object getRequiredInterface(String interfaceName);
	public Object setRequiredInterface(String interfaceName,Object objeto);

}

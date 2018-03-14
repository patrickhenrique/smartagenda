package br.ufal.ic.ppgi.smartagenda.bloqueioMgt.spec.prov;

import java.util.List;

public interface IManager {
	
	public List<String> getProvidedInterfaces();
	public List<String> getRequiredInterfaces();
	public Object getProvidedInterfaces(String interfaceName);
	public Object getRequiredInterfaces(String interfaceName);
	public void setRequiredInterface(String interfaceName, Object objeto);
	
}

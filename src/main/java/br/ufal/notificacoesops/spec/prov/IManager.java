package br.ufal.notificacoesops.spec.prov;

import java.util.List;

public interface IManager {
	
	public List<String> getProvidedInterfaces();
	public List<String> getRequiredInterfaces();
	public Object getProvidedInterface(String interfaceName);
	public Object getRequiredInterface(String interfaceName);
	public void setRequiredInterface(String interfaceName, Object obj);


}

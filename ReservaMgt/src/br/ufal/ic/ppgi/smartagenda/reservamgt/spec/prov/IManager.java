package br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov;

import java.util.Set;

import br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov.IManager.Interfaces.*;

public interface IManager {
	public Set<String> getProvidedInterfaces();
	public Set<String> getRequiredInterfaces();

	public Object getProvidedInterface(String interfaceName);
	public Object getProvidedInterface(Provided interfaces);
	public Object getRequiredInterface(String interfaceName);
	public Object getRequiredInterface(Required interfaces);

	public void setRequiredInterface(String interfaceName, Object objeto);
	public void setRequiredInterface(Required interfaces, Object objeto);
	
	public static class Interfaces {
		public enum Provided {
			IReservaMgt
		}		
		public enum Required {
			IExemplarReq, IOperacoesDAOReq
		}
	}
}

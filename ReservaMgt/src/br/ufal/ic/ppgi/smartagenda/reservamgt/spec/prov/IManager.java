package br.ufal.ic.ppgi.smartagenda.reservamgt.spec.prov;

import java.util.Set;

public interface IManager {
	public Set<String> getProvidedInterfaces();
	public Set<String> getRequiredInterfaces();

	public Object getProvidedInterface(String interfaceName);
	public Object getRequiredInterface(String interfaceName);

	public void setRequiredInterface(String interfaceName, Object objeto);

	public static class Interfaces {
		public enum Provided {
			IReservaMgtProv
		}		
		public enum Required {
			IExemplarReq
		}
	}
}

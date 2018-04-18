package br.ufal.ic.ppgi.smartagenda.exemplarmgt.impl;

import java.util.List;

import br.ufal.ic.ppgi.smartagenda.exemplarops.spec.prov.IManager;

/**
 * @desc Realiza a interface IManager, utilizada para integrar instâncias de
 * componentes dentro de uma composição de software
 * 
 * @author João Miguel e Edival Junior
 *
 */
class Manager implements IManager {

	@Override
	public List<String> getProvidedInterfaces() {

		return null;
	}

	@Override
	public List<String> getRequiredInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getProvideInterface(String interfaceName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getRequiredInterface(String interfaceName) {
		return null;
	}

	@Override
	public Object setRequiredInterface(String interfaceName, Object objeto) {
		// TODO Auto-generated method stub
		return null;
	}

}

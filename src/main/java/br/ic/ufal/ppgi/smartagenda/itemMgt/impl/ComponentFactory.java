package br.ic.ufal.ppgi.smartagenda.itemMgt.impl;

import br.ic.ufal.ppgi.smartagenda.itemMgt.spec.prov.IManager;

public class ComponentFactory {

    private ComponentFactory(){
        super();
    }

    public static IManager createInstance(){
        return new Manager();
    }

}

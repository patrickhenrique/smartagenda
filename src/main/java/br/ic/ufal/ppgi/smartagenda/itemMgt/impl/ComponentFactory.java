package br.ic.ufal.ppgi.smartagenda.itemMgt.impl;

public class ComponentFactory {

    private ComponentFactory(){
        super();
    }

    public static Manager createInstance(){
        return new Manager();
    }

}

package com.wha.dao;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDao<T> {
    Connection connect = Database.getInstance();

    /**
     * Permet de r�cup�rer un objet via son id
     * @param id int
     * @return Object
     */
    T find(int id);

    /**
     * Permet de cr�er une entr�e en base de donn�es par rapport � un objet
     * @param object Object
     */
    T create(T object);

    /**
     * Permet de mettre � jour les donn�es d'une entr�e dans la base
     * @param obj Object
     */
    T update(T obj);

    /**
     * Permet la suppression d'une entr�e de la base
     * @param obj Object
     */
    void delete(T obj);

    /**
     * Permet la r�cup�ration de la liste des objets
     * @return Object
     */
    ArrayList<T> findAll();
}

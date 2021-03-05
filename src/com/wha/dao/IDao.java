package com.wha.dao;

import java.sql.Connection;
import java.util.ArrayList;

public interface IDao<T> {
    Connection connect = Database.getInstance();

    /**
     * Permet de récupérer un objet via son id
     * @param id int
     * @return Object
     */
    T find(int id);

    /**
     * Permet de créer une entrée en base de données par rapport à un objet
     * @param object Object
     */
    T create(T object);

    /**
     * Permet de mettre à jour les données d'une entrée dans la base
     * @param obj Object
     */
    T update(T obj);

    /**
     * Permet la suppression d'une entrée de la base
     * @param obj Object
     */
    void delete(T obj);

    /**
     * Permet la récupération de la liste des objets
     * @return Object
     */
    ArrayList<T> findAll();
}

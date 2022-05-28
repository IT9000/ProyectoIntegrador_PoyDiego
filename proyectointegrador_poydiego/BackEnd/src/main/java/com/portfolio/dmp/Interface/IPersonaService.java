/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.dmp.Interface;

import com.portfolio.dmp.Entity.Persona;
import java.util.List;

/**
 *
 * @author HP-Laptop
 */
public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto buscado por ID (Tipo de dato/nombre de campo)
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}


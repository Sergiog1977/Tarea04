/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * PROG04_Tarea para Entornos de Desarrollo
 *  
 *  Creacion de la clase CCuenta que tendra los siguientes atributos: Nombre 
 *  (del propietario de la cuenta), número de cuenta, saldo de la cuenta y 
 *  tipo de interes perteneciente a una cuenta bancaria.
 *  Incluye los metodos estado, ingresar y retirar 
 *  @version 2.0
 *  
 * @author Kuze
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    
/** 
 * Metodo constructor por defecto
*/   
    public CCuenta()
    {
    }

/**
 * Metodo constructor con parametros
 * @param nom para Nombre del titular de la cuenta
 * @param cue para el número de cuenta
 * @param sal para el saldo de la cuenta
 * @param tipo para el tipo de interes de la cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    // Metodos
    
    /**
     * Metodo para devolver el saldo de la cuenta
     * @return Devuelve el saldo de la cuenta
     */    
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo para ingresar una cantidad a la cuenta
     * Comprueba que sea positiva
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    
    /**
     * Metodo para retirar una cantidad de dinero de la cuenta
     * Comprueba que sea una cantidad posotiva e inferior al saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    
    //Getter and Setter
	/**
	 * Metodo que devuelve el nombre del titular
	 * @return nombre del titular
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del titular
	 * @param nombre del titular
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que devuelve el numero que
	 * identifica a una cuenta bancaria
	 * @return cuenta, numero de la cuenta bancaria
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Establece el numero de cuenta
	 * @param cuenta, numero de la cuenta bancaria
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Metodo que devuelve el saldo
	 * @return saldo de la cuenta bancaria
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Establece el saldo de la cuenta
	 * @param saldo de la cuenta bancaria
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo que devuelve el tipo de interes de la cuenta
	 * @return tipoInteres que tiene una cuenta bancaria
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Establece el tipo de interes
	 * @param tipoInteres de una cuenta bancaria
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
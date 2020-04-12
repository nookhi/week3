/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;

import java.util.List;

import types.Sushi;

import java.rmi.RemoteException;

import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author dvoeg
 */
public class SushiOperationImpl extends UnicastRemoteObject implements SushiOperation {

    static List<Sushi> lstSushi = new ArrayList<Sushi>();

    public SushiOperationImpl() throws RemoteException {

    }

    @Override

    public List<Sushi> getListOfSushi() throws RemoteException {

        return lstSushi;

    }

    @Override

    public List<Sushi> addNewSushi(Sushi item) throws RemoteException {

        lstSushi.add(item);

        return lstSushi;

    }

    @Override

    public int getSumOfSushi() throws RemoteException {

        int sum = 0;

        for (Sushi sushi : lstSushi) {
            sum += sushi.getQuantity() * sushi.getPrice();
        }
        return sum;

    }
}

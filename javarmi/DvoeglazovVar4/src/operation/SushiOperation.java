/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.List;

import types.Sushi;

import java.rmi.Remote;

import java.rmi.RemoteException;
/**
 *
 * @author dvoeg
 */
public interface SushiOperation extends Remote{

List<Sushi> getListOfSushi() throws RemoteException;

List<Sushi> addNewSushi(Sushi item) throws RemoteException;

int getSumOfSushi() throws RemoteException;

}

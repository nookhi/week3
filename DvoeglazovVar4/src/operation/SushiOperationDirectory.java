/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.List;

import types.SushiDirectory;

import java.rmi.Remote;

import java.rmi.RemoteException;
/**
 *
 * @author dvoeg
 */
public interface SushiOperationDirectory extends Remote{

List<SushiDirectory> getListOfSushiDirectory() throws RemoteException;

List<SushiDirectory> addNewSushiDirectory(SushiDirectory item) throws RemoteException;

}
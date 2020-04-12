/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

/**
 *
 * @author dvoeg
 */
import java.rmi.registry.LocateRegistry;

import java.rmi.registry.Registry;

import operation.SushiOperationImpl;

import operation.SushiOperationDirectoryImpl;

public class RunServer {

    public static void main(String[] argv) {

        try {

// создание экземпляров классов для регистрации
            SushiOperationImpl operationImpl = new SushiOperationImpl();
            SushiOperationDirectoryImpl operationDirectoryImpl = new SushiOperationDirectoryImpl();
// создаём реестр
            Registry registry = LocateRegistry.createRegistry(1199);
// регистрация классов
            registry.bind("rmiTest02", operationImpl);
            registry.bind("rmiTest01", operationDirectoryImpl);
            
            System.out.println("Server is ready.");

        } catch (Exception e) {

            System.out.println("Server failed: " + e);

        }

    }

}

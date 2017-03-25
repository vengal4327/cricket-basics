package com.pattern.singleton;


/**
 * This is a sample code written to understand Singleton pattern
 * @author vengal
 *
 */
public class SingletonImpl {
	private SingletonImpl instance=null;
	
     private SingletonImpl(){
    	 
     }
     public SingletonImpl getInstance(){
    	 if(instance==null){
    		 synchronized (SingletonImpl.class) {
				if(instance==null){
					instance = new SingletonImpl();
				}
			}
    	 }
    	 return instance;
     }
}

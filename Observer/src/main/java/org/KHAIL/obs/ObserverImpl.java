package org.KHAIL.obs;

public class ObserverImpl implements Observer {
    @Override
    public void update(int newState) {
     System.out.println("New Observer state: " + newState);
    }
}

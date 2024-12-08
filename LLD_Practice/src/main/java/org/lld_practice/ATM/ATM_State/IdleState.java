package org.lld_practice.ATM.ATM_State;

public class IdleState extends ATMState{
    @Override
    public void insertCard() {
        System.out.println("Inserting card!");
    }
}

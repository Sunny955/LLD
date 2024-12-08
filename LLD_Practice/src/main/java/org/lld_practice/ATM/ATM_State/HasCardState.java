package org.lld_practice.ATM.ATM_State;

public class HasCardState extends ATMState{
    @Override
    public void returnCard() {
        System.out.println("Return card from Hascard state!");
    }

    @Override
    public void exit() {
        System.out.println("Exit from HasCard state!");
    }

    @Override
    public void authenticatePin() {
        System.out.println("Authenticating pin!");
    }
}

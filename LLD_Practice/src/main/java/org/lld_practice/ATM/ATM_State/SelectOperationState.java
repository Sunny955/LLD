package org.lld_practice.ATM.ATM_State;

public class SelectOperationState extends ATMState{
    @Override
    public void returnCard() {
        System.out.println("Return card from SelectOperation!");
    }

    @Override
    public void exit() {
        System.out.println("Exit card from SelectOperation!");
    }

    @Override
    public void selectOperation() {
        System.out.println("Select operation on ATM!");
    }
}

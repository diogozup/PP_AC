/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implementation;

import order.base.IAddress;
import order.base.ICustomer;

/**
 * Nome: Diogo Sá Tinoco de Magalhães
 * Número: 8120336
 * Turma: turma1
 */
public class Customer extends Person implements ICustomer{

    private Address billingAddress;
    private int id;
    private static int customerCounter;


    public Customer(Address billingAddress, String name, Address address) {
        super(name, address);
        this.billingAddress = billingAddress;
        this.id = this.customerCounter;
        this.customerCounter++;
    }

    public Customer(String name, Address address) {
        super(name, address);
        this.billingAddress = address;
        this.id = this.customerCounter;
        this.customerCounter++;
        
    }

    
    
    @Override
    public IAddress getBillingAddress() {
        return this.billingAddress;
    }

    @Override
    public int getCustomerId() {
        return this.id;
    }

    @Override
    public void setBillingAddress(IAddress ia) {
        this.billingAddress = (Address) ia;
    }


}

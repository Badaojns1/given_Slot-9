/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thang
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
        super();
    }


    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }
    public void setData(){
        setMaker("XZ"+getMaker());
        setPrice(getPrice()+20);
    }
    public int getValue(){
        if(type<7) return getPrice()+10;
        else return getPrice()+15;
    }

    @Override
    public String toString() {
        
        return super.toString()+", "+type ;
    }
    
    
}

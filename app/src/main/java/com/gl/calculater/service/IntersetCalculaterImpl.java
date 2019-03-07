package com.gl.calculater.service;

import com.gl.calculater.service.iservice.IIntersetCalculater;

public class IntersetCalculaterImpl implements IIntersetCalculater {

    public Double simpleAmountCalculater(Double amount,Double interset,Double year){

        Double simpleInterset=(amount*interset*year)/100;

        return  simpleInterset;
    }


    public Double compountIntersetCalculater(Double amount,Double interset,Double year){
        Double compountInterset=amount*Math.pow((1+interset/100),year);

        return  compountInterset;
    }


}

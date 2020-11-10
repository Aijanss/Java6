package com.company;

 class Multiply< T extends Number>  implements Count{

     @Override
    public Double multiplyNumbers(Number firstT,  Number secondS) {
        return (firstT.doubleValue()* secondS.doubleValue());
    }
}

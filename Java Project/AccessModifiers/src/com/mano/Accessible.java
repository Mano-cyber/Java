package com.mano;

interface Accessible {//challenge which is visable ??//Accessaible to all classes without public or private
    int SOME_CONSTANT = 100;    // set to public
    public void methodA();  // public
    void methodB();// all methods are public
    boolean methodC();// there public because they are an interface
}

package day43_Garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void AbstractMethod();
    /*
    Abstract methodlar child classlarin MUTLAKA override etmesi gereken methodlardir
    dolayısıyla HİCBİRZAMAN direkt calistirilmazlar ve bu sebeple method body sine ihiyac yoktur

    bir classin veya methodun abstarct olup olmadigini anlayabilir miyiz?
    -Abstract yaziyorsa abstarctir yazmiyorsa degildir
    (abstract olmayan classlara "concrete" class/method denir)

    Abstract methodlar body ye sahip olamaz concrete methodlar ise method body si olmadan olusturulamaz
     */
}

package org.KHAIL;

public class Context {
    private Strategy strategy;
    public Strategy setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return strategy;
    }

    public void perform(){
                System.out.println("=====> Debut de loperation");
                System.out.println("=====> Initialisation du strategy");
                System.out.println("=====> Noyau du strategy ");
                System.out.println("=====> Netoyage");
                /*if(stratgy == 1){
                    System.out.println("=====> Stratgy 1");
                }else if(stratgy == 2){
                    System.out.println("*****> Stratgy 2");
                }else if(stratgy == 3){
                    System.out.println("''''''> Stratgy 3");
                }else if(stratgy == 4){
                    System.out.println("§§§§§> Stratgy 4");
                }*/
                strategy.apply();

    }
}

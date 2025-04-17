package basic.ch06.sec08.exam03;

public class Car {
    int gas;

    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isSeftGas() {
        if(gas==0){
            System.out.println("gas가 없습니다.");
            return false;
        } else {
            System.out.println("gas를 주입하세요.");
            return true;
        }
    }

    void run() {
        System.out.println("출발합니다.");
        while(true) {
            this.gas--;
            if(gas>0) {
                System.out.println("달립니다.(gas잔량: "+this.gas+")");
            } else {
                System.out.println("멈춥니다.(gas잔량: "+this.gas+")");
                break;
            }
        }
    }
}


enum TrafficLightColor{
    RED, GREEN, YELLOW
}

class TrafficLightSimulator {
    TrafficLightColor color = TrafficLightColor.RED;
    public void changeColor(){
        switch (color){
            case RED:
                color = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                color = TrafficLightColor.RED;
                break;
            case GREEN:
                color = TrafficLightColor.YELLOW;
                break;
        }
    }
    public String toString() {return " " + color;}
}



public class TrafficLightDemo{

    public static void main(String[] args) {
        TrafficLightSimulator s1 = new TrafficLightSimulator();
        for (int i=0; i < 9; i++){
            System.out.println(s1);
            s1.changeColor();
        }
    }
}
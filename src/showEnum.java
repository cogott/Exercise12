enum ShapeType{
    SQUARE,RECTANGLE,CIRCLE, TRAPEZIUM,RHOMBUS,TRIANGLE,OVAL,HEXAGON
}

public class showEnum {
    public static void main(String[] args) {
        for(ShapeType s : ShapeType.values())
            System.out.println(s + " has an ordinal value" + s.ordinal());
    }
}

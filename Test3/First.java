package Test3;
class Rectangle {
    
    double length;
    double width;
    public void setRectangle(double x, double y){
      length = x;
      width = y;
    }
    public double getArea(){
        return (length*width);
    }
}

class Box extends Rectangle{
    
    double height;
    
    public void setBox(double x, double y, double z){
        length = x;
        width =y;
        height =z;
    }
    
    public double getVolume(){
        return (length*width*height);
    }
    
    
    
    public static void main(String[] args) {
        Box b = new Box();
        b.setBox(2,3,4);
        b.setRectangle(5,10);
        System.out.println(b.getVolume());
        System.out.println(b.getArea());
    }
}
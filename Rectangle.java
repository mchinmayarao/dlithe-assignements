public class Rectangle {
    private float length;
    private float width;

   
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    
    

    /**
     * @return float return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * @return float return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    double getArea(){
        return length*width;
    }

    double getPerimeter(){
        return 2*(length + width);
    }




    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    

}

package shape;

public class ShapeObject {
        private String color = "green";
        private Boolean filled = true;

        public ShapeObject() {
        }

        public ShapeObject(String color , boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return this.filled;
        }

        @Override
    public String toString() {
            return "A Shape with color of "+ getColor() +" and " +(isFilled() ? " filled " : "Not filled");
        }

}

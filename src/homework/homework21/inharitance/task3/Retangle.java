package homework21.inharitance.task3;


    class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            double areaRetangle = width * height;
            return areaRetangle;
        }
    }


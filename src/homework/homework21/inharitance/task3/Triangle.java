package homework21.inharitance.task3;


    class Triangle extends Shape {
        private double base;
        private double height;

        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            double areaTriangle = (base * height)/2;
            return areaTriangle;
        }
    }


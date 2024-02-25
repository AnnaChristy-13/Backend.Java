package homework21.inharitance.task3;


    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    '}';
        }
            @Override
            public double calculateArea() {
            double areaCircle = radius*radius*Math.PI;
            return areaCircle;
        }

    }


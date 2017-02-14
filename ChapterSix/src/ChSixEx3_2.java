/**
 * Created by Matthew on 2/7/2017.
 */
    // This class represents the RoomDimension
    public class ChSixEx3_2
    {
        private double length, width;

        public double getLength()
        {
            return length;
        }
        public void setLength(double length)
        {
            this.length = length;
        }

        public double getWidth()
        {
            return width;
        }
        public void setWidth(double width)
        {
            this.width = width;
        }

        public ChSixEx3_2(double len, double w)
        {
            this.setLength(len);
            this.setWidth(w);
        }

        public double getArea()
        {
            return this.getLength() * this.getWidth();
        }

        @Override
        public String toString()
        {
            return "";
        }
    }

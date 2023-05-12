class rectangle{
    public double length;
        public double breath;
        
        
        public double area()
        {
            return length*breath;
        }
        public double perimeter()
        {
            return 2*(length+breath);
        }
        public boolean issquare()
        {
            if (length==breath)
            return true;
            else
            return false;
        }
    
    }
    
    public class ClassandObject1 {
        public static void main (String[]args) {
    
        rectangle r1=new rectangle();
        r1.length=2;
        r1.breath=2;
      
        System.out.println("area:"+r1.area());
        System.out.println("perimeter:"+r1.perimeter());
        System.out.println("issquare:"+r1.issquare());
        
    }
    }
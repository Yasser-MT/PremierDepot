public class calculatrice {
        public double addition(double a,double b){
            return a+b;
        }
        public double soustraction(double a,double b){
            return a-b;
        }
        public double multiplication(double a,double b){
            return a*b;
        }
        public double division(double a,double b){
            if (b!=0){
                return a+b;
            } 
            else{
                return 0;
            }  
        }
        public boolean testeur(double b){
            if(b==0){
                return false;
            }
            else{
                return true;
            }
        }
}

package modelo;


public class Model {
    
    private float base,altura,a,p;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }
    
     public float area(int tipo){
        if(tipo==1){
           a=base*base; 
        }else if(tipo==2){
            a=base*altura;
        }else if(tipo==3){
            a=(base*altura)/2;
        }
         
        return a;
     }
     
     public float perimetro(int tipo){
         if(tipo==1){
             p=base*4;
         }else if(tipo==2){
             p=(base*2)+(altura*2);
         }else if(tipo==3){
             p=base*3;
         }
         return p;
     }
    
    
}

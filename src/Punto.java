public class Punto {
    private double x;
    private double y;
    public Punto (double x, double y){
        this.x=x;
        this.y=y;
    }
    public Punto(double x){
        this.x=x;
        y=x;
    }
    public Punto(){
        x=0;
        y=0;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setXY(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getRho(){
        double somma;
        somma=Math.sqrt(Math.pow(getX(),2)+Math.pow(getY(),2));
        return somma;
    }
    public Punto puntoMedio(Punto p){
        double xMedio=(this.x+p.getX())/2;
        double yMedio=(this.y+p.getY())/2;
        return new Punto(xMedio,yMedio);
        }
    }